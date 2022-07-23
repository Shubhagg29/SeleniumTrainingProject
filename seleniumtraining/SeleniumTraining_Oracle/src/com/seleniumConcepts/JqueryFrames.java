package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class JqueryFrames {

	public WebDriver driver;
	public String Browser = "chrome";

	@Test
	public void workWithBrow() {

		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();// OpenBrowser
		} else if (Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer");
			driver = new InternetExplorerDriver();
		} else if (Browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver");
			driver = new FirefoxDriver();
		}
		driver.get("https://jqueryui.com/selectable/");// open url
		driver.manage().window().maximize();// maximize browser window

		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		// Swtiching to frame/Page
		 driver.switchTo().frame(0);

		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).click();
		// Driver reference to main frame/Page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		
		//to switch to nested frames  in case multiple frames and nested frames 
	     driver.switchTo().frame(2).switchTo().frame(3);

	}

}
