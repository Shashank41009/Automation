package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Affu7k_IX1ZDd_mugU0rfBkaUy84jxf2sNx7fzr32saKJchKqM5NFf7ETHvRXhn93lPu7gvpxESLcBvv-zNQooJOFjmFhvLKcEmVpm5k1DC5Lg&smuh=2350&lh=Ac-0t5G36Q5Xz0c_hJo");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shashankangadi75@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8494802657");
		driver.findElement(By.name("login")).click();
		
		
	}

}
