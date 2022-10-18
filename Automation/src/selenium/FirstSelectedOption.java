package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement cpListBox = driver.findElement(By.id("cp"));
		Select s = new Select(cpListBox);
//		WebElement fsoption = s.getFirstSelectedOption();
//		String text = fsoption.getText();
//		System.out.println(text);

		System.out.println(s.getFirstSelectedOption().getText());
	}

}
