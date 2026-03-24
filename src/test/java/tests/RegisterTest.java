package tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.baseTest;
import pages.RegisterPage;

public class RegisterTest extends baseTest{
	
	
	@Test
	public void registerPage() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
		
		RegisterPage page = new RegisterPage(driver);
		
		page.clickRegisterLink();
		page.selectGender();
		page.sendFirstName("TestFirstName");
		page.sendLastName("LastNameuser");
		page.sendEmail("HImmatSingh@gmail.com");
		page.sendPassword("counterStrike@123");
		page.sendConfirmPassword("counterStrike@123");
		page.clickRegisterButton();
	}
	

}