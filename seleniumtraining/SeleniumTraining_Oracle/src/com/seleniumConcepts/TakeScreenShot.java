package com.seleniumConcepts;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class TakeScreenShot {
	
	public WebDriver driver;
	public String Browser = "chrome";

	@Test
	public void workWithBrow() throws IOException {

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
		driver.get("https://www.msn.com/en-in/");// open url
		driver.manage().window().maximize();// maximize browser window
		
//	//Screenshot

		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("Test_Pic.png"));

		//Shutterbug.shootPage(driver).withName("Test1").save();
		//Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE).withName("Test1_full").save();
		WebElement signin_act = driver.findElement(By.xpath("//span[@class='mectrlname mectrlsignin']"));
		//Shutterbug.shootElement(driver, signin_act).withName("element").save();
		
		//Image Comparison
		BufferedImage expImg = ImageIO.read(new File("./screenshots/element.png"));
		boolean result = Shutterbug.shootElement(driver, signin_act).withName("signin_act").equals(expImg);
		Assert.assertTrue(result);
		
	}


}
