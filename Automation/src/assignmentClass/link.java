package assignmentClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	

	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		 List<WebElement> tags = driver.findElements(By.tagName("a"));
		//List<WebElement> tags = driver.findElements(By.xpath("//a"));
		
		 
		 System.out.println(tags.size());
		 for(int i=0;i<tags.size();i++)
		 {
			String text = tags.get(i).getAttribute("href");
			String text1 = tags.get(i).getText();
			System.out.println(text);
			System.out.println(text1);
			
		 }
		 driver.close();
		
		
		
	}


}
