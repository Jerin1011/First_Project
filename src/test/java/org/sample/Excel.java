package org.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.orangeDemo.PageFactory.InvalidLoginPageFactory;
import org.testng.annotations.Test;
import org.utils.SeleniumBaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel extends SeleniumBaseClass {
//	static XSSFSheet sheet;
//	public static InvalidLoginPageFactory obj = new InvalidLoginPageFactory(driver);
	
//	public static void specificExcelRead(String path, String sheetno, int rownum, int cellnum) throws Exception {
//		FileInputStream file = new FileInputStream(path);
//		XSSFWorkbook wb = new XSSFWorkbook(file);
//		 sheet = wb.getSheet(sheetno);
//		XSSFRow row = sheet.getRow(rownum);
//		String data = row.getCell(cellnum).toString();
////		obj.username.sendKeys(data);
//	}
	
	
	public static void specificRead() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("Specific Read - II");
		FileInputStream file = new FileInputStream("C:\\Users\\jerin\\eclipse-workspace\\Hybrid_Framework\\src\\test\\resources\\Login.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row2 = sheet.getRow(1);
		XSSFCell cell = row2.getCell(1);
//		String stringCellValue = cell.getStringCellValue();
		String data = cell.toString();
Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(data);
//		System.out.println("specific = " + data);
	}
	
	@Test
	public void test() throws Exception {
//		launchBrowser("chrome");
//		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		obj.username.sendKeys(null);
		specificRead();	
	}

	

}
