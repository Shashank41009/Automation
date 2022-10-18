package assignmentClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printtagnamehrefforforgotpassword {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement source = driver.findElement(By.linkText("Forgot your password?"));
		System.out.println(source.getTagName());
		System.out.println(source.getAttribute("href"));
		driver.close();
	}

}
