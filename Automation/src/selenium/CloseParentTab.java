package selenium;
import java.util.Set;

import org.openqa.selenium.By;
// Write a test script to close only parent tab using title 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentTab {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en_IN&co=IN&continue=https%3A%2F%2Fin.indeed.com%2F&tmpl=desktop&service=my&from=gnav-util-homepage&jsContinue=https%3A%2F%2Fin.indeed.com%2F&empContinue=https%3A%2F%2Faccount.indeed.com%2Fmyaccess&_ga=2.14841215.85573203.1664514923-638873844.1661345314&_gac=1.191578584.1661345314.CjwKCAjwmJeYBhAwEiwAXlg0AbqOlw0Gx_LeGkIb6X5HH-mkJ9kqviS9rQQVfZ8uM_0pXhNVNXRaVBoCxoAQAvD_BwE");
		String wh = driver.getTitle();
		driver.findElement(By.id("login-facebook-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String i : allwh)
		{
			driver.switchTo().window(i);
			String title = driver.getTitle();
			
			if(wh.equals(title))
			{
				driver.close();
			}
			
		}
	}

}
