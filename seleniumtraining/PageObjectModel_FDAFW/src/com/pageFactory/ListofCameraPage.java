package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testBase.TestBase;

public class ListofCameraPage extends CommonWebElements {
	
	@FindBy(xpath = "//*[@id='100 d18d528f-announce']")
	public WebElement AddToCart;

	@FindBy(xpath = "/html/body/div[2]/div/div[4]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[8]/div[1]/div/div/div/div")
	public WebElement sucessmsg;

	public void clickonAddToCart() {
		AddToCart.click();
		logger.info("Clicked on add to Cart");
	}

	public void verifysucessmsg(){
		st.assertEquals(sucessmsg.getText(), "Added to Cart","Sucessmsg does not displayed...");
		logger.info("Verified Success message");
	}

}
