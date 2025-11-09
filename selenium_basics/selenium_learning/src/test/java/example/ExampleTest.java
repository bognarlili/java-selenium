package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ExampleTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "O:/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Test
    public void openGoogleTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        WebElement userInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        userInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();
    }

    @AfterClass
    public void tearDown(){
        if(driver !=null){
            driver.quit();
        }
    }
}
