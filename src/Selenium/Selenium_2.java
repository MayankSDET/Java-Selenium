package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		options.addArguments("--headless=new");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demoqa.com/alerts");
	      
        // clicking on prompt button
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
        Thread.sleep(3000);
      
        // accepting javascript alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        // clicking on prompt button
        driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
        Thread.sleep(3000);
      
        // Rejecting javascript alert
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();      
		
		
	}

}
