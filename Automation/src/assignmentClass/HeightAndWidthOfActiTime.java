package assignmentClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidthOfActiTime {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		int uh = driver.findElement(By.id("username")).getSize().getHeight();
		int uw = driver.findElement(By.id("username")).getSize().getWidth();
		int ph = driver.findElement(By.name("pwd")).getSize().getHeight();
		int pw = driver.findElement(By.name("pwd")).getSize().getWidth();
		
		if(uh==ph && uw==pw)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not Equal");
		}
		driver.close();
	}

}
