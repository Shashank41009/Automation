		package selenium;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromePrintpopup {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL)	;
r.keyPress(KeyEvent.VK_P)	;
r.keyRelease(KeyEvent.VK_CONTROL);
for(int i=0; i <7; i++) {
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
}
r.keyRelease(KeyEvent.VK_TAB);
for(int i=0; i <3; i++) {
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(2000);
}
r.keyPress(KeyEvent.VK_1);
r.keyPress(KeyEvent.VK_MINUS);
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_ENTER);
driver.findElement(By.id("hi")).sendKeys(Keys.CONTROL+"ac");
driver.findElement(By.id("hi")).sendKeys(Keys.CONTROL+"av");
}
}
