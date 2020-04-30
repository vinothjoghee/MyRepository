package com.k2js.Excellearning.Excelpractice;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExclRW3 {
	public static FileInputStream fis=null;
	public static Workbook wb=null;
	public static Sheet sh=null;
	
	
	static {
		try {
			fis=new FileInputStream(".//testData//NTData.xlsx");
			wb=WorkbookFactory.create(fis);
			sh=wb.getSheet("Sheet1");
		}catch(Exception e) {}
	}
	
	//find rowcount
	
	public static int rowCount(String TCName) {
		int rc=sh.getPhysicalNumberOfRows();
		int count=0;
		for(int i=0;i<rc;i++) {
			Row r=sh.getRow(i);
			String s1=r.getCell(1).getStringCellValue();
			if(s1.equalsIgnoreCase(TCName)) {
				count++;
			}
			
		}
		return count;
	}
	
	
	//find colcount
	
	public static int colCount(String TCName) {
		
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row r=sh.getRow(i);
			String c1=r.getCell(1).getStringCellValue();
			if(c1.equalsIgnoreCase(TCName)) {
				return r.getPhysicalNumberOfCells()-3;
			}
		}
		return 0;
	}
	
	//Store data
	
	@DataProvider(name="abc")
	
	public static String[][] storetestdata(Method m){
		String TCName=m.getName();
		int rc=sh.getPhysicalNumberOfRows();
		int rowcount=rowCount(TCName);
		int colcount=colCount(TCName);
		String dt[][]=new String[rowcount][colcount+1];
		int nri=0;
		for(int i=0;i<rc;i++) {
			Row r=sh.getRow(i);
			String c1=r.getCell(1).getStringCellValue();
			if(c1.equalsIgnoreCase(TCName)) {
				int ncc=0;
				for(int cc=3;cc<r.getPhysicalNumberOfCells();cc++) {
					dt[nri][ncc]=r.getCell(cc).toString();
					ncc++;
				}
				dt[nri][ncc]=i+"";
				nri++;
			}			
		}
		return dt;
	}
	
	@Test(dataProvider="abc",dataProviderClass=ExclRW3.class)
	
	public static void VerifyRegisterPage(String...aaa) {
		
		for(String s:aaa) {
			System.out.println(s);
		}
		
	}
	
@Test(dataProvider="abc",dataProviderClass=ExclRW3.class)
	
	public static void VerifyHomePageTitle(String...aba) {
		
		for(String s:aba) {
			System.out.println(s);
		}
		
	}
	
@Test(dataProvider="abc",dataProviderClass=ExclRW3.class)

public static void VerifySignOn(String...aca) {
	
	for(String s:aca) {
		System.out.println(s);
	}
	
}
}
