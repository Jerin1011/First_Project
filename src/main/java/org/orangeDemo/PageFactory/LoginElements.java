package org.orangeDemo.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {
	WebDriver driver;
	public LoginElements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt='company-branding']")
	public WebElement Logo;

	@FindBy(xpath="(//p[@class='oxd-text oxd-text--p'])[1]")
	public WebElement gettextusername;

	@FindBy(xpath="(//p[@class='oxd-text oxd-text--p'])[2]")
	public WebElement gettextpassword;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;

	@FindBy(xpath="//input[@name='password']")
	public WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	public static WebElement login;
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	public WebElement loginverify;
}
