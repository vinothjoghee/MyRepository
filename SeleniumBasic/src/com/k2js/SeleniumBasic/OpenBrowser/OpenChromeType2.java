package com.k2js.SeleniumBasic.OpenBrowser;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenChromeType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this feature is removed .Soo no need to follow
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setBrowserName("chromebrowser");
		dc.setPlatform(Platform.WINDOWS);
		ChromeDriver cd=new ChromeDriver(dc);
		System.out.println("Completed execution");
	}

}
