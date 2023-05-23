package org.orangeDemo.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPageFactory {

	
	WebDriver driver;
	public PimPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
	public WebElement clickpimbutton;
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	public WebElement verifypim;

	@FindBy(xpath="(//button[@type='button'])[3]")
	public WebElement clickaddbutton;
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	public WebElement addgettext;
		
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement lastname;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement empid;
	
	@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	public WebElement loginradiobutton;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[1]")
	public WebElement addusername;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	public WebElement addpass;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[3]")
	public WebElement addconfirmpass;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	public WebElement exceedempid;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-input-hint']")
	public WebElement validimagetext;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement clicksavebutton;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error']")
	public WebElement empclear;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	public WebElement usernameexit;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	public WebElement clickcancelbutton;
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	public WebElement empname;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span'])[1]")
	public WebElement recfoundtext;	
	
	@FindBy(xpath="//div[@class='oxd-table-cell oxd-padding-cell']")
	public List <WebElement> records;

//	@FindBy(xpath="")
//	public WebElement empname;
//	@FindBy(xpath="")
//	public WebElement empname;
//	@FindBy(xpath="")
//	public WebElement empname;
	
//	@FindBy(xpath="")
//	public WebElement empname;
//	@FindBy(xpath="")
//public WebElement empname;
}