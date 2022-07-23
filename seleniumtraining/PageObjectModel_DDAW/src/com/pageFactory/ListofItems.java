package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListofItems extends CommonWebElements{
	@FindBy(xpath="//button[@id='100 12d44669-announce']")
	public WebElement AddtocartForBooks;
	
	@FindBy(xpath = "//button[@id='100 dd137d03-announce']")
	public WebElement AddToCartForCellphone;
	
	@FindBy(xpath = "//button[@id='100 d18d528f-announce']")
	public WebElement AddToCartForCamera;
	
	@FindBy(xpath="//div[@class='a-alert-content']")
	 public WebElement successmsg;	

	
	
	public void clickonAddToCart(String AddToCart) {
		if(AddToCart.equalsIgnoreCase("AddtocartForBooks")) {
			AddtocartForBooks.click();
			logger.info("Clicked on add to Cart");
			}
		else if(AddToCart.equalsIgnoreCase("AddToCartForCellphone")){
			AddToCartForCellphone.click();
			logger.info("click on AddToCart");
		}else if(AddToCart.equalsIgnoreCase("AddToCartForCamera")){
			AddToCartForCamera.click();
			logger.info("click on AddToCart");
		}
	}
	
   public void verifySuccessmsg() {
	 st.assertEquals(successmsg.getText(), "Added to Cart22", "Success msg does not dispalyed...");  
	 

	 logger.info("Verified Success message");
   }

}
