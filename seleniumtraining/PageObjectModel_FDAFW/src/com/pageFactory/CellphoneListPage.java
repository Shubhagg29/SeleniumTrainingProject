package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CellphoneListPage extends CommonWebElements {
	
	@FindBy(xpath = "//span[@id='100 dae8818b']")
	public WebElement AddToCart;

	@FindBy(xpath = "//div[@class='a-alert-content']")
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