package com.testCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerGrid {
	
	
	WebDriver driver ;
	@Test
	public void testGrid() throws Exception {
		
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		
      driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter username
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Name1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1");
	
		//loginDetails("Name1", "Password1");
		Thread.sleep(2000);
		driver.quit();
		
	}

	
	
	public void loginDetails(String uname,String pwd ) {
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	}
}
