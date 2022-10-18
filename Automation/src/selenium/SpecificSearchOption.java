package selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecificSearchOption {
	

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		System.out.println("Enter the option");
		String option = sc.next();
		List<WebElement> alloption = s.getOptions();
		int count=0;
		for(int i=0;i<alloption.size();i++)
		{
			String text = alloption.get(i).getText();
			if(option.equalsIgnoreCase(text))
			{
				count++;
			}
			
		}
		if(count==0)
		{
			System.out.println(option + " Item isnt present in list");
		}
		else if(count==1)
		{
			System.out.println(option + " Item is present in list for 1 time");
		}
		else
		{
			System.out.println(option + " Item is present for more than 1 time");
		}

	}

}
