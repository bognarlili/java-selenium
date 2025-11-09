package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExamTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void openGoogleTest() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		WebElement userInput = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		userInput.sendKeys("standard_user");
		passwordInput.sendKeys("secret_sauce");
		loginButton.click();
		Thread.sleep(2000);
		
	}
	
	@AfterClass
	public void tearDown() {
		if(driver !=null) {
			driver.quit();
		}
	}
}
