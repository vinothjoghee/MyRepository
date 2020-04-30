package com.k2js.Excellearning.Excelpractice;


import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class XLRW {
	static FileInputStream fis = null;
	static Workbook wb = null;
	static Sheet s = null;
	static {
		try {
			fis = new FileInputStream(".\\testdata\\NTData.xlsx");
			wb = WorkbookFactory.create(fis);
			s = wb.getSheet("Sheet1");
		} catch (Exception e) {

		}
	}

	public static int getRowCount(String TCName) {
		int rc = s.getPhysicalNumberOfRows();
		int c = 0;
		for (int erc = 0; erc < rc; erc++) {
			Row r = s.getRow(erc);
			String c1data = r.getCell(1).getStringCellValue();
			String c2data = r.getCell(2).getStringCellValue();
			if (c1data.equalsIgnoreCase(TCName) && c2data.equalsIgnoreCase("Y")) {
				c++;
			}
		}
		return c;
	}

	public static int getCellCount(String TCName) {
		int rc = s.getPhysicalNumberOfRows();
		int cellcount = 0;
		for (int erc = 0; erc < rc; erc++) {
			Row r = s.getRow(erc);
			String C1data = r.getCell(1).getStringCellValue();
			String C2data = r.getCell(2).getStringCellValue();
			if (C1data.equalsIgnoreCase(TCName) && C2data.equalsIgnoreCase("y")) {
				return r.getPhysicalNumberOfCells() - 3;
			}
		}
		return 0;
	}

	@DataProvider(name="abc")
	//public static String[][] storeTestData(String tn) 
	public static String[][] storeTestData(Method m) 
	{
		String TCName=m.getName();
		System.out.println(TCName);
		int rc = s.getPhysicalNumberOfRows();
		int rowcount = getRowCount(TCName);
		int cellcount = getCellCount(TCName);
		String[][] td = new String[rowcount][cellcount + 1];
		int nri = 0;
		for (int ern = 0; ern < rc; ern++) {
			Row r = s.getRow(ern);
			String C1data = r.getCell(1).getStringCellValue();
			String C2data = r.getCell(2).getStringCellValue();
			if (C1data.equalsIgnoreCase(TCName) && C2data.equalsIgnoreCase("y")) {
				int nci = 0;
				for (int celld = 3; celld < r.getPhysicalNumberOfCells(); celld++) {
					td[nri][nci] = r.getCell(celld).getStringCellValue();
					nci++;
				}
				td[nri][nci] = ern + "";
				nri++;
			}
		}
		return td;
	}
	
	
	@Test(dataProvider="abc", dataProviderClass=XLRW.class)
	public static void verifyHomePageTitle(String title,String rownum) 
	{
		// System.out.println(getRowCount("verifyRegisterPage"));
		// System.out.println(getCellCount("verifyHomePageTitle"));
		// ExlReader.printCellData("verifyRegisterPage");
		/*for (String t[] : storeTestData("verifyHomePageTitle")) {
			for (String v : t) {
				System.out.print(v + "\t");
			}
			System.out.println();*/
		
		System.out.println(title);
		System.out.println(rownum);
	}
	
	@Test(dataProvider="abc", dataProviderClass=XLRW.class)
	public static void verifyRegisterPage(String... tcdata)    //if we have more data fields pass as String arguments and print it
	{		
		for(String a:tcdata)
		{
			System.out.println(a);
		}
	}
	
	@Test(dataProvider="abc", dataProviderClass=XLRW.class)
	public static void VerifySignOn(String... tcdata1)    //if we have more data fields pass as String arguments and print it
	{		
		for(String a:tcdata1)
		{
			System.out.println(a);
		}
	}
}