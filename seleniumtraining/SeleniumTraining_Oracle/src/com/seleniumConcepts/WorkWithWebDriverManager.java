package com.seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithWebDriverManager {
	
	public WebDriver driver;
	public String Browser="mozilla";
	@Test
	public void workWithBrow() {
		
		if(Browser.equalsIgnoreCase("chrome")){
			//System.setProperty("webdriver.chrome.driver", "chromedriver");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();//OpenBrowser
		}else if(Browser.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", "IEDriverServer");
			 driver=new InternetExplorerDriver();
		}else if(Browser.equalsIgnoreCase("mozilla")){
			//System.setProperty("webdriver.gecko.driver", "geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get("https://www.selenium.dev/");//open url
		driver.manage().window().maximize();//maximize browser window
		
	}


}
