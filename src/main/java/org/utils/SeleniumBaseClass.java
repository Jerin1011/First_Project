package org.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBaseClass {
	public static WebDriver driver;
	public static Robot r ;
	public static void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\jerin\\eclipse-workspace\\Hybrid_Framework\\src\\test\\resources\\Drivers\\msedgedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jerin\\eclipse-workspace\\Hybrid_Framework\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	}
	public static void launchURL(String url) {
		driver.get(url);
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public static void robotClass() throws AWTException {
		 r = new Robot();
	}
	
	public static void allExcelRead(String path, String sheetno) throws Exception {
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet(sheetno);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<lastCellNum; j++) {
				String data = row.getCell(j).toString();
			}
		}
	}
	
	public static void specificExcelRead(String path, String sheetname, int rownum, int cellnum) throws Exception {
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet(sheetname);
		XSSFRow row = sheet.getRow(rownum);
		String data = row.getCell(cellnum).toString();
	}
}
