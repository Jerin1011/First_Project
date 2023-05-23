package org.orangeDemo.PageClass;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.orangeDemo.PageFactory.InvalidLoginPageFactory;
import org.orangeDemo.PageFactory.LoginElements;
import org.utils.SeleniumBaseClass;

public class InvalidLogInObj extends SeleniumBaseClass{
	public static InvalidLoginPageFactory obj = new InvalidLoginPageFactory(driver);

	public static void userName(String path, String sheetno) throws Exception {
			
			FileInputStream file = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheet(sheetno);
			
			int lastRowNum = sheet.getLastRowNum();
			int lastCellNum = sheet.getRow(0).getLastCellNum();
			System.out.println("TR: "+lastRowNum);
			System.out.println("TC: " + lastCellNum);
		
			
			for(int i=1; i<=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
					String username = row.getCell(1).getStringCellValue();
					String password = row.getCell(2).getStringCellValue();
//					String result = row.getCell(3).getStringCellValue();
//					System.out.println(username);
//					System.out.println(password);
					
					obj.username.sendKeys(username);
					obj.password.sendKeys(password);
					obj.login.click();
			Thread.sleep(3000);
			if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
			{
				System.out.println("Test No: "+i + "\n"+username+"\n"+password+"\n"+ "The given Credentials for user name and password is correct");
				driver.close();
			}else if(obj.invalidtext.getText().equals("Invalid credentials")) {
				System.out.println("Test No: "+i + " Invalid Credentials " + "\n"+"UserName: " + username + "\n" +"Password: "+ password+"\n"+"*************************"+"\n");
			}else {
				System.out.println("Wrong Inspect");
			}
	}
			
	}
}
