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

public class Test1 {
	public WebDriver driver;
	public String Browser = "chrome";

	@Test
	public void workWithBrow() {
        
		SoftAssert st =new SoftAssert();
		
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

		//select Camera and Photo
				driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/span[8]/div/label/input")).click();
				//click on add to cart
				driver.findElement(By.xpath("//*[@id='100 d18d528f-announce']")).click();
				
				//verifysucessmsg
				String text = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div/div[8]/div[1]/div/div/div/div")).getText();
				st.assertEquals(text, "Added to Cart");
				//System.out.println("text="+text);
				//close browser
				driver.quit();
				
				st.assertAll();
	}

}
