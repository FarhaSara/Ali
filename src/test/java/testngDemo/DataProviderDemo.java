package testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void click_gmail() {
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.findElement(By.xpath("//span[text()='Create an account']")).click();
		//driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	}
	@Test(dataProvider="login")
	public void username_password(String username1, String username2, String username3, String username4) throws InterruptedException {
		
		//driver.findElement(By.xpath("//span[text()='For myself']")).click();
		driver.findElement(By.name("firstName")).sendKeys(username1);
		driver.findElement(By.name("lastName")).sendKeys(username2);
		driver.findElement(By.name("Passwd")).sendKeys(username3);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(username4);
		Thread.sleep(10000);
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("Passwd")).clear();
		driver.findElement(By.name("ConfirmPasswd")).clear();
	}	
	
	@DataProvider(name="login")
	public Object[][] testdata(){
		Object[][] obj=new Object[2][4];
		obj[0][0]="farhat";
		obj[0][1]="mulla";
		obj[0][2]="Ashraf";
		obj[0][3]="Huddar";
		obj[1][0]="Ali";
		obj[1][1]="Huddar";
		obj[1][2]="beti";
		obj[1][3]="Huddar";
		return obj;
	}

}
