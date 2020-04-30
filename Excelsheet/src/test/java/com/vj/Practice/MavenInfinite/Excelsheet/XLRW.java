package com.vj.Practice.MavenInfinite.Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XLRW {
	
	public static FileInputStream fis=null;
	public static Workbook wb=null;
	public static Sheet sh=null;
	
	static{
		try {
			fis=new FileInputStream(".\\TestData\\Vinoth_Timesheet_2017.xlsx");
			wb=WorkbookFactory.create(fis);
			sh=wb.getSheet("Sep2017_Timesheet");
		} catch (Exception e) {		// TODO Auto-generated catch block
			
		} 
		
	}
		//to read no of rows in the excel
		public static int rowCount(String TCName) {
			int rc=sh.getPhysicalNumberOfRows();
			int count=0;
			for(int i=0;i<rc;i++) {
				Row r=sh.getRow(i);
				String c1=r.getCell(0).getStringCellValue();
				if(c1.equalsIgnoreCase(TCName)) {
					count ++;
				}
				
			}
			return count;
		}
		
		//to read no of cells in the excel
		public static int cellCount(String TCName) {
			for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
				Row r=sh.getRow(i);
				String c1=r.getCell(0).getStringCellValue();
				if(c1.equalsIgnoreCase(TCName)) {
					return r.getPhysicalNumberOfCells();
				}
			}
			return 0;
		}
		
		//store this values
		
		@DataProvider(name="JJ")
		public static String [][] storedata(Method m){
			String TCName=m.getName();
			int rCnt=rowCount(TCName);
			int cCnt=cellCount(TCName);
			String[][]td=new String[rCnt][cCnt+1];
			int nrc=0;
			for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
				Row r=sh.getRow(i);
				String c1=r.getCell(0).getStringCellValue();
				if(c1.equalsIgnoreCase(TCName)) {
					int ncc=0;
					for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
						td[nrc][ncc]=r.getCell(j).getStringCellValue();
						ncc++;
					}
					td[nrc][ncc]=i+"";
					nrc++;
				}
				
			}
			return td;
		}
		
		@Test(dataProvider="JJ",dataProviderClass=XLRW.class)
		public static void Settlement(String...tcdata ) {
			
			for(String s:tcdata) {
				System.out.println(s);
			}
		}
		
		
}
		
	
	
	
	
	
