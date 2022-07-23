package com.annotations;

import org.testng.annotations.Test;

public class FetchDataFromDataPool {
	

	@Test(dataProviderClass =com.annotations.Datapool.class,dataProvider="getdata1")
	public void testCase1(String cn,String cp)
	{
		System.out.println(cn+ "::Password::" +  cp);
	}
	

}
