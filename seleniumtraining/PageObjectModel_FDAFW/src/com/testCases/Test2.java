package com.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageFactory.CommonWebElements;
import com.pageFactory.HomePage;

import com.pageFactory.ListofCameraPage;


public class Test2 extends CommonWebElements {
	
	@Test
	public void testCase2() throws Throwable {
		
		//OpenBrowser();
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		 
		ListofCameraPage listofCameraPage = PageFactory.initElements(driver,ListofCameraPage.class);
		homePage.clickonTodaysDeal();
		listofCameraPage.selectcheckbox("camera");
		listofCameraPage.clickonAddToCart();
		listofCameraPage.verifysucessmsg();
		logger.info("..........Test2 is Completed.............");
		
		//CloseBrowser();
		assertAll();
		
	}
	

}
