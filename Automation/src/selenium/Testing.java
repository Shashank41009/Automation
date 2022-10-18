package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.youtube.com/");
		
		ChromeDriver obj = new ChromeDriver();
		obj.get("https://www.google.com/");
		String title = obj.getTitle();
		System.out.println(title);
		obj.close();
		

	}

}
