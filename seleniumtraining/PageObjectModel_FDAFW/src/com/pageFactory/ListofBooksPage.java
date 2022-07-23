package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ListofBooksPage extends CommonWebElements {
	
	@FindBy(xpath="//button[@id='100 12d44669-announce']")
	public WebElement Addtocart;
	
	@FindBy(xpath="//*[@id=\"100_dealView_0\"]/div/div[2]/div/div/div[8]/div[1]/div/div/div/div")
	 public WebElement successmsg;	

	
	
	public void clickonAddToCart() {
			Addtocart.click();
			logger.info("Clicked on add to Cart");
	}
	
   public void verifySuccessmsg() {
	 st.assertEquals(successmsg.getText(), "Added to Cart", "Success msg does not dispalyed...");  
	 
	 logger.info("Verified Success message");
   }
}
