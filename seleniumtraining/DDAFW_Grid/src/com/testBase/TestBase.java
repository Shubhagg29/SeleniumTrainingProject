package com.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import org.testng.asserts.SoftAssert;



public class TestBase {

	
	public static Properties prop;
	public static FileInputStream fip;
	public static WebDriver driver;
	public static String Browser;
	public static Logger logger;
	public static SoftAssert st;
	public static DesiredCapabilities cap;
	public static int tc=0;
		
	public static  WebDriver OpenBrowser() throws Throwable   {
		st=new SoftAssert();
		logger=Logger.getLogger("devpinoyLogger");
		
		
		fip=new FileInputStream("./src/com/config/Global.Properties");
		prop=new Properties();
		prop.load(fip);
		//Browser=prop.getProperty("Browser");
		//logger.info("Browser choosen is "+Browser);
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:9999/wd/hub"),cap);
		driver.get(prop.getProperty("url"));//open url
		logger.info("url opened");
		driver.manage().window().maximize();//maximize browser window
		logger.info("Browser maximized...");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Implicit time is set...");
		return driver;
	
	}
}