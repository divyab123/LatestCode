package com.icix.browserinstance;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

public class BrowserInstance {
	//@Parameters({"Uname","Pswrd"})
	ReadTestData test1 = new ReadTestData();
	
	@BeforeTest
	public static void beforeTest() {
		
		open("https://login.salesforce.com");
		$(By.id("username")).waitUntil(Condition.visible, 90000).setValue(ReadTestData.vUsername);
		$(By.id("password")).waitUntil(Condition.visible, 90000).setValue(ReadTestData.vPassword);
		$(By.id("Login")).click();
		WebDriverRunner.getWebDriver().manage().window().maximize();
	}
}
