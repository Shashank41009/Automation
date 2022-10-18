package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo233 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("(//h3[text()='Roadster'])[1]/../div/span/span[1]")).getText();
		System.out.println(price);
		driver.close();
	}
}
