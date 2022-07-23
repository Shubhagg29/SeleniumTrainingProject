package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testBase.TestBase;

public class HomePage extends TestBase {
//WebElements + BusinessLogics
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[1]") 
	public WebElement TodaysDeal;
	
	public void clickonTodaysDeal() {
		
		TodaysDeal.click();
		logger.info("Clicked on Today's Deal");
		
	}

}
