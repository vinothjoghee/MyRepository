package com.vj.Practice.MavenInfinite.Excelsheet;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExlRW {
	static FileInputStream fis=null;
    static Workbook wb=null;
    static Sheet sh=null;
    
    
    static {
    	
    	try{
    	fis=new FileInputStream(".\\TestData\\Vinoth_Timesheet_2017.xlsx");
    	wb=WorkbookFactory.create(fis);
        sh=wb.getSheet("Sep2017_Timesheet");        
    }catch(Exception e) {}
    }
    
   //find no of rows
    public static int getrowcount() {
    	int rcount=sh.getPhysicalNumberOfRows();
    	return rcount;
    }
    //find no fo cols
    public static int getcolcount() {
    	
    	int rc=sh.getPhysicalNumberOfRows();
    	int ccount=0;
    	for(int i=0;i<rc;i++) {
    		Row r=sh.getRow(i);
    		ccount=r.getPhysicalNumberOfCells();
    		
    	}
    	return ccount;
    }
    
    //display all the values on excel sheet
    
    public static void allvalues() {
    	int rcount=sh.getPhysicalNumberOfRows();
    	//int ccount=0;
    	for(int i=0;i<rcount;i++) {
    		Row r=sh.getRow(i);
    		int cc=r.getPhysicalNumberOfCells();
    		for(int j=0;j<cc;j++) {
    			String val=r.getCell(j).getStringCellValue();
    			System.out.print(val);
    			System.out.print("\t"); 
    		
    		}
    		System.out.println();
    		
    	}
    }
    
    public static void main(String ar[]) {
    	TestExlRW t=new TestExlRW();
    	System.out.println(t.getrowcount());
    	System.out.println(t.getcolcount());
    	t.allvalues();
    }
}
