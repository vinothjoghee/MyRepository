	package com.k2js.SeleniumBasic.dropdownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
		List<WebElement> allyear=cd.findElements(By.xpath("//select[@id='year']/option"));
		for(WebElement ele:allyear)
		{
			if(ele.getText().trim().equalsIgnoreCase("2000"))
			{
				ele.click();
				break;
			}
		}

	}

}



