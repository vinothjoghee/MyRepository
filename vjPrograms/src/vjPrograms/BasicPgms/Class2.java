package vjPrograms.BasicPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//http://demo.guru99.com/test/radio.html
		System.setProperty("webdriver.chrome.driver","..\\BrowserExe\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demo.guru99.com/test/radio.html");
		dr.manage().window().maximize();
		
		WebElement ch1=dr.findElement(By.id("vfb-6-0"));
		if(ch1.isSelected())
		{
			System.out.println("The check box is selected");
		}else
		{
			System.out.println("Not selected by default");
			ch1.click();
		}

	}

}
