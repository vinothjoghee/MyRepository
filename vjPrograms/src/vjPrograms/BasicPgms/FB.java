package vjPrograms.BasicPgms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");

		FileInputStream fis=new FileInputStream(".\\config.properties");  
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("config.url");
		ChromeDriver driver=new ChromeDriver();
	
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		String fn=p.getProperty("Regpage.fn");
		String ln=p.getProperty("Regpage.ln");
		String un=p.getProperty("Regpage.un");
		String pw=p.getProperty("Regpage.pw");
		String cpw=p.getProperty("Regpage.cpw");
				
		driver.findElement(By.name("firstName")).sendKeys(fn);
		driver.findElement(By.name("lastName")).sendKeys(ln);
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.name("confirmPassword")).sendKeys(cpw);
		
		driver.findElement(By.name("register")).click();
		//WebElement un= driver.findElement(By.xpath("//input[@type='email']"));
		//un.sendKeys("vinoth.joghee@gmail.com");
		//driver.close();
		
		
		

	}

}
