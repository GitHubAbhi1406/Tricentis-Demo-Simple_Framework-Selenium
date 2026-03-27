package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.baseTest;
import pages.CartsPage;

public class CartsPageTest extends baseTest{
	
	@Test
	public void performValidations() {
		
		CartsPage obj = new CartsPage(driver, wait);
		
		obj.clickCartButton();
		obj.quantity(1);
		obj.selectQuant();
		obj.acceptTerms();
		obj.clickAcceptButton();
		
		String expected = "Demo Web Shop. Checkout";
		String actual = obj.titleOfPage();
		
		Assert.assertTrue(actual.contains(expected), "Titles do not match");
	}
}