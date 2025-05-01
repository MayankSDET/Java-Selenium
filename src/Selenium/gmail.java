package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gmail {
	
	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		FileInputStream fis = new FileInputStream("D:\\Automation Workspace\\Java-Selenium\\resources\\TestData.xlsx");
		XSSFWorkbook wokbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wokbook.getSheet("Searchdata");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		String str = cell.getStringCellValue().toString();
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(str);
		
			
		}
		
		
		
	}


