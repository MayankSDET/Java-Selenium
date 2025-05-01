package Selenium;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class ReadExcel {
	public static void main(String[] args) throws IOException{


		// Setup Selenium WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); // Replace with your login page

		// Read Excel file
		FileInputStream file = new FileInputStream(new File("D:\\Automation Workspace\\Java-Selenium\\resources\\TestData.xlsx"));
		Workbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheet("LoginData"); // Get sheet by name

		// Read username and password from first row (index 0)
		Row row = sheet.getRow(0);
		String username = row.getCell(0).getStringCellValue();
		String password = row.getCell(1).getStringCellValue();

		// Find and fill login fields
		WebElement userField = driver.findElement(By.id("inputUsername"));
		WebElement passField = driver.findElement(By.xpath("//*[@name='inputPassword']"));
		WebElement checkbox =driver.findElement(By.xpath("//*[@id='chkboxOne']"));
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id='chkboxTwo']"));
		WebElement loginButton =driver.findElement(By.xpath("//*[@class='submit signInBtn']"));

		userField.sendKeys(username);
		passField.sendKeys(password);
		checkbox.click();
		checkbox1.click();
		loginButton.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error']")));
		String error1 = driver.findElement(By.xpath("//p[@class='error']")).getText();
		assertEquals(error1, "* Incorrect username or password");

		// Close resources
		workbook.close();
		file.close();
		driver.quit();
	}
}