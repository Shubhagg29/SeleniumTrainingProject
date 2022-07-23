package com.testCases;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

	//public WebDriver driver;
	DesiredCapabilities cap;

	@Test(dataProvider="getdata")
	public void testCase1(String cname,String cpwd,String Browser) throws Throwable{
     System.out.println("Browser="+Browser);
		
		if(Browser.equalsIgnoreCase("chrome")){
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}else if(Browser.equalsIgnoreCase("iexplore")){
			cap=DesiredCapabilities.internetExplorer();
			cap.setBrowserName("iexplore");
			cap.setPlatform(Platform.WINDOWS);
		}else if(Browser.equalsIgnoreCase("firefox")){
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter username
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(cname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(cpwd);
		Thread.sleep(2000);
		driver.quit();
	}
	
	@DataProvider(parallel= true)
	public Object[][] getdata() {
		Object obj[][] = new Object[3][3];

		obj[0][0] = "Name1";
		obj[0][1] = "Password1";
		obj[0][2] = "chrome";

		obj[1][0] = "Name2";
		obj[1][1] = "Password2";
		obj[1][2] = "firefox";

		obj[2][0] = "Name3";
		obj[2][1] = "Password3";
		obj[2][2] = "chrome";

		return obj;
	}
}