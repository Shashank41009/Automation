package assignmentClass;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alphaorder {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shash/OneDrive/Desktop/Vijju/hotell.html");
		WebElement source = driver.findElement(By.id("panchavati"));
		Select s =  new Select(source);
		List<WebElement> Allopt = s.getOptions();
		HashSet<String> hopt= new HashSet<String>();
		
		for(int i=0;i<Allopt.size();i++)
		{
			String txt = Allopt.get(i).getText();
			hopt.add(txt);
		}
		
		for(String i :hopt)
		{
			System.out.println(i);	
		}
		
		
		
	}

}
