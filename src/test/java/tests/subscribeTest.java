package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.baseTest;
import pages.HomePageSubscribe;

public class subscribeTest extends baseTest{
	
	@Test
	public void validateSubscribeFunctionality() {
		
		HomePageSubscribe obj = new HomePageSubscribe(driver, wait);
		
		obj.enterEmailForSubscription("TestUseremail@gmail.com");
		obj.clickSubsButton();
		
		String actual_text = obj.getSuccessMessage();
		String expected_text = "Thank you for signing up! A verification email has been sent. We appreciate your interest.";
		
		System.out.println(actual_text);
		
		Assert.assertTrue(actual_text.contains(expected_text), "Thank You message does not match as expected");
	}
}