package assignmentClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lbselect {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement element = driver.findElement(By.id("mtr"));
		 List<WebElement> elements = driver.findElements(By.xpath("//options"));
		Select s = new Select(element);
		int count = elements.size();
		System.out.println(count);
		
		for(int i =0;i<12;i++)
		{
			s.selectByIndex(i);
		}
		for(int i =12;i>=0;i--)
		{
			s.deselectByIndex(i);
		}

}}
