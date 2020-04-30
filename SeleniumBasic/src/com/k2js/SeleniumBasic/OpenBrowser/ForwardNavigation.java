package com.k2js.SeleniumBasic.OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;


public class ForwardNavigation {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getbrowserandmachine("chrome","local");
		rightclick();

	}
	
	public static WebDriver getbrowserandmachine(String bn,String rm )
	{
		if(rm.equalsIgnoreCase("local"))
		{
			if(bn.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "..\\BrowserExe\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://facebook.com");
				
				
				
				//driver.close();
			}
			else if(bn.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver","..\\BrowserExe\\chromedriver.exe");
				driver=new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.get("https://google.com");
				driver.navigate().forward();
				driver.navigate().refresh();
				driver.navigate().back();
				driver.close();
			
			}
		}
		
		else {
			System.out.println("Browser is not available");
		}
		return driver;
	}
	
	public static void rightclick()
	{
		WebElement we=driver.findElement(By.linkText("Create a Page"));
		Actions a=new Actions(driver);
		a.contextClick(we).perform();
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ENTER).perform();
	}

}
