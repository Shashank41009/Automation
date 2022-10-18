package assignmentClass;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAlloptionsAndDeselectInAscendingorder {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement opt = driver.findElement(By.id("mtr"));
		Select s = new Select(opt);
		
		for(int i=0;i<12;i++)
		{
			s.selectByIndex(i);
		}
		for(int i=12;i>=0;i--)
		{
		s.deselectByIndex(i);
		}
		
		
		
		
	}

}
