package com.annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class ParamWithExcel {

	@Test(dataProvider ="getdata")
	public void testCase1(String cn,String cp) {
		System.out.println(cn+"Password"+  cp);
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");// hot key to collect return datatype-->after ; press--->ctrl+1+Enter
		int columnCount = xls.getColumnCount("Sheet1");
		System.out.println("Row count="+rowCount);
		System.out.println("col count="+columnCount);
		
		Object obj[][]= new Object [rowCount-1][columnCount];
		for (int i=2;i<=rowCount;i++ ) {
			for (int j=0;j<columnCount;j++) {
				obj[i-2][j]=xls.getCellData("Sheet1", j, i);
				
				
			}
		}
		return obj;
		
	}
}
