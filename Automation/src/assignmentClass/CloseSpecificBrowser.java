package assignmentClass;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the tab name which is need to be closed");
		String option = sc.next();
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		
		
		
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwhs = driver.getWindowHandles();
		for(String i : allwhs)
		{
			driver.switchTo().window(i);
			String title = driver.getTitle();
			if(title.contains(option))
			{
				driver.close();
			}
		}
	}

}
