package com.icix.functionality;
import com.icix.browserinstance.CommonLocators;
import com.icix.browserinstance.CommonMethods;
import static com.codeborne.selenide.Selenide.$;

public class TwoActorRequestLogics {

	// This method is for open Requests page by clicking on Request Tab
	public static void openReqPage() throws Exception {
		boolean displayed = $(CommonLocators.requestTab).isDisplayed();
		if (displayed == true) {
			CommonMethods.clickOnReqTab();
		} else {
			CommonMethods.openAppLauncher();
		}

	}

}
