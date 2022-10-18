package assignmentClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAutoSuggestion {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		System.out.println(allsugg.size());
		Thread.sleep(1000);
		for(int i=0;i<allsugg.size();i++)
		{
			String text=allsugg.get(i).getText();
			System.out.println(text);
		}
		allsugg.get(1).click();
		Thread.sleep(1000);
		driver.close();
	}

}
