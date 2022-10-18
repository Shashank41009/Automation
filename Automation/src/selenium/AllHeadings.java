package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// automate the following scenerios 1) open the browser 2)Enter the url(demo.actiTime.com) 3) login to actitime application click on help drop down and select about your actitime
//4)click on read service agreement present on the popup 5) capture aLL THE HEADINGS Present in newtab and print it on the console 6) close all tabs
public class AllHeadings {
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
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.partialLinkText("About your actiTIME")).click();
	//	driver.findElement(By.xpath("(//a[@href='javascript:void(0)'])[2]")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();
		
		
		List<WebElement> text = driver.findElements(By.xpath("//h2[@id='-license-grants-and-ownership-']/../h2"));
		List<WebElement> text1 = driver.findElements(By.xpath("//h2"));
//		for(WebElement i : text)
//		{
//			String prt = i.getText();
//			System.out.println(prt);
//		}
		int count = text1.size();
		System.out.println(count);
		
		
		for(int i=0;i<text1.size();i++)
		{
			System.out.println(text.get(i).getText());
		}
	//	driver.quit();
		
		
	}

}
