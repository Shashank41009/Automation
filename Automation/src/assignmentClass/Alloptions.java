package assignmentClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alloptions {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shash/OneDrive/Desktop/Vijju/hotell.html");
		WebElement source = driver.findElement(By.id("mithila"));
		Select s= new Select(source);
		List<WebElement> opt = s.getOptions();
		for(int i=0;i<opt.size();i++)
		{
			System.out.println(opt.get(i).getText());
		}
		
	}

}
