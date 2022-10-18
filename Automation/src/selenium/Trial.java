package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Qspider");
		Thread.sleep(2000);
		List<WebElement> allsuggestion = driver.findElements(By.xpath("//span[contains(text(),'piders')]"));
		List<WebElement> allsuggestion1 = driver.findElements(By.xpath("//span[text()='qspider']"));
		for(WebElement i : allsuggestion)
		{
			System.out.println(i.getText());
		}
		Iterator it = allsuggestion1.listIterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
		int count = allsuggestion.size();
		System.out.println(count);
		allsuggestion.get(count-1).click();
		
		
		
		
	}

}
