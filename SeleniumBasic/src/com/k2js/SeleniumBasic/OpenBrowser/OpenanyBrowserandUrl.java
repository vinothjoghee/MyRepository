package com.k2js.SeleniumBasic.OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenanyBrowserandUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   WebDriver driver= OpenBrowser("chrome");	
			driver.get("http://gmail.com");

	}

	static WebDriver OpenBrowser(String browser) {
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
			System.out.println("Started execution");
			driver=new ChromeDriver();			
			System.out.println("Completed execution");
				}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\SeleniumTrainingByJitendra\\Tools\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			System.out.println("Start execution");
			driver=new FirefoxDriver();
			
			System.out.println("Completed");
		}
		else if(browser.equalsIgnoreCase("InternetExplorer")) 
		{
			System.setProperty("webdriver.ie.driver","D:\\SeleniumTrainingByJitendra\\Tools\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
			System.out.println("Started execution");
			driver=new InternetExplorerDriver();
			
			System.out.println("Completed execution");
		}
			else {
				System.out.println("No browser found");
			}
		return driver;
		}


}
