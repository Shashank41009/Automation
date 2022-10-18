package assignmentClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectbyindex {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("shashank");
		driver.findElement(By.name("lastname")).sendKeys("angadi");
		driver.findElement(By.name("reg_email__")).sendKeys("shashanka75@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shashanka75@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password");
		
		driver.findElement(By.xpath("//option[@value='28']")).click();
		driver.findElement(By.xpath("//option[text()='Dec']")).click();
		driver.findElement(By.xpath("//option[text()='1997']")).click();
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		

	}

}
