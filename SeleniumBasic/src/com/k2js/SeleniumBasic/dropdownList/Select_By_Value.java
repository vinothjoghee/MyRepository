package com.k2js.SeleniumBasic.dropdownList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_By_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"..\\BrowserExe\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
		WebElement dayele=cd.findElementByName("birthday_day");
		Select selday=new Select(dayele);
		selday.selectByValue("10");
		WebElement monele=cd.findElementByName("birthday_month");
		Select selmon=new Select(monele);
		selmon.selectByValue("1");

	}

}
