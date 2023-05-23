package org.orangeDemo.TestClasses;

import org.orangeDemo.PageClass.LoginPage;
import org.orangeDemo.PageClass.ModulePage;
import org.testng.annotations.Test;
import org.utils.SeleniumBaseClass;


public class ModulePageTest extends SeleniumBaseClass{
	@Test
	public void moduleTest() {
		launchBrowser("chrome");
		launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage.verifyLogo();
		LoginPage.sendUserName();
		LoginPage.sendPasswaord();
		LoginPage.logInPage();

		ModulePage.findElements();
		
	}

}
