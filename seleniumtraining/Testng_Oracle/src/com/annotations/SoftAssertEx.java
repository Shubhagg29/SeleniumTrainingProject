package com.annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	@Test
	public void testCase(){
		
		SoftAssert st= new SoftAssert();
		int Explinks=10;
		int Actlinks=12; // Selenium code
		
		System.out.println("A");
		
		st.assertEquals(Actlinks, Explinks,"Links Compared");
		st.assertEquals("Shubham", "Shubham","String Compared");
		System.out.println("This is statement B");
		
		st.assertAll();
		

}
}