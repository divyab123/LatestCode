package com.icix.browserinstance;

import org.openqa.selenium.By;

public class CommonLocators {
	public static By requestTab = By.xpath("//span[@class='slds-truncate'][text()='Requests']");
	public static By appLauncherBtn = By.xpath("//button[@class='slds-button']/div");
	public static By appLauncherPopUp = By.xpath("//div[@class='modal-container slds-modal__container']");
	public static By searchBaronAppLauncher = By.xpath("//input[@placeholder='Search apps or items...']");
	
}
