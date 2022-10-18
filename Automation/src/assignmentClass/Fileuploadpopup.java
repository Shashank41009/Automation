package assignmentClass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/shash/OneDrive/Documents/resume.html");
		//driver.findElement(By.id("cv")).sendKeys("C:\\Users\\shash\\OneDrive\\Documents");
		File f = new File("./data/resumesample.pdf");
		String absolutepath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
	}

}
