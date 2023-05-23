package org.orangeDemo.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotElemets {
	WebDriver driver;
	public ForgotElemets(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	public WebElement clickforgotbutton;

	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
	public WebElement forgotpageverify;
		
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p']")
	public WebElement verfyoxdtext;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-person oxd-input-group__label-icon']")
	public WebElement verfyicon;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement sendusername;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement resetbutton;
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
	public WebElement validateresetpassword;
	
	@FindBy(xpath="(//p[@class='oxd-text oxd-text--p'])[3]")
	public WebElement notetext;
	
	@FindAll(@FindBy(xpath="(//p[@class='oxd-text oxd-text--p'])[3]"))
	public WebElement find;
	
	
}
