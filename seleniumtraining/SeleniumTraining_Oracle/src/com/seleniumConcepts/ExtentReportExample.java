package com.seleniumConcepts;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentReportExample {
	public WebDriver driver;
	public String Browser = "chrome";

	@Test
	public void workWithBrow() throws IOException {
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("Test1Report.html");
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest l = extent.createTest("create customer");
        
		SoftAssert st =new SoftAssert();
		
		if (Browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();// OpenBrowser
			l.info("Chrome Browser Opened");
		} else if (Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer");
			driver = new InternetExplorerDriver();
		} else if (Browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.amazon.com/");// open url
		l.info("Url Entered");
		driver.manage().window().maximize();// maximize browser window
		l.info("Window Maximized");
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
				//st.assertEquals(text, "Added to Cart");
				//System.out.println("text="+text);
				//close browser
				if(text.equals("Added to Cart")){
					File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileHandler.copy(srcFile, new File(System.getProperty("user.dir")+"/src/com/screenShotsExtent/TestPass.png"));
					
					//l.addScreenCaptureFromPath("./src/com/screenShotsExtent/TestPass.png");
					l.pass("Success msg displayed...",MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"/src/com/screenShotsExtent/TestPass.png").build());
					//l.log(Status.PASS, "Successmsg displayed...");
					}else {
						File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						FileHandler.copy(srcFile, new File(System.getProperty("user.dir")+"/src/com/screenShotsExtent/TestFail.png"));
						//l.addScreenCaptureFromPath("/src/com/screenShotsExtent/TestFail.png");
						l.fail("Success msg displayed...",MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"/src/com/screenShotsExtent/Testfail.png").build());
						//st.fail("Sucessmsg does not displayed...");
						//l.log(Status.FAIL, "Successmsg does not displayed...");
					}
				driver.quit();
				extent.flush();
				st.assertAll();
	}

}
