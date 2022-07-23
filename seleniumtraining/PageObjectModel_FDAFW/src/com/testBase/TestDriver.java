package com.testBase;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestDriver extends ChromeDriver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver(new ChromeOptions().setHeadless(true));
		driver.get("http://denac138.us.oracle.com:25069/jde/E1Menu.maf");

		Thread.sleep(3000);
		WebElement name = driver.findElement(By.id("User"));

		name.sendKeys("Sg9077223");

		System.out.println("Value Entered");

		String val = name.getAttribute("value");
		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys("Sg90772238");
		System.out.println("Password Entered");
		String val1 = pass.getAttribute("value");
		System.out.println(" Entered value for the field " + val);
		
		System.out.println("Password Entered" + val1);
		WebElement el3 = driver.findElement(By.xpath("//*[@value=\"Sign In\"]"));

		el3.click();
		
		
	String title=	driver.getTitle();

		System.out.println(title);
driver.quit();
	}

	
	
}
