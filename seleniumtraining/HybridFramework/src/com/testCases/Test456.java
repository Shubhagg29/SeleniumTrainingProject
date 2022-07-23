package com.testCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageFactory.CommonWebElements;

import xls.ShineXlsReader;

public class Test456 extends CommonWebElements{
	
	@BeforeClass
	public void bmethod(){
		if((ht.get("Test456")==null) || (!ht.get("Test456").equalsIgnoreCase("yes"))){
			throw new SkipException("This testcase is not set for execution in moduledriver excel sheet");
		}
	}
	@Test(dataProvider="getdata")
	public void testCase456(String cn,String cd){
		System.out.println(cn +".....The New ..........."+cd);
	}

	
	@DataProvider
	public Object[][] getdata(){
		ShineXlsReader xls=new ShineXlsReader("./src/com/excelFiles/TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet2");
		int columnCount = xls.getColumnCount("Sheet2");
		Object obj[][]=new Object[rowCount-1][columnCount];
		for( int i=2;i<=rowCount;i++){
			for( int j=0;j<columnCount;j++){
				obj[i-2][j]=xls.getCellData("Sheet2", j, i);
			}
		}
		return obj;
	}
}

