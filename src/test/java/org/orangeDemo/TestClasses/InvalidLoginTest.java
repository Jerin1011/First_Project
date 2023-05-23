package org.orangeDemo.TestClasses;

import org.orangeDemo.PageClass.InvalidLogInObj;
import org.testng.annotations.Test;
import org.utils.SeleniumBaseClass;

public class InvalidLoginTest extends SeleniumBaseClass {
	
	@Test
	public void testLogin() throws Exception {
		launchBrowser("chrome");
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		InvalidLogInObj.userName("C:\\Users\\jerin\\eclipse-workspace\\Hybrid_Framework\\src\\test\\resources\\Login.xlsx", "Sheet1");
		
	
	}

}
