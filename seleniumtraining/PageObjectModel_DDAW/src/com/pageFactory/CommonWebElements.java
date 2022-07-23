package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testBase.TestBase;

public class CommonWebElements extends TestBase {

	@FindBy(xpath = "//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[6]/div/label/span")
	public WebElement books;

	@FindBy(xpath = "//span[@class='a-label a-checkbox-label'][contains(text(),'Camera & Photo')]")
	public WebElement camera;

	@FindBy(xpath = "//span[@class='a-label a-checkbox-label'][contains(text(),'Cell Phones & Accessories')]")
	public WebElement mobile;

	
	public void selectcheckbox(String checkbox){
		if(checkbox.equalsIgnoreCase("books")){
		books.click();
		logger.info("Selected books check box");
		}else if(checkbox.equalsIgnoreCase("camera")){
			camera.click();
			logger.info("Selected camera and picture check box");
		}else if(checkbox.equalsIgnoreCase("mobile")){
			mobile.click();
			logger.info("Selected cellphone and accessories check box");
		}
	}
	
//	
//	public void selectBooks() {
//		books.click();
//		logger.info("Clicked on Books");
//
//	}
//
//	public void selectCamera() {
//		camera.click();
//		logger.info("Clicked on Camera & Photo");
//	}
//
//	public void selectMobile() {
//		mobile.click();
//		logger.info("Clicked on Mobile & Accessories");
//	}
	public static void assertAll(){
		logger.info("Assert all is executed...");
		st.assertAll();
	}
}
