package vjPrograms.BasicPgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver driver;
	
	public static String s="test";
	
	public static WebDriver getbrowser() {
		System.setProperty("webdriver.chrome.driver", "..\\BrowserExe\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static String getstring() {
		return s;
	}
	
public static void main(String[] args) {
	
	System.out.println(BrowserFactory.getbrowser());
	System.out.println(BrowserFactory.getstring());
	}
	
	
}
