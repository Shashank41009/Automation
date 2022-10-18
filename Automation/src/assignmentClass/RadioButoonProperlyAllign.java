package assignmentClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButoonProperlyAllign {
	

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		int female = driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
		int male = driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		int others = driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
		
		if(female==male & male==others)
		{
			System.out.println("alligned");
		}
		else
		{
			System.out.println("not alligned");
		}
		
		
	}

}
