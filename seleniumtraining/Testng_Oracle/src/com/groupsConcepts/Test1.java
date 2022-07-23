package com.groupsConcepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {

	@Test(groups="Add")
	public void testcase1(){
		SoftAssert st = new SoftAssert();
		st.assertEquals(true, false);
		System.out.println("Add friend1");
		st.assertAll();
	}

	@Test(groups="Tag")
	public void testcase5(){
		System.out.println("Tag pic to friend2");
	}
	
	@Test(groups="Tag")
	public void testcase6(){
		System.out.println("Tag pic to friend3");
	}
}
