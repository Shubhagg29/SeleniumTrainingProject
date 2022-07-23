package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageFactory.CommonWebElements;
import com.pageFactory.HomePage;
import com.pageFactory.ListofItems;

import xls.ShineXlsReader;

public class Test123 extends CommonWebElements {
	
	@Test(dataProvider="getdata")
	public void testCase123(String checkbox, String addToCart) throws Throwable  {
		WebDriver driver = OpenBrowser();
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		CommonWebElements commonWebElements = PageFactory.initElements(driver, CommonWebElements.class);
		ListofItems listofItems = PageFactory.initElements(driver, ListofItems.class);
		homePage.clickonTodaysDeal();
		commonWebElements.selectcheckbox(checkbox);
		listofItems.clickonAddToCart(addToCart);
		listofItems.verifySuccessmsg();
		
		logger.info("...........The Test"+(++tc)+ " Completed............");
		driver.quit();
		assertAll();
		
	}
	
	
	
	@DataProvider(parallel=true)
	public Object[][] getdata(){
		ShineXlsReader xls=new ShineXlsReader("./src/com/excelFiles/TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int columnCount = xls.getColumnCount("Sheet1");
		Object obj[][]=new Object[rowCount-1][columnCount];
		for( int i=2;i<=rowCount;i++){
			for( int j=0;j<columnCount;j++){
				obj[i-2][j]=xls.getCellData("Sheet1", j, i);
			}
		}
		return obj;
	}
}
