package com.testScripts_Indonesia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ExcelReading {
  @Test
  public void f() throws Exception {
FileInputStream fi=new FileInputStream(System.getProperty("user.dir")	+ "\\Resources\\Validus_Testdata.xlsx");
Workbook w=new XSSFWorkbook(fi);
Sheet s=w.getSheet("data");

for (int i =1; i <= s.getLastRowNum(); i++) {
	Row r=s.getRow(i);
	for (int j = 0; j < r.getLastCellNum(); j++) {
		Cell c=r.getCell(j);
		System.out.println(c);
	}
}
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
