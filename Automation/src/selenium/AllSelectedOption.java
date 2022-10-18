package selenium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOption {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement asoption = driver.findElement(By.id("cp"));
		Select s = new Select(asoption);
		
		
		List<WebElement> allselectedoptions = s.getAllSelectedOptions();
		int count = allselectedoptions.size();
		for(int i=0;i<count;i++)
		{
			System.out.println(s.getAllSelectedOptions().get(i).getText());
		}
		

	}

}
