package vjPrograms.BasicPgms;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class All_linkselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumTrainingByJitendra\\Tools\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Started execution");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://google.com/");
		cd.manage().window().maximize();
		
		List<WebElement> all_link=cd.findElements(By.tagName("a"));
		
		int count=all_link.size();
		for(int i=0;i<count;i++) {
			
			if(all_link.get(i).getAttribute("href").contains("google")) {
				String All_linkname=all_link.get(i).getAttribute("href");				
				System.out.println(All_linkname);
				
			}
			
		}
		

	}

}
