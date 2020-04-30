package com.k2js.SeleniumBasic.dropdownList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_By_VisibleText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"..\\BrowserExe\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
		WebElement yearele=cd.findElementByName("birthday_year");
		Select selyear=new Select(yearele);
		selyear.selectByVisibleText("1988");

	}

}
