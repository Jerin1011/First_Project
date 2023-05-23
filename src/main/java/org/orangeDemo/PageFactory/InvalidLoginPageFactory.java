package org.orangeDemo.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.SeleniumBaseClass;

public class InvalidLoginPageFactory extends SeleniumBaseClass{
	WebDriver driver;
	public InvalidLoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;

	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement login;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	public WebElement invalidtext;
	
	
}
