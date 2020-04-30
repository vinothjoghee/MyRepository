package vjPrograms.BasicPgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","..\\BrowserExe\\\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://infinite.greythr.com/login.do");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement un=dr.findElement(By.id("j_username"));
		un.sendKeys("1018721");
		WebElement Frgtlnk=dr.findElement(By.linkText("Forgot password?"));
		Frgtlnk.click();
		dr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement lgn=dr.findElement(By.linkText("Back to Login"));
		dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		lgn.click();
		WebElement pw=dr.findElement(By.id("j_password"));
		pw.sendKeys("systemsmith@1");
		WebElement login=dr.findElement(By.id("login-button"));
		login.click();
		//<a href="/j_spring_security_logout">Sign Out</a>
		WebElement logout=dr.findElement(By.xpath("//a[@href='/j_spring_security_logout']"));
		logout.click();
		//Alert a=dr.switchTo().alert();
		//String msg=a.getText();
		//System.out.println(msg);
		//a.dismiss();
		//comp.click();
		

	}

}
