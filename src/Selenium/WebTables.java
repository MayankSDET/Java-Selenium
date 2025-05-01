package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTables {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Alfreds Futterkiste", "Centro comercial Moctezuma", "Ernst Handel"));
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='customers']//td")); 

		// Extract text from WebElements and store in a new list
		List<String> extractedTexts = new ArrayList<>();
		for (WebElement element : elements) {
			extractedTexts.add(element.getText());
		}

		// Check if the extracted text list contains all expected values
		if (extractedTexts.containsAll(list)) {
			System.out.println("All expected items are present in the table!");
		} else {
			System.out.println("Some items are missing.");
		}

		// Print extracted texts for debugging
		System.out.println("Extracted texts: " + extractedTexts);



		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		for(int i =2; i<=7; i++) {
			String absoluteXpath = beforeXpath+i+afterXpath;
			WebElement element = driver.findElement(By.xpath(absoluteXpath));
			System.out.println(element.getText());
		}
		driver.quit();

	}

}
