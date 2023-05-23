package org.orangeDemo.PageClass;

import org.openqa.selenium.WebDriver;
import org.orangeDemo.PageFactory.ForgotElemets;
import org.utils.SeleniumBaseClass;

import com.github.dockerjava.api.model.Driver;

public class ForgotPage extends SeleniumBaseClass {
	
	public static ForgotElemets obj = new ForgotElemets(driver);
	public static void clickForgot() {
		obj.clickforgotbutton.click();
	}
	public static void verifyForgotPage() {
		boolean forgotpagedisplayed = obj.forgotpageverify.isDisplayed();
		if(forgotpagedisplayed) {
			System.out.println("Navigated Successfully to Forgot Page");
		}else {
			System.out.println("Could not Navigated Successfully to Forgot Page");
		}
	}
	public static void verfyOxdText(String orgoxdtext) {
		String oxdtext = obj.verfyoxdtext.getText();
		if(oxdtext.equals(orgoxdtext)) {
			System.out.println("oxd-text correct");
		}else {
			System.out.println("oxd-text is incorrect");
		}
	}
	public static void verfyIcon() {
		boolean icondisplayed = obj.verfyicon.isDisplayed();
		System.out.println("Verifying Icon is displayed = " + icondisplayed);
	}
	public static void UserName(String username) {
		obj.sendusername.sendKeys(username);
	}
	public static void clickResetButton() {
		obj.resetbutton.click();
	}
	public static void validateResetPassword(String orgpassword) {
		String ResetPassword = obj.validateresetpassword.getText();
		if(ResetPassword.equals(orgpassword)) {
			System.out.println("Password Has been changed");
		}else {
			System.out.println("Password Has Not been changed");
		}
	}
	public static void validNoteText(String orgnotetext) {
		String notetext = obj.notetext.getText();
		if(notetext.equals(orgnotetext)) {
			System.out.println("Note Text Is Correctly Matched with the Customer Requirement");
		}else {
			System.out.println("Note Text Is Is not Matched with the Customer Requirement");
		}
	}
}
