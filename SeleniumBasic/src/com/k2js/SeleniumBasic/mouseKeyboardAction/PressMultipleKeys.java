package com.k2js.SeleniumBasic.mouseKeyboardAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PressMultipleKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"..\\BrowserExe\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://www.seleniumhq.org/");
		cd.manage().window().maximize();
		WebElement ele=cd.findElementByLinkText("edit this page");
		Actions a=new Actions(cd);
		a.contextClick(ele).perform();
		a.sendKeys(Keys.CONTROL,"S").perform();
		a.sendKeys(Keys.CONTROL,Keys.SHIFT,Keys.DELETE).perform();


	}

}
