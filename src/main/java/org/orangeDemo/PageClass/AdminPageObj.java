package org.orangeDemo.PageClass;

import static org.testng.Assert.expectThrows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.orangeDemo.PageFactory.AdminPageFactory;
import org.utils.SeleniumBaseClass;

public class AdminPageObj extends SeleniumBaseClass{
//	public static Robot r; 
	public static String columnheadertext;
	public static AdminPageFactory obj = new AdminPageFactory(driver);
	public static JavascriptExecutor js; 
	public static Actions a;
	
	public static void verifyTheLoginPage() {
		 
		boolean loginvery = obj.loginverify.isDisplayed();
		if(loginvery) {
			System.out.println("Login Successfully");
		}else {
			System.out.println("D'not Login Successfully");
		}
	}
	
	public static void clickAdmin() {
		obj.clickadminbutton.click();
	}
	public static void adminPageValidate() {
		String adminmodulepagetext = obj.adminpageverify.getText();
			
			if(adminmodulepagetext.equals("Admin / User Management")){
				System.out.println("Navigate to Admin Module Sucessfully");
			}else {
				System.out.println("Unable to Naviagte Admin Module Sucessfully");
			}
	}
	
	public static void clickAddButton() {
		obj.clickaddbutton.click();
	}
	
	public static void validateAddPage() {
		String validateaddpagetext = obj.verifyaddpage.getText();
		if(validateaddpagetext.equals("Add User")){
			System.out.println("Navigate to Add Page Sucessfully");
		}else {
			System.out.println("Unable to Naviagte Add Page Sucessfully");
		}
	}
	
	public static void selectUserRole() throws InterruptedException, AWTException {
		obj.Userrole.click();
		Thread.sleep(2000);
//		SeleniumBaseClass.robotClass();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ESCAPE);
//		r.keyRelease(KeyEvent.VK_ESCAPE);	
		
		a = new Actions(driver);
		WebElement clickrolebutton = driver.findElement(By.xpath("(//div[text()='Admin'])[1]"));
		Thread.sleep(2000);
		a.moveToElement(clickrolebutton).build().perform();
		clickrolebutton.click();
		Thread.sleep(2000);
	}
	
	public static void statusRole() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		obj.statusrole.click();
		Thread.sleep(2000);
		SeleniumBaseClass.robotClass();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	public static void employeeName(String empname) {
		obj.employeename.sendKeys(empname);
	}
	
	public static void sendUserName(String username) {
		obj.username.sendKeys(username);
	}
	
	public static void password(String pass, String confirmpass) {
		obj.password.sendKeys(pass);
		obj.confirmpassword.sendKeys(confirmpass);
		}
	
	public static void clickSaveButton() {
		obj.clicksavebutton.click();
	}
	
	public static void clickCancelButton() {
		obj.clickcancelbutton.click();
	}
	
	public static void adminUserName(String ausername) {
		obj.adminusername.sendKeys(ausername);
		obj.clicksearchbutton.click();
	}
	
	public static void recordFound() throws InterruptedException {
		
		Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver , 20);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(obj.RecordFoundusername));
		if(obj.Recordfoundgetext.getText().equals("No Records Found")) {
			System.out.println("No Records Found For the Given UserName");
		}else {
//			for(WebElement headertext : obj.columnheader) {
//			columnheadertext = headertext.getText();
//			}
			for(WebElement rec: obj.recordfound) {
				String recordtext = rec.getText();
			System.out.println("Record Found For  : " + recordtext);
			}
		}
		
	}
	
	
	
}
