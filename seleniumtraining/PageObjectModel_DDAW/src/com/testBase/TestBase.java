package com.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.webDriverEvents.Events;

public class TestBase {

	public static Properties prop;
	public static FileInputStream fip;
	public static WebDriver d;
	public static String Browser;
	public static Logger logger;
	public static SoftAssert st;
	public static EventFiringWebDriver driver;
	public static Events eve;
	public static int tc=0;
	@BeforeSuite
	public static void OpenBrowser() throws Throwable {
		st = new SoftAssert();
		logger = Logger.getLogger("devpinoyLogger");
		fip = new FileInputStream("./src/com/config/Global.Properties");
		prop = new Properties();
		prop.load(fip);
		Browser = prop.getProperty("Browser");

		logger.info("Browser selected ::" + Browser);

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

		driver = new EventFiringWebDriver(d);
		eve = new Events();
		driver.register(eve);
		// driver.get("https://www.amazon.com/");// open url
		driver.get(prop.getProperty("url"));
	
		logger.info("the Url Opened ::");
		driver.manage().window().maximize();// maximize browser window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		
	}

	@AfterSuite
	public static void CloseBrowser() {
		driver.quit();
		logger.info("Browser Closed");
	}
	
	public static void CaptureScreenShot(String path) throws IOException {
		
		//Shutterbug.shootPage(driver).withName("./src/com/filestestCasesScreenshots/"+path+".png").save();
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcfile, new File("./src/com/filestestCasesScreenshots/"+path+".png"));
		
		
}}