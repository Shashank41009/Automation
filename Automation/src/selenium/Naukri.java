package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=CjwKCAjwm8WZBhBUEiwA178UnKfFrwxSpBRHDZGzmm9tFKjIxW7CVxv0d4tSVgXrWgA_3PpLlQHEHRoClt8QAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.id("name")).sendKeys("Shashank Angadi");;
		driver.findElement(By.id("email")).sendKeys("shashankangadi75@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Shash@41009");
		driver.findElement(By.id("mobile")).sendKeys("9964717749");
		driver.findElement(By.xpath("//div[@class='focusable optionWrap  ']")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("C:\\Users\\shash\\OneDrive\\Documents");
		

	}

}
