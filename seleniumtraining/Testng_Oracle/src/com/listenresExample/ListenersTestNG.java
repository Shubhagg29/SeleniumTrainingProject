package com.listenresExample;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.IReporter;
import org.testng.ISuiteListener;
import org.testng.ITestResult;

public class ListenersTestNG implements IReporter,ISuiteListener,IHookable {

	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		
		callBack.runTestMethod(testResult);
		// TODO Auto-generated method stub
		
	}

}
