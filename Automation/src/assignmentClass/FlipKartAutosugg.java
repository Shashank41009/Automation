package assignmentClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartAutosugg {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> allsugg = driver.findElements(By.xpath("//a[@class='_3izBDY']"));
		for(int i=0;i<allsugg.size();i++)
		{
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
		allsugg.get(allsugg.size()-1).click();
		Thread.sleep(2000);
		driver.close();
	}

}
