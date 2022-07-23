package com.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageFactory.CellphoneListPage;
import com.pageFactory.CommonWebElements;
import com.pageFactory.HomePage;
import com.pageFactory.ListofBooksPage;

public class Test3 extends CommonWebElements {
	
	@Test
	public void testCase3() throws Throwable {
		
		//OpenBrowser();
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		//CommonWebElements commonWebElements = PageFactory.initElements(driver,CommonWebElements.class);
		
		CellphoneListPage cellphoneListPage = PageFactory.initElements(driver,CellphoneListPage.class);
		homePage.clickonTodaysDeal();
	
		cellphoneListPage.selectcheckbox("mobile");
		cellphoneListPage.clickonAddToCart();
		cellphoneListPage.verifysucessmsg();
		logger.info("..........Test1 is Completed.............");
		
		//CloseBrowser();
		assertAll();
		
		
		
		
	}

}
