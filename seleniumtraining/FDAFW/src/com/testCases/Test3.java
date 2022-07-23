package com.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageFactory.CommonWebElements;
import com.pageFactory.HomePage;
import com.pageFactory.ListofItems;

public class Test3 extends CommonWebElements {
 @Test
	public void testCase3() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		CommonWebElements commonWebElements = PageFactory.initElements(driver, CommonWebElements.class);
		ListofItems listofItems = PageFactory.initElements(driver, ListofItems.class);
		homePage.clickonTodaysDeal();
		commonWebElements.selectcheckbox("mobile");
		listofItems.clickonAddToCart("AddToCartForCellphone");
		listofItems.verifySuccessmsg();
		
		logger.info("...........The 3 Test Completed............");
		assertAll();
		
	}
}
