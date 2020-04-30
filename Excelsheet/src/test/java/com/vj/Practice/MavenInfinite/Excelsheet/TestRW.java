package com.vj.Practice.MavenInfinite.Excelsheet;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestRW {

	static FileInputStream fis=null;
	static Workbook wb=null;
	static Sheet sh=null;
	
	
	static {
		try {
		
		fis=new FileInputStream(".\\TestData\\Vinoth_Timesheet_2017.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sep2017_Timesheet");
		}catch(Exception e) {}
		
	}
	
	//--count no of rows.
	public static int rowcount() {
		int rowcount=sh.getPhysicalNumberOfRows();
		
		return rowcount;
			
		}
	
	
	//--count no of cell
	
	public static void cellcount() {
		int r=sh.getPhysicalNumberOfRows();
		
		for(int i=0;i<r;i++) {
			Row rcell=sh.getRow(i);
			
			for(int j=0;j<rcell.getPhysicalNumberOfCells();j++) {
				Cell c=rcell.getCell(j);
				String s=c.getStringCellValue();
				System.out.print(c);
				System.out.print("\t");
			
			
			}
			
			System.out.println();
			
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(rowcount());
 cellcount();

}
	}

