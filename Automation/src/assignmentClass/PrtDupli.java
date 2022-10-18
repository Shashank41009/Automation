package assignmentClass;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrtDupli {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/shash/OneDrive/Documents/hotel.html");
		WebElement opt = driver.findElement(By.id("mtr"));
		Select s = new Select(opt);
		List<WebElement> alloptions = s.getOptions();
		HashSet<String> st = new HashSet();
		HashSet<String> stx = new HashSet();
		
		for(WebElement i : alloptions)
		{
			if(stx.add(i.getText())==false)
			{
				stx.add(i.getText());
			}
			String stp = i.getText();
			st.add(stp);
			
		}
		for(String s1 :st)
		{
			System.out.println(s1);
		}
		System.out.println("________________");
		for(String s2 :stx)
		{
			System.out.println(s2);
		}
		driver.close();
		
	}

}
