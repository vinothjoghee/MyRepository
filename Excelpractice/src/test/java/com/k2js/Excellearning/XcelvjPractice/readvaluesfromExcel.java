package com.k2js.Excellearning.XcelvjPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readvaluesfromExcel {
	
	static FileInputStream fis=null;
	static Workbook wb=null;
	static Sheet sh=null;
	
	static {
		try {
		
		fis=new FileInputStream(".\\testData\\NTData.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sheet1");
		}
		catch(Exception e) {
			
		}
	}
	
	
	//to find no of rows in the excel
	
	public int rowcount() {
		
		int rc=sh.getPhysicalNumberOfRows();
		return rc;
		
	}
	
	//to find no of cols in the excel
	
	public int getcols() {
		Row r=sh.getRow(0);
		int count=r.getPhysicalNumberOfCells();
		return count;
	}
	
	//to read first row and first col
	
	public void getfirstrowcol()
	{
		Row r= sh.getRow(0);
		Cell c=r.getCell(0);
		String readcell=c.getStringCellValue();
		System.out.println(readcell); 
		
		
	}
	
	//get all col values from first row
	
	public void firstrowallcols() {
		Row r=sh.getRow(0);
		
		for(int i=0;i<r.getPhysicalNumberOfCells();i++) {
			Cell c=r.getCell(i);
			String readcell=c.getStringCellValue();
			System.out.print(readcell);
			System.out.print("\t");
			
		}
	
	}
	
	//to read all the values from xcel
	
	public void printallvalues() {
		
		int rc=sh.getPhysicalNumberOfRows();
		for(int i=0;i<rc;i++) {
			Row r=sh.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c=r.getCell(j);
				String val=c.getStringCellValue();
				System.out.print(val);
				System.out.print("\t");
			}
			System.out.println();
			
		}
	}

	
	// to write the value in excel
	
	public void write() throws IOException {
		Row r=sh.getRow(0);
		Cell c=r.createCell(19);
		c.setCellValue("Testing ...");
		
		FileOutputStream fos=new FileOutputStream(".\\testData\\NTData.xlsx");
		wb.write(fos);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		readvaluesfromExcel ob=new readvaluesfromExcel();
		System.out.println(ob.rowcount());
		System.out.println(ob.getcols());
        ob.getfirstrowcol();
        ob.firstrowallcols();
        ob.printallvalues();
       ob.write();
        
		
	}

}
