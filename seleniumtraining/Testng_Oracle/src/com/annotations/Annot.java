package com.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annot {
	
	
	
	
	@BeforeTest
	public void btest(){
		System.out.println("-----------Start server1--------------");
	}
	@AfterTest
	public void atest(){
		System.out.println("-----------shutdown server1-----------------");
	}
	//ASCII Ascending order
	@Test(invocationCount=3)
	public void testcase1(){
		//selenium code to composemail
		System.out.println("Composemail");
	}
	@BeforeMethod
	public void bmethod(){
		System.out.println("OpenBrowser,url,Login");
	}
	@AfterMethod
	public void amethod(){
		System.out.println("Logout,CloseBrowser");
	}
	@BeforeClass
	public void bclass(){
		System.out.println("Start server...");
	}
	@AfterClass
	public void aclass(){
		System.out.println("Shutdown server...");
	}
	@Test
	public void testcase2(){
		//selenium code to savemail
		System.out.println("savemail");
	}
	
	@Test
	public void testcase3(){
		//selenium code to Deletemail
		System.out.println("Deletemail");
	}

}
