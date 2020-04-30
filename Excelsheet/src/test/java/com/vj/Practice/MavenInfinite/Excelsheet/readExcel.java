package com.vj.Practice.MavenInfinite.Excelsheet;

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

public class readExcel {
	
	static FileInputStream fis=null;
	static Workbook wb=null;
	static Sheet s=null;
	
	static {
		
		
		try {
			fis=new FileInputStream(".\\TestData\\Vinoth_Timesheet_2017.xlsx");
			wb=WorkbookFactory.create(fis);
			s=wb.getSheet("July2017_Timesheet");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
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
	
	public int count_no_of_rows()
	{
		int r=s.getPhysicalNumberOfRows();
		return r;
	}

	
	public int count_0row_colmns()
	{
		Row r=s.getRow(0);
		int c=r.getPhysicalNumberOfCells();
		return c;
		
	}
	
	public void getallrows_colmns()
	{
		/*int rc=s.getPhysicalNumberOfRows();
		for(int i=0;i<rc;i++) {
			Row r=s.getRow(i);
			int cc=r.getPhysicalNumberOfCells();
			for(int j=0;j<cc;j++) {
				Cell c=r.getCell(j);
				String Cellval=c.getStringCellValue();
				System.out.print(Cellval+"\t");
			}
			System.out.println("");
			
		}*/
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
		
		
		readExcel ob=new readExcel();
		System.out.println(ob.count_no_of_rows());
		System.out.println(ob.count_0row_colmns());
		
		ob.getallrows_colmns();
	}

}
