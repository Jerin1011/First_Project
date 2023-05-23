package org.orangeDemo.PageClass;

import org.openqa.selenium.WebElement;
import org.orangeDemo.PageFactory.PimPageFactory;
import org.utils.SeleniumBaseClass;

public class PIMPageObj extends SeleniumBaseClass {
		public static PimPageFactory obj = new PimPageFactory(driver);
		
	public static void pimPage() {
		obj.clickpimbutton.click();
		if(obj.verifypim.getText().equals("PIM")) {
			System.out.println("Page Navigate Sucessfully To PIM");
		}else {
			System.out.println("Page Uable to Navigate Sucessfully to PIM");
		}
	}
	
	public static void invalidAddDetails(String empid) {
		
		obj.clickaddbutton.click();
		obj.empid.sendKeys(empid);
		if(obj.exceedempid.getText().equals("Should not exceed 10 characters")) {
			obj.empclear.clear();
		}else {
			obj.empclear.clear();
		}
	}
	
	public static void validateImageText() {
//		obj.clickpimbutton.click();
		obj.clickaddbutton.click();
		if(obj.validimagetext.getText().equals("Accepts jpg, .png, .gif up to 1MB. Recommended dimensions: 200px X 200px")){
			System.out.println("The Given Image Accepts Text is Satisfied the Customer Requirement");
		}else {
			System.out.println("The Given Image Accepts Text is Not Satisfied the Customer Requirement");
		}
	}
	
	public static void validClickAddDetails(String firstname, String lastname, String empid,String addusername, String addpassname) throws InterruptedException {
//		obj.clickaddbutton.click();
		if(obj.addgettext.getText().equals("Add Employee")) {
			obj.firstname.sendKeys(firstname);
			obj.lastname.sendKeys(lastname);
			obj.empid.clear();
			Thread.sleep(3000);
			obj.empid.sendKeys(empid);
			obj.loginradiobutton.click();
			obj.addusername.sendKeys(addusername);
			obj.addpass.sendKeys(addpassname);
			obj.addconfirmpass.sendKeys(addpassname);
			obj.clicksavebutton.click();
			if(obj.usernameexit.getText().equals("Username already exists")) {
				obj.clickcancelbutton.click();
				obj.empname.sendKeys(addusername);
				obj.submit.click();
				
				String rectext = obj.recfoundtext.getText();
				if(rectext.equals(rectext)) {
					for(WebElement Allrecordtext : obj.records) {
						String text = Allrecordtext.getText();
						System.out.println(text);
					}
					}else {
						System.out.println("There is No Record Found");
					
				}
			}else {
				obj.clicksavebutton.click();
			}
			
		}
		
		
	}
	
}
