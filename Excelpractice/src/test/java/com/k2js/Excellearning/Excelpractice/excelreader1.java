package com.k2js.Excellearning.Excelpractice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelreader1 {
	
	static FileInputStream fis=null;
	static Workbook wb=null;
	static Sheet s=null;
	
	static {
		try {
		fis=new FileInputStream(".\\testData\\NTData.xlsx");
		wb=WorkbookFactory.create(fis);
		s=wb.getSheet("Sheet1");
		} catch(Exception e) {
			
		}
	}

	
	 public static int getRowCount() {
		 int r=s.getPhysicalNumberOfRows();
		 return r;
	 }
	 
	 public static int getCellCount_row() {
		Row r =s.getRow(2);
		int cellcount=r.getPhysicalNumberOfCells();
		return cellcount;
		 
	 }
	 
	 public static void getRow1Cell1_value() {
		 
		 Row r= s.getRow(1);
		 Cell c=r.getCell(1);
		 String cvalue=c.getStringCellValue();
		 System.out.println(cvalue);
		 
	 }
	 
	 //to get all row and cell values
	 
	 public static void allrow_cellvalues() {
		 
		 int rc=s.getPhysicalNumberOfRows();
		 
		 for(int i=0;i<rc;i++) {
			 
			 Row r=s.getRow(i);
			 int c=r.getPhysicalNumberOfCells();
			 for(int eachcell=0;eachcell<c;eachcell++) {
				 Cell ccCell=r.getCell(eachcell);
				 String cvalue=ccCell.getStringCellValue();
				 System.out.print(cvalue +"\t");
				 
			 }
			 System.out.println();
		 }
	 }
	 
	 //get only 2nd and 3rd row 
	 
	 public static void get2row()
	 {
		 
		 int rc= s.getPhysicalNumberOfRows();
		 Row r=s.getRow(2);
		 int cc=r.getPhysicalNumberOfCells();
		 for (int i=0;i<cc;i++) {
		 Cell c=r.getCell(i);
		 String cell2=c.getStringCellValue();
		 System.out.print(cell2 + "\t");
		 }
		 System.out.println();
	 }
	 public static void get3row()
	 {
		 
		 
		 Row r=s.getRow(3);
		 int cc=r.getPhysicalNumberOfCells();
		 for (int i=0;i<cc;i++) {
		 Cell c=r.getCell(i);
		 String cell3=c.getStringCellValue();
		 System.out.print(cell3 + "\t");
		 }
	 }
	 
	 //print only 2nd and 3rd row coulmn
	 
	 public static void get2and3rowcolumn() {
		 
		 int rc=s.getPhysicalNumberOfRows();
		for(int i=0;i<rc;i++) {
		 Row r=s.getRow(i);
		 Cell c1=r.getCell(1);
		 Cell c2=r.getCell(2);
		 System.out.println(c1.getStringCellValue()+""+c2.getStringCellValue());
		}
			 
		 
	 }
	 
	 
	 //to print the test data based on the condition and tcname 
	 
	 public static void printCellData(String TCName) {
		 
		 int rc=s.getPhysicalNumberOfRows();
		 
		 for(int i=0;i<rc;i++) {
		 Row r=s.getRow(i);
		 String  tc=r.getCell(1).getStringCellValue();
		 String val=r.getCell(2).getStringCellValue();
		 if(tc.equalsIgnoreCase(TCName) && val.equalsIgnoreCase("y"))
		 {
			 for (int ecc=3;ecc<r.getPhysicalNumberOfCells();ecc++) {
				 Cell c=r.getCell(ecc);
				 String res=c.getStringCellValue();
				 System.out.print(res+"\t");
			 }
		 }
		 System.out.println(i+"");
		 
	 }}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(excelreader1.getRowCount());
		//System.out.println(excelreader1.getCellCount_row());
		//getRow1Cell1_value();
		//allrow_cellvalues();
		//get2row();
		//get3row();
		//get2and3rowcolumn();
		printCellData("verifyRegisterPage");

 	}

}
