package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googinprimeexpt5-21&ascsubtag=_k_CjwKCAjwg5uZBhATEiwAhhRLHnZDB1L4sfUcYDfB8jQZser3G9SbVUVAlQSxewSywLXcrZ6Kh3OnyRoCyfcQAvD_BwE_k_&gclid=CjwKCAjwg5uZBhATEiwAhhRLHnZDB1L4sfUcYDfB8jQZser3G9SbVUVAlQSxewSywLXcrZ6Kh3OnyRoCyfcQAvD_BwE");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro");
		List<WebElement> count = driver.findElements(By.xpath("//div[contains(text(),'iphone 13 pro')]"));
				int count1 = count.size();
				System.out.println(count1);
				/*for(WebElement i:count) {
					
					System.out.println(i.getText());
				}*/
				for(int i=0;i<count1;i++)
				{
					String text = count.get(i).getText();
					System.out.println(text);
				}
				System.out.println(count.get(count1-1).getText());
	driver.close();
	}
}
