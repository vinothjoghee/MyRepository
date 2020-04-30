package vjPrograms.BasicPgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","..\\BrowserExe\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://opensource.demo.orangehrmlive.com/");
		dr.manage().window().maximize();
		WebElement un=dr.findElement(By.id("txtUsername"));
		WebElement pw=dr.findElement(By.id("txtPassword"));
		un.sendKeys("Admin");
		pw.sendKeys("admin");
		WebElement submit=dr.findElement(By.id("btnLogin"));
		submit.click();
		

	}

}
