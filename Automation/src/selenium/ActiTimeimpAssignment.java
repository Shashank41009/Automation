package selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeimpAssignment {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButtonContainer")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[2]")).click();
		//driver.findElement(By.linkText("Read Service Agreement")).click();
		String txt = "actiTIME Online Terms of Service";
		
		Set<String> allwh = driver.getWindowHandles();
		for(String i : allwh)
		{
			driver.switchTo().window(i);
			String text1 = driver.getTitle();
			if(text1.contains(txt))
			{
				List<WebElement> alltext = driver.findElements(By.xpath("//h2 [not (@id='application-service-agreement')]"));
				for(WebElement j : alltext)
				{
					String prt = j.getText();
					System.out.println(prt);
				}
			}
		}
		driver.quit();
		
		
		
	}

}
