package assignmentClass;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printalloptionwithoutduplicate {
	
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
		List<WebElement> opt = s.getOptions();
		LinkedHashSet<String> sopt = new LinkedHashSet();
		for(WebElement i: opt)
		{
			sopt.add(i.getText());
		}
		
		for(String i: sopt)
		{
				
			System.out.println(i);
		}
		
		
		
		
		
	}

}
