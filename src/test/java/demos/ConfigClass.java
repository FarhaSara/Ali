package demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigClass {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().deleteAllCookies();
		Properties prop = new Properties();
		FileInputStream st = new FileInputStream("F:\\Workspace\\Demo\\src\\test\\java\\demos\\Config.properties");
		prop.load(st);
		String URL = prop.getProperty("url");
		System.out.println(URL);
		driver.get(URL);
		String nm = prop.getProperty("name");
		driver.findElement(By.name("q")).sendKeys(nm);

	}
}
