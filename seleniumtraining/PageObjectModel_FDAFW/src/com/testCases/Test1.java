package com.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageFactory.CommonWebElements;
import com.pageFactory.HomePage;
import com.pageFactory.ListofBooksPage;

public class Test1 extends CommonWebElements {
	
	@Test
	public void testCase1() throws Throwable {
		
		//OpenBrowser();
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		//CommonWebElements commonWebElements = PageFactory.initElements(driver,CommonWebElements.class);
		ListofBooksPage listofBooksPage = PageFactory.initElements(driver,ListofBooksPage.class);
		homePage.clickonTodaysDeal();
		listofBooksPage.selectcheckbox("books");
		listofBooksPage.clickonAddToCart();
		listofBooksPage.verifySuccessmsg();
		logger.info("..........Test1 is Completed.............");
		
		//CloseBrowser();
		assertAll();
		
		
		
		
	}

}
