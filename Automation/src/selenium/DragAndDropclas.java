package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropclas {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

}
