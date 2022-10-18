package selenium;
// Write a script to print all the options present in mtrlistbox without duplicates
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOption {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		HashSet<String> hs = new HashSet<String>();
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		for(int i=0;i<alloptions.size();i++)
		{
			String text = alloptions.get(i).getText();
			hs.add(text);
			
			
		}
		
		for(String i: hs)
		{
			System.out.println(i);
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
