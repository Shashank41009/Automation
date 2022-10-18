package assignmentClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogoDisplayed {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		if(logo==true)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		driver.close();
	}

}
