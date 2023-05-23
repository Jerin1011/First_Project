package org.orangeDemo.TestClasses;

import java.awt.AWTException;

import org.orangeDemo.PageClass.AdminPageObj;
import org.orangeDemo.PageClass.LoginPage;
import org.testng.annotations.Test;
import org.utils.SeleniumBaseClass;

public class AdminPageTest extends SeleniumBaseClass{
	@Test
	public void adminModuleTest() throws Exception {
		
//		LoginPage.commonLogin();
		launchBrowser("chrome");
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage.verifyLogo();
		LoginPage.sendUserName();
		LoginPage.sendPasswaord();
		LoginPage.logInPage();
		LoginPage.verifyTheLoginPage();
		AdminPageObj.clickAdmin();
		AdminPageObj.adminPageValidate();
//		AdminPageObj.clickAddButton();
//		AdminPageObj.validateAddPage();
		
		AdminPageObj.selectUserRole();
		
		
//		AdminPageObj.employeeName("Peter Mac Anderson");
//		AdminPageObj.sendUserName("Jerin A");
//		AdminPageObj.password("Admin@00", "Admin@00");
//		AdminPageObj.statusRole();
//		AdminPageObj.clickCancelButton();
//		AdminPageObj.clickSaveButton();
//		AdminPageObj.adminUserName("Jerin A");
//		AdminPageObj.recordFound();
	}
}
