package tests;

import org.testng.annotations.Test;
import base.baseTest;
import pages.LoginPage;

public class LoginTest extends baseTest{
	
	@Test
	public void validateLogin() {
		
		LoginPage obj = new LoginPage(driver, wait);
		
		obj.clickLoginLink();
		obj.enterEmail("HImmatSingh@gmail.com");
		obj.enterPassword("counterStrike@123");
		obj.clickLoginButton();
	}
}