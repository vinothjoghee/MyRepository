package com.k2js.Excellearning.Excelpractice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelReader2 {
	
	static FileInputStream fis=null;
	static Workbook wb=null;
	static Sheet sh=null;
	
	
	static {
	try{
	
		fis=new FileInputStream(".\\testData\\NTData.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sheet1");
	}catch(Exception e) {}
	
	}
	
	
	//1 Display no of rows in the excel
	
	public static int RowCount() {
		int r=sh.getPhysicalNumberOfRows();
		return r;
	}
	
	//2 Display no of count of 1 row
	
	public static int Count1row() {
		Row r=sh.getRow(1);
		int c=r.getPhysicalNumberOfCells();
		return c;
		
	}
	
	//Display 1 and 2nd row column

	public static void display12col() {
	  int rc=sh.getPhysicalNumberOfRows();
	  for(int i=0;i<rc;i++) {
		  Row r=sh.getRow(i);
		  String c1=r.getCell(1).toString();
		  String c2=r.getCell(2).toString();
		  System.out.println(c1+"\t"+c2);
		  
	  }
	}
	
	//Now display all row and colvalues
	
	public static void allrowcolvalues() {
		
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row r=sh.getRow(i);
			for(int cc=0;cc<r.getPhysicalNumberOfCells();cc++) {
				String c=r.getCell(cc).toString();
				System.out.print(c);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	//5 . Based on the testcase retreive the test data
	
	public static void printvalue(String TestCaseName) {
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row r=sh.getRow(i);
			String condition1=r.getCell(1).toString();
			String condition2=r.getCell(2).toString();
			
			if(condition1.equalsIgnoreCase(TestCaseName)&& condition2.equalsIgnoreCase("y")) {
				for(int ec=3;ec<r.getPhysicalNumberOfCells();ec++) {
					String data=r.getCell(ec).toString();
					System.out.print(data+"\t");
				}
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(RowCount());
		System.out.println(Count1row());
		//display12col();
		allrowcolvalues();
		
		printvalue("VerifyRegisterPage");
	}
	

}
