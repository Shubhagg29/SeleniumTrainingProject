package com.annotations;

import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class WorkWithExcel {
	@Test
	public void WorkWithExl() {
		
				ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
		//ShineXlsReader xls=new ShineXlsReader("./src/com/annotations/TestData1.xlsx");
				int rowCount = xls.getRowCount("Sheet1");// hot key to collect return datatype-->after ; press--->ctrl+1+Enter
				int columnCount = xls.getColumnCount("Sheet1");
				System.out.println("Row count="+rowCount);
				System.out.println("col count="+columnCount);
				
				for(int i=2;i<=rowCount;i++){
					for( int j=0;j<columnCount;j++){
						String cellData = xls.getCellData("Sheet1", j, i);
						System.out.println(cellData);
					}
				}
	}

	         //xls.addSheet(sheetname)
			//xls.addColumn(sheetName, colName)
			//xls.setCellData(sheetName, colName, rowNum, data) 
	
	
}
