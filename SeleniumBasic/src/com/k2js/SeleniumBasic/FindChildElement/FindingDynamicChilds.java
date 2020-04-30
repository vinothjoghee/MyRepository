package com.k2js.SeleniumBasic.FindChildElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingDynamicChilds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"..\\BrowserExe\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
		
		WebElement selectDropdown=cd.findElementById("year");
		//DYnamic childelements-i.e the list can add/remove anytime called dynamic
		List<WebElement> allyear=selectDropdown.findElements(By.xpath("//select[@id='year']/option"));
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
