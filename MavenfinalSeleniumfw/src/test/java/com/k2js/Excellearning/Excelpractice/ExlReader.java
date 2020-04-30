package com.k2js.Excellearning.Excelpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExlReader {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\TestData\\NTData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		int rowcount=s.getPhysicalNumberOfRows();
		System.out.println(rowcount);

	}

}
