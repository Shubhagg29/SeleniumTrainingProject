package com.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class Retry implements IRetryAnalyzer{
   
	int retryCnt=0;
	public boolean retry(ITestResult result) {
        if (retryCnt < 2) {
            System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCnt+1));
            retryCnt++;
            return true;
        }
		return false;
        
}}