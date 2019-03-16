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

public class ExcelReading2 {
/*  @Test(enabled=false)
  public void f() throws Exception {
FileInputStream fi=new FileInputStream(".\\Resources\\HMS_Testdata.xlsx");
Workbook w=new XSSFWorkbook(fi);
Sheet s=w.getSheet("Sheet1");
Row r=s.getRow(0);
Cell c=r.getCell(0);
System.out.println(c);
Cell c1=r.getCell(1);
System.out.println(c1);
  }*/
	
 @Test
  public void readExcel_ALL_xlsx() throws Exception {
FileInputStream fi=new FileInputStream(".\\Resources\\HMS_Testdata.xlsx");
Workbook w=new XSSFWorkbook(fi);
Sheet s=w.getSheet("data");
System.out.println(s.getLastRowNum()); //Row count
for(int i=0; i<s.getLastRowNum(); i++)
{
Row r=s.getRow(i);
Cell c=r.getCell(0);
Cell c1=r.getCell(1);
System.out.println(c);
System.out.println(c1);
}
  }
  
 
/*@Test
public void readExcel_ALL_xls() throws Exception {
FileInputStream fi=new FileInputStream(".\\Resources\\HMS_Testdata.xlsx");
//Workbook w=new XSSFWorkbook(fi);
Workbook w=new HSSFWorkbook(fi);
Sheet s=w.getSheet("data");
System.out.println(s.getLastRowNum()); //Row count
for(int i=0; i<s.getLastRowNum(); i++)
{
Row r=s.getRow(i);
Cell c=r.getCell(0);
Cell c1=r.getCell(1);
System.out.println(c);
System.out.println(c1);
}*/

}














