package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javasuggestion {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[text()='java']"));
		
		for(int i=1; i<allSugg.size(); i++)
		{
			String text = allSugg.get(i).getText();
			System.out.println(text);
			//System.out.println(i);
		}
		
		System.out.println(allSugg);
		
		driver.close();
		
	}

}
