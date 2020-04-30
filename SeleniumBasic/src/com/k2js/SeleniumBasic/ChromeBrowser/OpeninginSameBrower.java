package com.k2js.SeleniumBasic.ChromeBrowser;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpeninginSameBrower {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("user-data-dir=C:\\Users\\jogheev\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		
		System.out.println("Started execution");
		ChromeDriver cd=new ChromeDriver(co);
		cd.get("http://www.seleniumhq.org/download/");
		WebElement click_Download=cd.findElementByLinkText("3.13.0");
		click_Download.click();
		
		Runtime.getRuntime().exec("D:\\SeleniumTrainingByJitendra\\Tools\\Ait.exe");
	}

}
