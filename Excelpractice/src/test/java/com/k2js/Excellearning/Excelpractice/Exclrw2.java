package com.k2js.Excellearning.Excelpractice;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exclrw2 {

	public static FileInputStream fis=null;
	public static Workbook wb=null;
	public static Sheet sh=null;
	
	static {
		try {
			fis=new FileInputStream(".\\testData\\NTData.xlsx");
			wb=WorkbookFactory.create(fis);
			sh=wb.getSheet("Sheet1");
			
		}catch(Exception e) {
			
		}
	}
	
	//getrowcount
	
	public static int getrowCount(String TCName) {
		int rc=sh.getPhysicalNumberOfRows();
		int count=0;
		for(int i=0;i<rc;i++) {
		Row r=sh.getRow(i);
		String c1=r.getCell(1).toString();
		String c2=r.getCell(2).toString();
		if(c1.equalsIgnoreCase(TCName)&& c2.equalsIgnoreCase("Y"))
		count++;
		}
		return count;
	}
	
	//getcellcount
	
	public static int getcellCount(String TCName) {
			for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row r=sh.getRow(i);
			String c1=r.getCell(1).toString();
			String c2=r.getCell(2).toString();
			if(c1.equalsIgnoreCase(TCName)&& c2.equalsIgnoreCase("Y")) {				
					return r.getPhysicalNumberOfCells()-3;			
			}			
		}
		return 0;
	}
	
	//store data
	@DataProvider(name="vj")
	public static String[][] storetestdata(Method m){
		
		String TCName=m.getName();
		int rc=sh.getPhysicalNumberOfRows();
		int rowcount=getrowCount(TCName);
		int celcount=getcellCount(TCName);
		String [][]td=new String[rowcount][celcount+1];
		int nri=0;
		for(int i=0;i<rc;i++) {
			Row r=sh.getRow(i);
			String c1=r.getCell(1).toString();
			String c2=r.getCell(2).toString();
			if(c1.equalsIgnoreCase(TCName)&& c2.equalsIgnoreCase("Y")) {
				int nci=0;
				for(int cc=3;cc<r.getPhysicalNumberOfCells();cc++) {
					td[nri][nci]=r.getCell(cc).toString();
					nci++;
			     }
				td[nri][nci]=i+"";
				nri++;
				
				}
		}
		return td;
		
	}

	@Test(dataProvider="vj",dataProviderClass=Exclrw2.class)
		
	public static void verifyRegisterPage(String...tcdata) {
		
		for(String s:tcdata){
			System.out.println(s);
		}
	}
		
		
	
	
}
