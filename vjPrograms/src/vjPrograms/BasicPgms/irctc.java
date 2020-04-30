package vjPrograms.BasicPgms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
			"..\\BrowserExe\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.irctc.co.in/nget/train-search");
		cd.manage().window().maximize();
		String homepagetitle=cd.getTitle();
		System.out.println(homepagetitle);
		List<WebElement> mnu=cd.findElements(By.xpath("//ul[@class='menu']/li"));
		Set<String> noofWindows=cd.getWindowHandles();
		for(WebElement header :mnu) {
			System.out.println(header.getText());
			//header.click();
		}
		//To handle windows
		
		WebElement flight=cd.findElementByLinkText("FLIGHTS");
		flight.click();
		String flighthomepage=cd.getTitle();
		System.out.println(flighthomepage);
		
		Set<String> Windowhndles=cd.getWindowHandles();
		System.out.println(Windowhndles.size());
		
		ArrayList<String> w=new ArrayList<String>(Windowhndles);
		String hme=w.get(0);
		String flght=w.get(1);
		cd.switchTo().window(hme);
		System.out.println(cd.getTitle());
		cd.switchTo().window(flght);
		System.out.println(cd.getTitle());
		
		

	}

}
