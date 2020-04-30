package com.k2js.MavenSelenium.util;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {

	private static WebDriver driver = null;

	public static WebDriver getBrowser(String bn, String rm) throws IOException {
		if (rm.equalsIgnoreCase("remote")) {
			if (bn.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", "..\\BrowserExe\\chromedriver.exe");
				DesiredCapabilities dc = DesiredCapabilities.chrome();
				dc.setBrowserName("chromebrowser");
				dc.setPlatform(Platform.WINDOWS);
				String rm1 = Commonutil.getPropertyValue("config", "config.remote1");
				driver = new RemoteWebDriver(new URL(rm1), dc);
			}

			else if (bn.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "..\\BrowserExe\\geckodriver.exe");
				DesiredCapabilities dc = DesiredCapabilities.firefox();
				// driver=new RemoteWebDriver(new url(rm1),dc);
				dc.setBrowserName("firefoxbrowser");
				dc.setPlatform(Platform.WINDOWS);
				String rm1 = Commonutil.getPropertyValue("config", "config.remote1");
				driver = new RemoteWebDriver(new URL(rm1), dc);
				// driver=new RemoteWebDriver(new url""),dc;
				System.out.println("will input later");
			} else if (bn.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "..\\BrowserExe\\IEDriverServer.exe");
				DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
				dc.setBrowserName("IEbrowser");
				dc.setPlatform(Platform.WINDOWS);
				// driver=new RemoteWebDriver(new url""),dc;
				String rm1 = Commonutil.getPropertyValue("config", "config.remote1");
				driver = new RemoteWebDriver(new URL(rm1), dc);
			}

			// need to implement for other browser
		}
		if (rm.equalsIgnoreCase("local")) {
			if (bn.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "..\\BrowserExe\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (bn.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "..\\BrowserExe\\geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println("Open in local");
			} else if (bn.equalsIgnoreCase("InternetExplorer")) {
				System.setProperty("webdriver.ie.driver", "..\\BrowserExe\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				System.out.println("Open in local");
			}

		}

		return driver;
	}

	public static WebDriver getBrowser() {
		return BrowserFactory.driver;
	}

	public static void Openurl(String url) {
		BrowserFactory.driver.get(url);
		BrowserFactory.driver.manage().window().maximize();
	}

	public static void closeBrowser() {
		driver.close();
	}

}
