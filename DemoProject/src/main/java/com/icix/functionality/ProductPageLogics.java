package com.icix.functionality;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.Thread.sleep;
import com.codeborne.selenide.WebDriverRunner;
import com.icix.productpage.ProductPageLocators;
import com.icix.browserinstance.CommonMethods;

/*This class holding the logics of ICIX Product Creation
*/

public class ProductPageLogics {
	static CommonMethods commonLocators = new CommonMethods();

	// This method is for Open the ICIX Product Page
	public static void openPrdPage() throws Exception {
		commonLocators.waitForElementToBeClickable(ProductPageLocators.icixprdctPage);
		$(ProductPageLocators.icixprdctPage).click();
	}

	// This method is for getting the Title of ICIX Product Page
	public static String getTitle() {
		return $(ProductPageLocators.prdheading).getText();
	}

	// This method is for clicks on New button of ICIX Product Page
	public static void clickNewBtn() throws Exception {
		commonLocators.waitForElementToBeClickable(ProductPageLocators.newprdbtn);
		$(ProductPageLocators.newprdbtn).click();
	}

	// This method is for searching the Trading Partner for ICIX Product Page
	public static void searchTP() throws Exception {
		try {
			int size = $$(ProductPageLocators.frame).size();
			System.out.println("Size of frames " + size);
			WebDriverRunner.getWebDriver().switchTo().frame(0);
			commonLocators.waitForElementToBeVisible(ProductPageLocators.searchTPbox);
			$(ProductPageLocators.searchTPbox).setValue("QA Org 2 Automation Res Pkg Stg");
		} catch (Exception e) {
			System.out.println("Element not found");
		}
	}

	// This method selecting the TP name after searching the TP from elastic search
	public static void selectTPName() {
		try {
			sleep(4000);
			commonLocators.waitForElementToBeClickable(ProductPageLocators.selectTPName);
			$(ProductPageLocators.selectTPName).click();
		} catch (Exception e) {
			System.out.println("TP Name is not find/ clickable");
		}
	}
	
	// This method is for clicking on Search button after searching the TP
	public static void clickSearchBtn() throws Exception {
		commonLocators.waitForElementToBeClickable(ProductPageLocators.searchBtn);
		$(ProductPageLocators.searchBtn).click();
	}

	// This methods checks Search button is enable or not for TP search
	public static boolean enableSearchBtn() {
		return $(ProductPageLocators.searchBtn).isEnabled();
	}

	// Common method for Search and Select TP name
	public static void SelectTPName() throws Exception {
		searchTP();
		selectTPName();
	}
 
	//This method is for clicking on Create Product button
	public static void clickcreateProduct() {
		try {
			commonLocators.waitForElementToBeClickable(ProductPageLocators.createPrd);
			$(ProductPageLocators.createPrd).click();
		} catch (Exception e) {
			System.out.println("Create Product button is not visible/ clickable");
		}
	}

	// This method is for entering Product name in Product name input box
	public static void enterPrdName() {
		try {
			$(ProductPageLocators.prdName).setValue("Test");
		} catch (Exception e) {
			System.out.println("Product name Input box is not visible");
		}
	}

	// This method is for select product ID from ID picklist
	public static void selectID() throws Exception {
		commonLocators.waitForElementToBeVisible(ProductPageLocators.selectPrdID);
		$(ProductPageLocators.selectPrdID).selectOptionContainingText("ISBN");

	}

	// This method is for entering ID value in value input box
	public static void enterIDvalue() throws Exception {
		commonLocators.waitForElementToBeVisible(ProductPageLocators.enterID);
		$(ProductPageLocators.enterID).setValue("4547657");
	}

	// This method is for clicking on Next button of product form
	public static void clickNextBtn() throws Exception {
		commonLocators.waitForElementToBeVisible(ProductPageLocators.nextBtn);
		$(ProductPageLocators.nextBtn).click();
	}

	// This method is for searching TP at the time of product creation and select that TP
	public static void searchndclickTPforPrd() throws Exception {
		$(ProductPageLocators.searchTPforProductpage).setValue("QA Org 2 Automation Res Pkg Stg");
		sleep(6000);
		$(ProductPageLocators.selectTPnameforProductpage).click();
	}

	// This method is for selecting relationship type and status for particular product
	public static void selectRelatStausndType() throws Exception {
		sleep(5000);
		$(ProductPageLocators.selectrelatstatus).selectOptionContainingText("Active");
		commonLocators.waitForElementToBeVisible(ProductPageLocators.selectrelattype);
		$(ProductPageLocators.selectrelattype).selectOptionContainingText("Buy");
		commonLocators.waitForElementToBeClickable(ProductPageLocators.saveBtn);
		$(ProductPageLocators.saveBtn).click();
	}

	
	// Common method for creating the product
	public static void createProduct() throws Exception {
		clickcreateProduct();
		enterPrdName();
		selectID();
		enterIDvalue();
		clickNextBtn();
		searchndclickTPforPrd();
		selectRelatStausndType();
	}
}
