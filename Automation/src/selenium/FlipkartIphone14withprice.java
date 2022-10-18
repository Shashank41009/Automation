package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class FlipkartIphone14withprice {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13 pro");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement> listofoptions = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13')]"));
		List<WebElement> listofoptions1 = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13')]/../../div[2]/div[1]/div/div[1]"));
		
		for(int i=0;i<listofoptions.size();i++)
		{
			System.out.println(listofoptions.get(i).getText()+"   "+"price"+" "+listofoptions1.get(i).getText());
		}
		driver.close();
		

	}

}
