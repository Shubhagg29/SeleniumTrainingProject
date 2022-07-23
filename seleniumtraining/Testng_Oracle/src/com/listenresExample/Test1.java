package com.listenresExample;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(com.listenresExample.Events.class)
public class Test1 {
	@Test
	public void testCase1() {
		System.out.println("composemail1");
		Assert.assertTrue(false);
	}

	@Test
	public void testCase2() {
		System.out.println("composemail2");
	}

	@Test
	public void testCase3() {
		System.out.println("composemail3");
	}
}
