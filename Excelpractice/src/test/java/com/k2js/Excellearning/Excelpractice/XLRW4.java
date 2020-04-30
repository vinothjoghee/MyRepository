package com.k2js.Excellearning.Excelpractice;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XLRW4 {
	public static FileInputStream fis=null;
	public static Workbook wb=null;
	public static Sheet sh=null;
	
	static {
		try {
			fis=new FileInputStream(".\\testData\\NTData.xlsx");
			wb=WorkbookFactory.create(fis);
			sh=wb.getSheet("Sheet1");
		}catch(Exception e) {}
	}

	//find the no of row
	
	public static int rowCount(String TCName) {
		int rc=sh.getPhysicalNumberOfRows();
		int count=0;
		for(int i=0;i<rc;i++) {
			Row r=sh.getRow(i);
			String c1=r.getCell(1).getStringCellValue();
			
			if(c1.equalsIgnoreCase(TCName)) {
				count ++;
			}
			
		}
		return count;
	}
	
	//find no of colms
	
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
	
	
	//to store data
	@DataProvider(name="oye")
	public static String[][] storetestdata(Method m)
	{
		String TCName=m.getName();
		int rc=sh.getPhysicalNumberOfRows();
		int rC=rowCount(TCName);
		int cC=colCount(TCName);
		String [][]td=new String[rC][cC+1];
		int row=0;
		for(int i=0;i<rc;i++) {
			Row r=sh.getRow(i);
			String c1=r.getCell(1).getStringCellValue();
			if(c1.equalsIgnoreCase(TCName)) {
				int count=0;
				for(int j=3;j<r.getPhysicalNumberOfCells();j++) {
					td[row][count]=r.getCell(j).getStringCellValue();
					count++;
				}
				td[row][count]=i+"";
				row++;
			}
		}
		return td;
	}
	





@Test(dataProvider="oye",dataProviderClass=XLRW4.class)
public static void VerifyRegisterPage(String... qqq) {
	
	for(String s:qqq) {
		System.out.println(s);
	}
}
}