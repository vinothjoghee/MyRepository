package vjPrograms.BasicPgms;




import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {
	
	


	public static void addItem(WebDriver driver,String []itemneeded) {
		List<WebElement> allproduct=driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		
		for(int i=0;i<allproduct.size();i++) {
		String []name=allproduct.get(i).getText().split("-");
		String formatname=name[0].trim();
		List itemneedList=Arrays.asList(itemneeded);
		if(itemneedList.contains(formatname)) {
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();			
			j++;     			
		}
		if(j==itemneeded.length) {
			break;
		}
		
		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String [] itemneeded= {"Brocolli","Cucumber","Tomato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	   // Thread.sleep(3000);
		addItem(driver,itemneeded);
		
		WebDriverWait w=new WebDriverWait(driver, 5);
		//w.until(ExpectedConditions.visibilityOf(element))

	}

}
