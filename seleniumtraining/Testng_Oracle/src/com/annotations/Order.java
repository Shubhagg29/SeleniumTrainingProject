package com.annotations;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Order {
	//ASCII Ascending order -Dafault
	//A-65,Z-90,a-97,z-122
		
		@Test(priority=1)
		public void login(){
			//selenium code to Login
			System.out.println("Login");
		}
		
		@Test(priority=0, enabled=false)
		public void composemail(){
			//selenium code to composemail
			System.out.println("Composemail");
		}
		
		@Test(priority=0)
		public void composemail1(){
			//selenium code to composemail
			System.out.println("Composemail1");
		}
		
		@Test(priority=-3)
		public void Savemail(){
			//selenium code to Savemail
			System.out.println("savemail");
			throw new SkipException("Test case Skipped");
		}

}
