package com.seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class WorkWithAlert {

	public WebDriver d;
	public String Browser = "mozilla";

	@Test
	public void workWithBrow() throws InterruptedException {

		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			d = new ChromeDriver(options);// OpenBrowser
		} else if (Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer");
			d = new InternetExplorerDriver();
		} else if (Browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver");
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(true);
			//options.
			d = new FirefoxDriver(options);
		}
		
		
		EventFiringWebDriver driver = new EventFiringWebDriver(d);
		Events eve = new Events();
		driver.register(eve);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");// open url
		driver.manage().window().maximize();// maximize browser window

		// Signin
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		
		// Alert
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		// EnterUSername

		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Check");
		driver.quit();

	}

}
