package com.vj.Practice.MavenInfinite.Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadWrite {

	static FileInputStream fis=null;
	static Workbook wb=null;
	static Sheet sh=null;
	
	static {
		try {
			fis=new FileInputStream(".\\TestData\\Vinoth_Timesheet_2017.xlsx");
			wb=WorkbookFactory.create(fis);
			sh=wb.getSheet("Sep2017_Timesheet");
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
	
	
	//to read row count
	
	public static int rowCount() {
		int rc=sh.getPhysicalNumberOfRows();
		int count=0;
		for(int i=0;i<rc;i++) {
			Row r=sh.getRow(i);			
				count ++;			
		}
		return count;
	}
	
	//to read no of cells
	public static int colCount() {
		
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row r=sh.getRow(i);
			int count=0;
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				count++;
			}
			return count;
		}
		return 0;
	}
	
	public static String[][] storeTestData(){
		int rc=rowCount();
		int cc=colCount();
		String [][]td=new String[rc][cc+1];
		int rr=0;
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row r=sh.getRow(i);
			int zz=0;
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				System.out.print(td[rr][zz]=r.getCell(j).getStringCellValue());
				System.out.print("\t");
				zz++;
			}
			System.out.println();
			td[rr][zz]=i+"";
		}
		return td;
	}
	
	public static void main(String[] arg) {
		System.out.println(rowCount());
		System.out.println(colCount());
		
		
		System.out.println(storeTestData());
	}
}
