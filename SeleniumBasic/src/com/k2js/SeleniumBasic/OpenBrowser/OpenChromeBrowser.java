package com.k2js.SeleniumBasic.OpenBrowser;

import org.openqa.selenium.chrome.ChromeDriver;


public class OpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","D:\\SeleniumTrainingByJitendra\\Tools\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","..\\BrowserExe\\\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver fd=new ChromeDriver();
		System.out.println("Completed execution");
		
	}

}
