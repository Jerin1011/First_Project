package org.orangeDemo.PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModuleElements {
	WebDriver driver;
	public ModuleElements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	public List<WebElement> module;

}
