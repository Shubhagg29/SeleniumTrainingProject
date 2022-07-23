package com.groupsConcepts;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups="Tag",dependsOnGroups={"Add"})
	public void testcase1(){
		System.out.println("Tag pic friend1");
	}

	@Test(groups="Add")
	public void testcase5(){
		System.out.println("Add friend2");
	}
	
	@Test(groups="Add")
	public void testcase6(){
		System.out.println("Add friend3");
	}

	@Test(groups= {"Add","Tag"})
	public void testcase7(){
		System.out.println("Add friend7 && Tag pic tofriend");
	}
}
