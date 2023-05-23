package org.orangeDemo.TestClasses;

import org.orangeDemo.PageClass.LoginPage;
import org.orangeDemo.PageClass.PIMPageObj;
import org.testng.annotations.Test;
import org.utils.SeleniumBaseClass;

public class PimTestCase extends SeleniumBaseClass  {
	@Test
	public void testPIM() throws InterruptedException {
		SeleniumBaseClass.launchBrowser("chrome");
		SeleniumBaseClass.launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage.verifyLogo();
		LoginPage.sendUserName();
		LoginPage.sendPasswaord();
		LoginPage.logInPage();
		LoginPage.verifyTheLoginPage();
		PIMPageObj.pimPage();
		
		PIMPageObj.validateImageText();
		PIMPageObj. validClickAddDetails("jerin", "A", "10", "Jerin A", "Admin@123");
//		PIMPageObj.pimPage();

	}
}
