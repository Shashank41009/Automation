package assignmentClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllTheBrowser {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://secure.indeed.com/auth?hl=en_IN&co=IN&continue=https%3A%2F%2Fin.indeed.com%2F&tmpl=desktop&service=my&from=gnav-util-homepage&jsContinue=https%3A%2F%2Fin.indeed.com%2F&empContinue=https%3A%2F%2Faccount.indeed.com%2Fmyaccess&_ga=2.78140247.2136908340.1665595519-638873844.1661345314");
	driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
	driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
	Set<String> whs = driver.getWindowHandles();
	
	for(String i : whs)
	{
			Thread.sleep(1000);
		driver.switchTo().window(i);
		driver.close();
	}
}
}
