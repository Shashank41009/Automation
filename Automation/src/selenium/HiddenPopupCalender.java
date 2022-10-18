package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenPopupCalender {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).click();
		WebElement date = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Thread.sleep(2000);
		Select s = new Select(date);
		s.selectByValue("11");
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Thread.sleep(2000);
		Select s1 = new Select(month);
		s1.selectByValue("1997");
		driver.findElement(By.xpath("//a[text()='28']")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		
	}

}
