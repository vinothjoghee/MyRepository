package com.k2js.Excellearning.Excelpractice;

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
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class vjReader {

	static FileInputStream fis = null;
	static Workbook wb = null;
	static Sheet s = null;
	static {
		try {
			fis = new FileInputStream(".//testData//NTData.xlsx");
			wb = WorkbookFactory.create(fis);
			s = wb.getSheet("Sheet1");

		} catch (Exception e) {

		}
	}

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		// getRowCount();
		// getCell_RowCount();
		// getRow0Cell0();
		// get2and3rowColumn();
		// getallrow_column();

		getdata("VerifyRegisterPage");

	}

	public static void getRowCount() throws EncryptedDocumentException, InvalidFormatException, IOException {

		int rc = s.getPhysicalNumberOfRows();
		System.out.println(rc);

	}

	public static void getCell_RowCount() throws EncryptedDocumentException, InvalidFormatException, IOException {
		Row r = s.getRow(0);
		int cc = r.getPhysicalNumberOfCells();
		System.out.println(cc);

	}

	public static void getRow0Cell0() {
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		// System.out.println();

		System.out.println(c.getStringCellValue());
		// System.out.println(s.getRow(0).getCell(0).getStringCellValue());

	}

	public static void getallrow_column() {
		int rc = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rc; i++) {
			Row cr = s.getRow(i);
			int cc = cr.getPhysicalNumberOfCells();
			for (int j = 0; j < cc; j++) {
				Cell c = cr.getCell(j);
				System.out.print(c.getStringCellValue() + "\t");
			}
			System.out.println();

		}
	}

	/*
	 * public static void printCellData(String tcname) { int
	 * rc=s.getPhysicalNumberOfRows(); //int celcount for(int ern=0;ern>rc;ern++) {
	 * Row r=s.getRow(ern); String c1data=r.getCell(1).getStringCellValue(); String
	 * c2data=r.getCell(2).getStringCellValue(); if(c1data.equalsIgnoreCase(tcname)
	 * && c2data.equalsIgnoreCase("Y")) { for(int
	 * celld=3;celld<r.getPhysicalNumberOfCells();celld++) { String
	 * cd=r.getCell(celld).getStringCellValue(); System.out.print(cd+"\t"); }
	 * 
	 * } System.out.println(ern+""); } //return 0; }
	 */
	public static void getdata(String TCName) {
		int rc = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rc; i++) {
			Row r = s.getRow(i);
			// int cc=r.getPhysicalNumberOfCells();
			String c1 = r.getCell(1).getStringCellValue();
			String c2 = r.getCell(2).getStringCellValue();
			if (c1.equalsIgnoreCase(TCName) && c2.equalsIgnoreCase("y")) {
				for (int j = 3; j < r.getPhysicalNumberOfCells(); j++) {

					String cd = r.getCell(j).getStringCellValue();
					System.out.print(cd + "\t");
				}
			}
			System.out.println(i + "");

		}
	}

	public static void get2and3rowColumn() {
		/*
		 * for(int i=0;i<s.getPhysicalNumberOfRows();i++) { Row r= s.getRow(i); Cell
		 * c1=r.getCell(1); Cell c2=r.getCell(2);
		 * System.out.println(c1.getStringCellValue()+""+c2.getStringCellValue()); }
		 */

		int rc = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rc; i++) {
			Row r = s.getRow(i);
			Cell c = r.getCell(1);
			Cell c1 = r.getCell(2);
			System.out.println(c + "\t" + c1);
		}

	}

}
