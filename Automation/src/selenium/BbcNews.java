package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcNews {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> listofoptions = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../.."));
		for(WebElement i : listofoptions)
		{
			System.out.println(i.getText());
		}
		

	}

}
