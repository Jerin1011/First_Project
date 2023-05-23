package org.orangeDemo.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPageFactory {
	WebDriver driver;
	public AdminPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	public WebElement loginverify;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	public WebElement clickadminbutton;

	@FindBy(xpath="//div[@class='oxd-topbar-header-title']")
	public WebElement adminpageverify;

	@FindBy(xpath="(//button[@type='button'])[4]")
	public WebElement clickaddbutton;
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	public WebElement verifyaddpage;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	public WebElement Userrole;
	
	@FindBy(xpath="(//div[@class='oxd-select-text--after'])[2]")
	public WebElement clickrolebutton;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement username;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	public WebElement password;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	public WebElement confirmpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement clicksavebutton;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	public WebElement clickcancelbutton;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement adminusername;
	
	@FindBy(xpath="//div[@class='oxd-table-cell oxd-padding-cell']")
	public List <WebElement> recordfound;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement clicksearchbutton;

	@FindBy(xpath="(//div[@class='oxd-table-cell oxd-padding-cell'])[1]")
	public WebElement RecordFoundusername;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span'])[1]")
	public WebElement Recordfoundgetext;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	public WebElement statusrole;
	
	@FindBy(xpath="//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
	public WebElement employeename;
	
	@FindBy(xpath="//div[@role='columnheader']")
	public List <WebElement> columnheader;
	
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
//	@FindBy(xpath="")
//	public WebElement clickadminbutton;
	
}
