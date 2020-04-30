package com.k2js.SeleniumBasic.dropdown.multiselect;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect_By_Value {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"..\\BrowserExe\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		cd.manage().window().maximize();
		WebElement frameele = cd.findElement(By.xpath("//iframe[@id='iframeResult']"));
		cd.switchTo().frame(frameele);
		WebElement carWele=cd.findElementByName("cars");
		Select selday=new Select(carWele);
		selday.selectByValue("volvo");
		selday.selectByValue("saab");
		selday.selectByValue("audi");
		TimeUnit.SECONDS.sleep(5);
		selday.deselectByValue("audi");
		
		


	}

}
