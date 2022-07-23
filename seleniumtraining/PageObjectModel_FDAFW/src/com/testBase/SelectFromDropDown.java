package com.testBase;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelectFromDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//*[@id=\"menu1\"]"));

		Thread.sleep(3000);
		List<String>itemNew = new ArrayList<String>();
		List<WebElement> menulist = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		//System.out.println(menulist);
		for (WebElement item : menulist) {

			String innerElement = item.getAttribute("innerHTML");

			//System.out.println("Items in the list are ::" + innerElement);

			itemNew.add(innerElement);
		}
		
		System.out.println("Printed ::" +itemNew);
		
		List<String>Eel1 = new ArrayList<String>();
		
		Eel1.add("HTML");
		Eel1.add("CSS");
		Eel1.add("JavaScript");
		Eel1.add("About");
		
	//	System.out.println(Eel1);
		
		Assert.assertEquals(Eel1, itemNew);
		//Assert.assertTrue(Eel1.equals(itemNew));
		
		
	}

}
