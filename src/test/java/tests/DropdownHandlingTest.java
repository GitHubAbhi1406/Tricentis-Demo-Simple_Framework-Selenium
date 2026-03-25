package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.baseTest;
import pages.DropdownHandling;

public class DropdownHandlingTest extends baseTest{
	
	@Test
	public void dropdownPerform() {
		
		DropdownHandling obj = new DropdownHandling(driver, wait);
		
		obj.handleDropdownAndClick();
		String title = obj.assertTitleOfPaage();
		String expected = "Demo Web Shop. Notebooks";
		
		Assert.assertTrue(title.contains(expected), "The titles do not match");
	}
}