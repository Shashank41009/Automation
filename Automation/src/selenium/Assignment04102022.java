package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment04102022 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement resource = driver.findElement(By.xpath("(//a[@href='#'])[4]"));
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		a.moveToElement(resource).perform();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Customers")).click();
		
		WebElement click = driver.findElement(By.xpath("//a[@href='/customers/hackerearth-case-study/']"));
		a.doubleClick(click);
		
		
		
		

	}

}
