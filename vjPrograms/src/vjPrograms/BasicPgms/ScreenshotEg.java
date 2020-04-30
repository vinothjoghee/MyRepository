package vjPrograms.BasicPgms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotEg {
	
	WebDriver driver=null;
	@Test
	public void OpenBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","..\\BrowserExe\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		try {
			driver.manage().window().maximize();
			WebElement find=driver.findElement(By.id("testing"));
			find.sendKeys("Test");
		}catch(Exception e)
		{
			System.out.println("Exception occured");
			getscreenshot();
		}
		
	}
	
	public void getscreenshot() throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:\\screenshot.png"));
	}
	

}
