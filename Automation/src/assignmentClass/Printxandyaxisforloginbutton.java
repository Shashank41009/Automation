package assignmentClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printxandyaxisforloginbutton {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		int xaxis = driver.findElement(By.xpath("//button[text()='Log in']")).getLocation().getX();
		int yaxis = driver.findElement(By.xpath("//button[text()='Log in']")).getLocation().getY();
		System.out.println(xaxis);
		System.out.println(yaxis);
		driver.close();
		

	}

}
