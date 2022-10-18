package assignmentClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksPresentInAmazon {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//List<WebElement> links = driver.findElements(By.tagName("a"));
		 List<WebElement> link = driver.findElements(By.xpath("//a"));
		for(int i=0;i<link.size();i++)
		{
			String text =link.get(i).getAttribute("href");
			//String text =links.get(i).getText();
			System.out.println(text);
		}
		
	}

}
