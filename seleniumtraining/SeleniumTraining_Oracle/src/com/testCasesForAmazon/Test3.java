package com.testCasesForAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
	public WebDriver driver;
	public String Browser = "chrome";

	@Test
	public void workWithBrow() {

		SoftAssert st = new SoftAssert();

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
		driver.get("https://www.amazon.com/");// open url
		driver.manage().window().maximize();// maximize browser window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Click on today's Deal
		WebElement todaysdeal = driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]"));
		todaysdeal.click();

		// select phone and Accessories
		driver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[9]/div/label/span")).click();

		// click on add to cart
		driver.findElement(By.xpath("//*[@id=\"100 dae8818b\"]/span")).click();

		// Get Text message
		String text = driver
				.findElement(By.xpath("//*[@id=\"100_dealView_0\"]/div/div[2]/div/div/div[8]/div[1]/div/div/div/div"))
				.getText();
		st.assertEquals(text, "Added to Cart");
		
		driver.quit();
		st.assertAll();
	}

}
