package tests;

import org.testng.annotations.Test;
import base.baseTest;
import pages.AddToCartPage;
import pages.LoginPage;

public class AddToCartTest extends baseTest{
	
	@Test
	public void validations() {
		
		LoginPage obj = new LoginPage(driver,wait);
		
		obj.clickLoginLink();
		obj.enterEmail("HImmatSingh@gmail.com");
		obj.enterPassword("counterStrike@123");
		obj.clickLoginButton();
		
		
		AddToCartPage test = new AddToCartPage(driver, wait);
		
		test.hoverToElectronics();
		test.assertCellPhonesPage();
		test.addingTaskValidation();
		test.validateAdded();
	}
}