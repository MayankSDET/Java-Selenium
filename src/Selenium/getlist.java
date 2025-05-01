package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getlist {

	
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.bigbasket.com/");
		//*[@id="siteLayout"]/header[2]/div[1]/div[2]/div[2]/div
		driver.findElement(By.xpath("//*[@id=\"siteLayout\"]/header[2]/div[2]/div[3]/a[2]/img")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@qa='product_name']//a[@class='ng-binding']"));
		
		int size = elements.size();
		for (WebElement element : elements) {
            System.out.println(element.getText());
           
 		}
        }
	}

