package com.annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
	@Test
	public void testCase(){
		int Explinks=10;
		int Actlinks=12; // Selenium code
		
		System.out.println("A");
		try{
		Assert.assertEquals(Actlinks, Explinks);
		}catch(Throwable t){
			System.out.println(t.getMessage());
		}
		System.out.println("B");
	}
}

