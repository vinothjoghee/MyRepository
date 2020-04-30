package com.k2js.Excellearning.Excelpractice;

import java.io.FileInputStream;
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

public class exclrw1 {

	public static FileInputStream fis=null;
	public static Workbook wb=null;
	public static Sheet sh=null;
	
	
	static {
		try {
			fis=new FileInputStream(".//testData//NTData.xlsx");
			wb=WorkbookFactory.create(fis);
			sh=wb.getSheet("Sheet1");
		}catch(Exception e){}
	}
	
	//1.find rowcount
	
	public static int rowCount(String TCName) {
		int rc=sh.getPhysicalNumberOfRows();
		int count=0;
		for(int i=0;i<rc;i++) {
			Row r=sh.getRow(i);
			String c1=r.getCell(1).toString();
			String c2=r.getCell(2).toString();
			if(c1.equalsIgnoreCase(TCName)&& (c2.equalsIgnoreCase("y"))) 			
			{
			count++;	
			}			
		}
		return count;
	}
	
	//find cellcount
	
	public static int cellcount(String TCName) {
		//int cellcount=0;
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row r =sh.getRow(i);
			String c1=r.getCell(1).toString();
			String c2=r.getCell(2).toString();
			if(c1.equalsIgnoreCase(TCName)&& (c2.equalsIgnoreCase("y"))) 
			{
				return r.getPhysicalNumberOfCells()-3;
				
			}			
		}
		return 0;
	}
	
	//StoretestData
	@DataProvider(name="abc")
	
	public static String[][] storetestData(Method m){
		String TCName=m.getName();
		System.out.println(TCName);
		int r=sh.getPhysicalNumberOfRows();
		int rowcount=rowCount(TCName);
		int cellcount=cellcount(TCName);
		String[][] td=new String[rowcount][cellcount+1];
		int nrc=0;
		for(int i=0;i<r;i++) {
			Row rr=sh.getRow(i);
			String c1data=rr.getCell(1).toString();
			String c2data=rr.getCell(2).toString();
			if(c1data.equalsIgnoreCase(TCName)&&c2data.equalsIgnoreCase("Y")) {
				int ncc=0;
				for(int ec=3;ec<rr.getPhysicalNumberOfCells();ec++) {
					td[nrc][ncc]=rr.getCell(ec).toString();				
					ncc++;
					
				}
							
				td[nrc][ncc]=i+"";
				nrc++;
				}
			
		}
		return td;
	}
	
	
	@Test(dataProvider="abc",dataProviderClass=exclrw1.class)
	public static void verifyRegisterPage(String...tcdata) {
		for(String s:tcdata) {
			System.out.print(s+"\t");
		}
	}
	

}
