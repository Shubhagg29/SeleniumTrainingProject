package com.annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OneMoreAssert {
	
	@BeforeSuite
	public void bsuite(){
		System.out.println("-----------------------------------start server---------------------------------------------");
	}
	@AfterSuite
	public void asuite(){
		System.out.println("-------------------------------------shutdownserver------------------------------------------");
	}
	@Test
	public void testCase(){
		SoftAssert st=new SoftAssert();
		String expstr="Bangalore";
		String actstr="Bengaluru";
		System.out.println("A");
		if(!expstr.equals(actstr)){
			st.fail("Strings are mis-matching...");
		}
		System.out.println("B");
		
		st.assertAll();
	}
}
