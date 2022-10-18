package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsWithoutDuplicate {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		List<WebElement> listofoptions = s.getOptions();
		int count = listofoptions.size();
		System.out.println(count);
		
		System.out.println("To Avoid Duplictes");
		HashSet<String> ref= new HashSet<String>();
		for(WebElement i : listofoptions)
		{
			ref.add(i.getText());
		}
		
		for(String i : ref)
		{
			System.out.println(i);
		}
		
		System.out.println("To sort in order");
		
		ArrayList ar = new ArrayList();
		
		for(WebElement i : listofoptions)
		{
			ar.add(i.getText());
			
		}
		Collections.sort(ar);
		System.out.println(ar);
		

	}

}
