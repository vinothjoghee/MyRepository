package com.k2js.SeleniumBasic.Openurls;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenurlforinBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://paytm.com");
		String pageSrc=cd.getPageSource();
		System.out.println(pageSrc);
		
		if(pageSrc.contains("Fast Forward"))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		System.out.println("Completed execution");

	}

}
