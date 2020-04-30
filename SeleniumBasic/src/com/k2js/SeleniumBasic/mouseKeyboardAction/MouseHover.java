package com.k2js.SeleniumBasic.mouseKeyboardAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Return;

public class MouseHover {
	
	
	public static WebDriver driver=null;
	
	/*public static WebDriver MouseHover()
	{
		System.setProperty("webdriver.chrome.driver", "..\\BrowserExe\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement un=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		un.sendKeys("vinoth.joghee@gmail.com");
		WebElement pw=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		pw.sendKeys("madithorai");
		WebElement login=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		login.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a=new Actions(driver);
		a.moveToElement(we).perform();
		WebDriverWait ww=new WebDriverWait(driver, 50);
		List<WebElement> Electronic=ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='_114Zhd']/li")));
		//System.out.print(Electronic);
		
		System.out.println(Electronic.size());
		for(WebElement ele : Electronic)
		{
			System.out.println(ele.getText());
		}
		
		return driver;
	}*/

	
	public   void selectDragandDrop()
	{
		System.setProperty("webdriver.chrome.driver", "..\\BrowserExe\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement un=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		un.sendKeys("vinoth.joghee@gmail.com");
		WebElement pw=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		pw.sendKeys("madithorai");
		WebElement login=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		login.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement we=driver.findElement(By.xpath(("//input[@class='LM6RPg']")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		we.sendKeys("jeans");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.RETURN).perform();
		//WebElement search=driver.findElement(By.xpath("//button[@class='vh79eN']"));
		//search.click();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseHover m=new MouseHover();
		//MouseHover();
		m.selectDragandDrop();

	}
}


