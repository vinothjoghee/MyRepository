package com.k2js.SeleniumBasic.BrowserOperations;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd=new ChromeDriver();
		//Instead of using these three lines use below lines 
		/*Options o=cd.manage();
		Window w=o.window();
		w.maximize();*/
		
		cd.manage().window().maximize();

	}

}
