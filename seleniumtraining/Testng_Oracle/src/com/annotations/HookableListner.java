package com.annotations;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class HookableListner implements IHookable {

	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		callBack.runTestMethod(testResult);
		EveryTestCode();
	}

	public void EveryTestCode() {
		System.out.println("commonTestCode() executed.");

	}

	@Test
	public void testMethod1() {
		System.out.println("testMethod1() executed.");
	}

//	@Test
//	public void testMethod2() {
//		System.out.println("testMethod2() executed.");
//	}

}