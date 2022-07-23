package com.seleniumConcepts;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FirefoxProfileEx {
	public WebDriver driver;
	public String Browser = "chrome";

	@Test
	public void workWithBrow() {

		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addExtensions(new File("./extention/chropath.crx"));
			driver = new ChromeDriver(options);// OpenBrowser
			// driver = new ChromeDriver();// OpenBrowser
		} else if (Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer");
			driver = new InternetExplorerDriver();
		} else if (Browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver");

			ProfilesIni p = new ProfilesIni();
			FirefoxProfile fp = p.getProfile("shubh");
			FirefoxOptions options = new FirefoxOptions();
			options = options.setProfile(fp);
			driver = new FirefoxDriver(options);
		}
		driver.get("https://www.selenium.dev/");// open url
		driver.manage().window().maximize();// maximize browser window

	}

}
