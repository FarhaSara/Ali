package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackForwardSimulation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.google.com/");
		driver.get("https://www.yahoo.com/");
		driver.navigate().back();
		//Thread.sleep(10000);
		//Selenium.setSpeed(10);
		driver.navigate().forward();
		driver.findElement(By.name("p")).sendKeys("Books");
		
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
		
	}
}
