package org.orangeDemo.TestClasses;

import org.orangeDemo.PageClass.ForgotPage;
import org.orangeDemo.PageClass.LoginPage;
import org.testng.annotations.Test;
import org.utils.SeleniumBaseClass;

public class forgitPageTest extends SeleniumBaseClass{
	
	
	@Test
	public void forgot() {
		launchBrowser("chrome");
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage.verifyLogo();
		ForgotPage.clickForgot();
		ForgotPage.verifyForgotPage();
		ForgotPage.verfyIcon();
		ForgotPage.verfyOxdText("Please enter your username to identify your account to reset your password");
		ForgotPage.UserName("12365");
		ForgotPage.clickResetButton();
		ForgotPage.validateResetPassword("Reset Password link sent successfully");
		ForgotPage.validNoteText("If the email does not arrive, please contact your OrangeHRM Administrator.");
		
	}

}
