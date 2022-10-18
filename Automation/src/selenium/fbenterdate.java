
package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbenterdate {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement listboxday = driver.findElement(By.id("day"));
		Select s = new Select(listboxday);
		
		s.selectByIndex(11);
		WebElement listboxmonth = driver.findElement(By.id("month"));
		
		Select s1 = new Select(listboxmonth);
		
		s1.selectByValue("12");
		
WebElement listboxyear = driver.findElement(By.id("year"));
		
		Select s2 = new Select(listboxyear);
		s2.selectByVisibleText("1997");
		
		
		
	}

}
