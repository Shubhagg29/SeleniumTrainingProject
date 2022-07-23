package com.annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Param1 {
	
	//@Test(dataProvider="getdata1")
	public void testCase1(String cname,int cpwd)
	{
		//selenium code to login
		System.out.println(cname+ " password is "+cpwd);
	}
	
	@Test(dataProvider="getdata2")
	public void testCase2(String cname,String cpwd)
	{
		//selenium code to login
		System.out.println(cname+ " password is "+cpwd);
	}
	
	@DataProvider
	public Object[][] getdata1(){
     Object obj[][]=new Object[3][2];
		
		obj[0][0]="Name1";
		obj[0][1]=123;
		
		obj[1][0]="Name2";
		obj[1][1]=223;
		
		obj[2][0]="Name3";
		obj[2][1]=323;
		return obj;
	}
	
	
	@DataProvider
	public Object[][] getdata2(){
     String obj[][]=new String[3][2];
		
		obj[0][0]="Name1";
		obj[0][1]="123";
		
		obj[1][0]="Name2";
		obj[1][1]="223";
		
		obj[2][0]="Name3";
		obj[2][1]="323";
		return obj;
	}
}
