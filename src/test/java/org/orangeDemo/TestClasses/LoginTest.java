package org.orangeDemo.TestClasses;

import org.orangeDemo.PageClass.ForgotPage;
import org.orangeDemo.PageClass.LoginPage;
import org.testng.annotations.Test;
import org.utils.SeleniumBaseClass;

public class LoginTest extends SeleniumBaseClass {

	@Test
	public void logIn() {
		launchBrowser("chrome");
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage.verifyLogo();
		LoginPage.sendUserName();
		LoginPage.sendPasswaord();
		LoginPage.logInPage();
		LoginPage.verifyTheLoginPage();

//		Forgot page
		ForgotPage.clickForgot();
		ForgotPage.verifyForgotPage();
	}
	
}
