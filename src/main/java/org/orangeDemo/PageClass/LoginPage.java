package org.orangeDemo.PageClass;

import org.orangeDemo.PageFactory.LoginElements;
import org.utils.SeleniumBaseClass;


public class LoginPage extends SeleniumBaseClass{
	public static String[] usernamesplit;
	public static String[] passwordsplit;
	public static LoginElements obj = new LoginElements(driver);
	public static void verifyLogo() {
		boolean displayed = obj.Logo.isDisplayed();
		if(displayed) {
			System.out.println("Logo is Displayed");
		}else {
			System.out.println("Logo is not Displayed");
		}
	}
	
	public static void getUserName() {
		String username = obj.gettextusername.getText();
		usernamesplit = username.split(" : ");
	}
	
	public static void getPassword() {
		String password = obj.gettextpassword.getText();
		passwordsplit = password.split(" : ");
	}
	public static void sendUserName() {
		getUserName();
		obj.username.sendKeys(usernamesplit[1]);
	}
	public static void sendPasswaord() {
		getPassword();
		obj.password.sendKeys(passwordsplit[1]);
	}
	public static void logInPage() {
		obj.login.click();
	}
	public static void verifyTheLoginPage() {
		boolean loginvery = obj.loginverify.isDisplayed();
		if(loginvery) {
			System.out.println("Login Successfully");
		}else {
			System.out.println("D'not Login Successfully");
		}
	}
	
	public static void commonLogin() {
		SeleniumBaseClass.launchBrowser("chrome");
		SeleniumBaseClass.launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage.verifyLogo();
		LoginPage.sendUserName();
		LoginPage.sendPasswaord();
		LoginPage.logInPage();
		LoginPage.verifyTheLoginPage();
	}
}
