package selenium;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificBrowser {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option");
		String option = sc.nextLine();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en_IN&co=IN&continue=https%3A%2F%2Fin.indeed.com%2F&tmpl=desktop&service=my&from=gnav-util-homepage&jsContinue=https%3A%2F%2Fin.indeed.com%2F&empContinue=https%3A%2F%2Faccount.indeed.com%2Fmyaccess&_ga=2.179551213.85573203.1664514923-638873844.1661345314&_gac=1.154864202.1661345314.CjwKCAjwmJeYBhAwEiwAXlg0AbqOlw0Gx_LeGkIb6X5HH-mkJ9kqviS9rQQVfZ8uM_0pXhNVNXRaVBoCxoAQAvD_BwE");
		String wh = driver.getWindowHandle();
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String i: allwh)
		{
				Thread.sleep(1000);
			driver.switchTo().window(i);
			String title = driver.getTitle();
			if(option.contains(i))
			{
				driver.close();
			}
			
			
		}
				
			}
		
		
	}


