package com.k2js.SeleniumBasic.Switches;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMainWindowToFrame_UsingDefaultContent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement frameele = cd.findElement(By.xpath("//iframe[@id='iframeResult']"));
		cd.switchTo().frame(frameele);
		WebElement tryit = cd.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		Alert a = cd.switchTo().alert();
		String s = a.getText();
		System.out.println(s);
		a.sendKeys("test");
		a.accept();
		WebElement actualStringEle = cd.findElementById("demo");
		String actual = actualStringEle.getText();
		System.out.println(actual);
		String expected = "Hello test! How are you today?";
		if (actual.startsWith(expected)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		cd.switchTo().defaultContent();
		WebElement runEle = cd.findElement(By.xpath("//button[text()='Run »']"));
		runEle.click();

		frameele = cd.findElement(By.xpath("//iframe[@id='iframeResult']"));
		cd.switchTo().frame(frameele);

		WebElement actualStringEle1 = cd.findElementById("demo");
		String actual1 = actualStringEle1.getText();
		System.out.println(actual1);
		String expected1 = "";
		if (actual1.startsWith(expected1)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
