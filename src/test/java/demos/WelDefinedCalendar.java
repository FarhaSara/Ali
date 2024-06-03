package demos;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WelDefinedCalendar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/datepicker/");
		try {
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		Iterator<WebElement> it=ele.iterator();
		while(it.hasNext()) {
			WebElement we=it.next();
			String found=we.getText();
			if(found.equalsIgnoreCase("26")) {
				we.click();
				System.out.println(found);
			}
		}
		
		}
		finally {
			Thread.sleep(10000);
			driver.quit();
		}

	}

}
