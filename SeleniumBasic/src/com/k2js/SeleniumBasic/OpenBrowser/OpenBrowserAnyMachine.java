package com.k2js.SeleniumBasic.OpenBrowser;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OpenBrowserAnyMachine {

	private static WebDriver driver = null;

	public static WebDriver OpenBrowser(String browserName, String runmode) {

		if (runmode.equalsIgnoreCase("remote")) {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
				DesiredCapabilities dc = DesiredCapabilities.chrome();
				dc.setBrowserName("chromebrowser");
				dc.setPlatform(Platform.WINDOWS);
				// driver=new RemoteWebDriver(new url""),dc;
				System.out.println("will input later");
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"D:\\SeleniumTrainingByJitendra\\Tools\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				DesiredCapabilities dc = DesiredCapabilities.firefox();
				dc.setBrowserName("firefoxbrowser");
				dc.setPlatform(Platform.WINDOWS);
				// driver=new RemoteWebDriver(new url""),dc;
				System.out.println("will input later");
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"D:\\SeleniumTrainingByJitendra\\Tools\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
				DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
				dc.setBrowserName("IEbrowser");
				dc.setPlatform(Platform.WINDOWS);
				// driver=new RemoteWebDriver(new url""),dc;
				System.out.println("will input later");
			}

		}
		if (runmode.equalsIgnoreCase("local")) {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Open in local");
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"D:\\SeleniumTrainingByJitendra\\Tools\\geckodriver-v0.19.1-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println("Open in local");
			} else if (browserName.equalsIgnoreCase("InternetExplorer")) {
				System.setProperty("webdriver.ie.driver",
						"D:\\SeleniumTrainingByJitendra\\Tools\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				System.out.println("Open in local");
			}
		}

		return driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = OpenBrowser("chrome", "local");

	}

}
