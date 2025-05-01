package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selenium_3 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		options.addArguments("--headless=new");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoqa.com/alerts");
		WebElement element = driver.findElement(By.id("alertButton"));

		// Create Actions class instance
		Actions actions = new Actions(driver);

		// Perform right-click (context click)
		actions.contextClick(element).perform();
		
		Thread.sleep(5000);

		System.out.println("Right-click performed successfully!");

		driver.quit();

	}
}

