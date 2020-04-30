package com.k2js.SeleniumBasic.dropdownMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://newtours.demoaut.com/");
		cd.manage().window().maximize();
		List<WebElement> hmenuele = cd.findElements(By.xpath("//tr[@class='mouseOut']"));
		/*
		 * for(WebElement ele:hmenuele) { System.out.println(ele.getText()); }
		 */
		/*for (int i = hmenuele.size() - 1; i >= 0; i--) {
			System.out.println(hmenuele.get(i).getText());
			hmenuele.get(i).click();
		}*/
		//to click all the list
		
		for (int i = hmenuele.size() - 1; i >= 0; i--) {
			
			try {
			WebElement ele=cd.findElement(By.xpath("//tr[@class='mouseOut']["+i+"]"));
			ele.click();
			System.out.println(ele.getText());
		
		}catch(StaleElementReferenceException e) {}

		}/*for(int i=1;i<=2;i++)
		{
			WebElement ele=cd.findElement(By.xpath("//tr[@class='mouseOut']["+i+"]"));
			System.out.println(ele.getText().toString());
			ele.click();
		
		}*/
	}

}
