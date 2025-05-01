package Selenium;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class implicitwaitConcept {


	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String title = driver.getTitle();
		String expectedTitle = "Rahul Shetty Academy - Login page";
		assertEquals(title, expectedTitle, "Page title does not match the expected value");
		driver.findElement(By.id("inputUsername")).sendKeys("Mayank");
		driver.findElement(By.xpath("//*[@name='inputPassword']")).sendKeys("Mayank");
		driver.findElement(By.xpath("//*[@id='chkboxOne']")).click();
		driver.findElement(By.xpath("//*[@id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//*[@class='submit signInBtn']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error']")));
		
		
		
		String error1 = driver.findElement(By.xpath("//p[@class='error']")).getText();
		assertEquals(error1, "* Incorrect username or password");
		driver.close();
	}

}
