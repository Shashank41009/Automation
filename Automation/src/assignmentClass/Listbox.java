package assignmentClass;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {


	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement element = driver.findElement(By.id("mtr"));
		Select s = new Select(element);
		List<WebElement> option = s.getOptions();
		TreeSet<String> hs = new TreeSet();
		for(WebElement i : option)
		{
			String text = i.getText();
			hs.add(text);
		}
		/*for(WebElement i : option)
		{
			String text = i.getText();
			if(hs.add(text)==false)
				{
				System.out.println(text);
				}
			
		}*/
		
		for(String i : hs)
		{
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
	
	}
}
