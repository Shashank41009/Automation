package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartiphone13 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13");
		
		 List<WebElement> allsugg = driver.findElements(By.xpath("//a[@class='_3izBDY']"));
		
		for(WebElement i : allsugg)
		{
			System.out.println(i.getText());
		}
		
		int count = allsugg.size();
		System.out.println(count);
		Thread.sleep(3000);
		allsugg.get(count-1).click();
		
		// List<WebElement> sugg = driver.findElements(By.xpath("//a[contains(@href,'')]"));
		 List<WebElement> sugg = driver.findElements(By.tagName("a"));
		 int ct=sugg.size();
		 System.out.println(ct);
		 
		 for(int i=0;i<ct;i++)
		 {
			 System.out.println(sugg.get(i).getAttribute("href"));
		 }
		
		 
	}

}
