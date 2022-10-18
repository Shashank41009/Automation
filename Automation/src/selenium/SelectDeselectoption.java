package selenium;
import java.util.List;
//write a script to print all the options present in mtrlistbox and deselect them in reverse
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselectoption {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlistbox);
		List<WebElement> listofoptions = s.getOptions();
		int count = listofoptions.size();
		for(int i=0;i<count;i++)
		{
			s.selectByIndex(i);
		}
		
		for(int i=count-1;i>=0;i--)
		{
			s.deselectByIndex(i);
		}

	}

}
