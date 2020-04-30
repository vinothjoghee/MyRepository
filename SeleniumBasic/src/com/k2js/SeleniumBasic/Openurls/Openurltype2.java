package com.k2js.SeleniumBasic.Openurls;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openurltype2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd=new ChromeDriver();
		cd.navigate().to("http://gmail.com");
	
		//Navigation nv=cd.navigate();
		//nv.to("http://gmail.com");		
		//cd.get("http://gmail.com");
		System.out.println("Completed execution");

	}

}
