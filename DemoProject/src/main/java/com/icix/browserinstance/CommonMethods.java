package com.icix.browserinstance;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.codeborne.selenide.WebDriverRunner;
import com.icix.productpage.TwoActorRequestLocators;

// This class holding the common waits and methods for throughout the framework
public class CommonMethods {
	public static final long WAIT_VALUE = 90000;

	public static void waitForElementToBeClickable(By element) throws Exception {
		try {
			WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), (WAIT_VALUE));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			System.out.println("Element is not visible");
		}

	}

	public static void waitForElementToBeVisible(By element) throws Exception {
		try {
			WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), (WAIT_VALUE));
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		} catch (Exception e) {
			System.out.println("Element is not visible");
		}
	}

	public static void switchIFrame() throws InterruptedException {
		WebDriverRunner.getWebDriver().switchTo().defaultContent();
        WebElement element = $(".active.oneContent").$("iframe").waitUntil(visible, WAIT_VALUE);
        sleep(5000);
        WebDriverRunner.getWebDriver().switchTo().frame(element);
    }
     
	public static void clickOnReqTab() throws Exception
	{
		waitForElementToBeClickable(CommonLocators.requestTab);
		$(CommonLocators.requestTab).click();
	}
	
	public static void openAppLauncher() throws Exception
	{
		waitForElementToBeClickable(CommonLocators.appLauncherBtn);
		$(CommonLocators.appLauncherBtn).click();
		WebDriverRunner.getWebDriver().switchTo().defaultContent();
		waitForElementToBeVisible(CommonLocators.appLauncherPopUp);
		waitForElementToBeVisible(CommonLocators.searchBaronAppLauncher);
		$(CommonLocators.searchBaronAppLauncher).setValue("Requets");
	}

}
