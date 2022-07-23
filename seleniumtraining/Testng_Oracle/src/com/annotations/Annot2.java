package com.annotations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annot2 {
	
	
	
	
	
	@Test(invocationCount=2)
	public void testcase1(){
		//selenium code to composemail
		System.out.println("Composemail");
		Reporter.log("message my name ");
	}
	
	@Test
	public void google(){
		//selenium code to composemail
		Assert.assertTrue(false);
	}
}
