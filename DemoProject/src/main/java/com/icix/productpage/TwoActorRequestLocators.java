package com.icix.productpage;

import org.openqa.selenium.By;

public class TwoActorRequestLocators {
	
	
    public static By newreqBtn = By.xpath("//div[@class='slds-truncate'][text()='New']");
    public static By reqName = By.xpath("//input[@id='requestName']");
    public static By tradingptnrName = By.xpath("//input[@placeholder='Select a Trading Partner']");
    public static By selectTP = By.xpath("//span[@class='clickable ng-binding']");
    public static By selectDocForm = By.xpath("//button[text()='Select Documents / Forms']");
    
}
