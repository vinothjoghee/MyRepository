package com.vj.Practice.MavenInfinite.Excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File xlFile=new File("C:\\Users\\jogheev\\Desktop\\AutomationTc.xlsx");
       try {
		FileInputStream fis=new FileInputStream(xlFile);
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   XSSFSheet sh=wb.getSheet("Sheet1");
		   String data=sh.getRow(0).getCell(0).getStringCellValue();
		   System.out.println(data);
		   int rows=sh.getLastRowNum();
		   System.out.println(rows);
		   int cols=sh.getRow(0).getLastCellNum();
		   System.out.println(cols);
			int rc = sh.getPhysicalNumberOfRows();
		   for(int i=0;i<rc;i++) {
			  Row cr=sh.getRow(i);
			  int cc = cr.getPhysicalNumberOfCells();
				for (int j = 0; j < cc; j++) {
					Cell c = cr.getCell(j);
					System.out.print(c.getStringCellValue() + "\t");
				}
				System.out.println();
		   }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
