package com.k2js.SeleniumBasic.BrowserOperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class BackwardNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd=new ChromeDriver();
		cd.navigate().to("http://gmail.com");
		cd.get("http://facebook.com");
		cd.navigate().back();
			System.out.println("Completed execution");

	}

}
