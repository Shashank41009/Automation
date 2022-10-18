package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrappedElement {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement alloptions = driver.findElement(By.id("mtr"));
		Select s = new Select(alloptions);
		WebElement allopt = s.getWrappedElement();
		System.out.println(allopt.getText());
		
		

	}

}
