package com.k2js.Excellearning.XcelvjPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelReader {

	static FileInputStream fis=null;
	static Workbook wb=null;
	static Sheet s=null;
	static {
	try {
		fis=new FileInputStream("C:\\Users\\jogheev\\Desktop\\AutomationTc.xlsx");
		wb=WorkbookFactory.create(fis);
		s=wb.getSheet("Sheet1");
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static int getrowCount()
	{
		int rowcount=s.getPhysicalNumberOfRows();
		return rowcount;
	}
	public static int getcellCount_Row()
	{
		Row r=s.getRow(0);
		int cellcount=r.getPhysicalNumberOfCells();
		return cellcount;
	}
	
	public static void getrow0cell8()
	{
	  Row r=s.getRow(0);
	  Cell c=r.getCell(0);
	  String s=c.getStringCellValue();
	  System.out.println(s);
	}
	public static void getallrow_cell()
	{
		int rc=s.getPhysicalNumberOfRows();
		for(int i=0;i<rc;i++) {
		Row r=s.getRow(i);
		int cellCount=r.getPhysicalNumberOfCells();
		for(int j=0;j<cellCount;j++)
		{
			Cell c=r.getCell(j);
			String cellval=c.getStringCellValue();
			System.out.print(cellval +"\t");
		}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(getrowCount());
		System.out.println(getcellCount_Row());
		getrow0cell8();
		getallrow_cell();
	}

}
