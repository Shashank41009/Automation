package selenium;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sorttechnique {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		List<WebElement> alloption = s.getOptions();
		for(int i=0;i<alloption.size();i++)
		{
			String text = alloption.get(i).getText();
			
			ts.add(text);
		}
		
		
		for(String i :ts)
		{
			System.out.println(i);
		}

	}

}
