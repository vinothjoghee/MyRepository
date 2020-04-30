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

public class ExcelReadCopy {
	
	static FileInputStream fis;
	static Workbook wb;
	static Sheet sh;
	
	static {
		try {
		//fis=new FileInputStream(".\\TestData\\Vinoth_Timesheet_2017.xlsx");
		fis=new FileInputStream(".\\TestData\\Vinoth_Timesheet_2017.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("July2017_Timesheet");
		}
		catch (FileNotFoundException e) {
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

	public int count_no_rows() {
		int row=sh.getPhysicalNumberOfRows();
		return row;
	}
	
	public int get_0_cellcount() {
		
		Row r=sh.getRow(0);
		int c=r.getPhysicalNumberOfCells();
		return c;
	}
	
	
	public void get_allrow_cell()
	{
		int rc=sh.getPhysicalNumberOfRows();

		for(int i=0;i<rc;i++) {
			Row r=sh.getRow(i);
			int c=r.getPhysicalNumberOfCells();
			for(int j=0;j<c;j++) {
				
				Cell cc=r.getCell(j);
			   String getcellvalue=cc.getStringCellValue();
			  // System.out.println(getcellvalue + "\t");
			   System.out.print(getcellvalue +"\t");
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelReadCopy obj=new ExcelReadCopy();
		System.out.println(obj.count_no_rows());
	
		System.out.println(obj.get_0_cellcount());
		
		obj.get_allrow_cell();
	}

}
