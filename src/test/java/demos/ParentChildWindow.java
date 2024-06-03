package demos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentChildWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open('https://www.yahoo.com/')");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//div[text()='Sign In']")).click();
		
		driver.quit();

	}

}
