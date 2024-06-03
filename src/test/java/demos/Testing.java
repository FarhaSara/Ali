package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementByName('q').value='Hello farhat';");*/
		driver.findElement(By.cssSelector(".gLFyf gsfi	")).sendKeys("HELLO");
		
	}

}
