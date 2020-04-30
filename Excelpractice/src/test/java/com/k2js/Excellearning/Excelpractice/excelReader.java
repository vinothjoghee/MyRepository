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

public class excelReader {

	static FileInputStream fis = null;
	static Workbook wb = null;
	static Sheet s = null;
	static {
		try {
			fis = new FileInputStream(".\\testData\\NTData.xlsx");
			wb = WorkbookFactory.create(fis);
			s = wb.getSheet("Sheet1");
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		//System.out.println(getRowCount());
		//System.out.println(getCellCount_Row());
		//getRow0Cell0();
		//getAllRow_ColumnCount();
		//get2and3rowColumn();
		printCellData("VerifyRegisterPage");
		//System.out.println(printCellData("VerifyHomePageTitle"));

	}

	public static int getRowCount() throws EncryptedDocumentException, InvalidFormatException, IOException {
		// FileInputStream fis=new FileInputStream(".\\testData\\NTData.xlsx");
		// Workbook wb= WorkbookFactory.create(fis);
		// Sheet s=wb.getSheet("Sheet1");
		int rowcount = s.getPhysicalNumberOfRows();
		return rowcount;
	}

	public static int getCellCount_Row() throws EncryptedDocumentException, InvalidFormatException, IOException {
		// FileInputStream fis=new FileInputStream(".\\testData\\NTData.xlsx");
		// Workbook wb= WorkbookFactory.create(fis);
		// Sheet s=wb.getSheet("Sheet1");
		Row r = s.getRow(0);
		int Cellcount = r.getPhysicalNumberOfCells();
		return Cellcount;
	}

	public static void getRow0Cell0() {
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String s = c.getStringCellValue();
		System.out.println(s);
	}

	public static void getAllRow_ColumnCount() {
		int rc = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rc; i++) {
			Row r = s.getRow(i);
			int cellcount = r.getPhysicalNumberOfCells();
			for (int eachCell = 0; eachCell < cellcount; eachCell++) {
				Cell c = r.getCell(eachCell);
				String str=c.getStringCellValue();
				System.out.print(str+"\t");
			}
			System.out.println();

		}
	}
		
		public static void get2and3rowColumn()
		{
			for(int i=0;i<s.getPhysicalNumberOfRows();i++)
			{
				Row r= s.getRow(i);
				Cell c1=r.getCell(1);
				Cell c2=r.getCell(2);
				System.out.println(c1.getStringCellValue()+""+c2.getStringCellValue());
			}
		}
		
		public static void printCellData(String TCName)
		{
			int rc=s.getPhysicalNumberOfRows();
			//int celcount
			for(int ern=0;ern<rc;ern++)
			{
				Row r=s.getRow(ern);
				String c1data=r.getCell(1).getStringCellValue();
				String c2data=r.getCell(2).getStringCellValue();
				if(c1data.equalsIgnoreCase(TCName) && c2data.equalsIgnoreCase("Y"))
				{
					for(int celld=3;celld<r.getPhysicalNumberOfCells();celld++)
					{
						String cd=r.getCell(celld).getStringCellValue();
						System.out.print(cd+"\t");
					}
					
				}
				System.out.println(ern+"");
			}
			//return 0;
		}

	

}
