package com.seleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class JavaScriptExample {
	private static final EventFiringWebDriver JavaScriptExecutor = null;
	public WebDriver d;
	public String Browser = "mozilla";

	@Test
	public void workWithBrow() throws InterruptedException {

		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			d = new ChromeDriver();// OpenBrowser
		} else if (Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer");
			d = new InternetExplorerDriver();
		} else if (Browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver");
			d = new FirefoxDriver();
		}
		
		
		EventFiringWebDriver driver = new EventFiringWebDriver(d);
		Events eve = new Events();
		driver.register(eve);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");// open url
		driver.manage().window().maximize();// maximize browser window
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('login1').value='tester'");
	//	js.executeScript("document.querySelector('.signinbtn').click()");
        js.executeScript("document.querySelector('div.ntile:nth-child(8) > h4:nth-child(1) > a:nth-child(1)').scrollIntoView()");
        

        
}
}