package com.k2js.SeleniumBasic.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\SeleniumTrainingByJitendra\\Tools\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.out.println("State execution");
		WebDriver fd=new FirefoxDriver();
		fd.get("http://www.google.com");
		System.out.println("Completed");
		
	}

}
