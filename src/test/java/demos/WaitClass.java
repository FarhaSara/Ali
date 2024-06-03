package demos;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitClass {

	public static void main(String[] args) {
		WebDriver driver = null;
		try {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//Explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@name='btnI'])[2]")))).click();
		
		//fluent wait
		Wait<WebDriver> wait1= new FluentWait<WebDriver>(driver)
		                  .withTimeout(Duration.ofSeconds(1000))
		                  .pollingEvery(Duration.ofSeconds(10))
		                  .ignoring(NoSuchElementException.class);
		wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()[normalize-space()='About']]")))).click();		                  
		WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait<WebDriver> w6=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		}finally {
			driver.quit();
		}
	}
}
