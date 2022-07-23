package com.annotations;

import org.testng.annotations.DataProvider;

public class Datapool {
	
	@DataProvider
	public Object[][] getdata1(){
     Object obj[][]=new Object[3][2];
		
		obj[0][0]="Name1";
		obj[0][1]="123";
		
		obj[1][0]="Name2";
		obj[1][1]="223";
		
		obj[2][0]="Name3";
		obj[2][1]="323";
		return obj;
	}

}
