package com.k2js.MavenSelenium.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.k2js.MavenSelenium.Constants.NTConstants;


public class Commonutil {
	public static String getPropertyValue(String filename, String key) throws IOException {
		String filelocation = ".\\TestData\\" + filename + ".properties";
		FileInputStream fis = new FileInputStream(filelocation);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);

	}

	public static String getCurrentDate() {
		DateFormat df = new SimpleDateFormat(NTConstants.DATE_FORMAT);
		Date d = new Date();
		return df.format(d);
	}

	public static void takeScreenShots() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) BrowserFactory.getBrowser();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\" + getCurrentDate() + ".png");
		//FileUtils.copyFile(src, dest);

	}
}
