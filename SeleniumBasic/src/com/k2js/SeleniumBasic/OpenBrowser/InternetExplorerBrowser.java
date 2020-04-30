package com.k2js.SeleniumBasic.OpenBrowser;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","D:\\SeleniumTrainingByJitendra\\Tools\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
		System.out.println("Started execution");
		//InternetExplorerBrowser ie=new InternetExplorerBrowser();
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://gmail.com");
		System.out.println("Completed execution");

	}

}
