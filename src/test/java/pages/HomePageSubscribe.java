 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSubscribe{
	 
	 WebDriver driver;
	 WebDriverWait wait;
	 
	 public HomePageSubscribe(WebDriver driver, WebDriverWait wait) {
		 this.driver = driver;
		 this.wait = wait;
	 }
	 
	 By subs_text = By.id("newsletter-email");
	 By subs_button = By.id("newsletter-subscribe-button");
	 By success_msg = By.id("newsletter-result-block");
	 
	 
	 public void enterEmailForSubscription(String emailId) {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(subs_text));
		 driver.findElement(subs_text).sendKeys(emailId);
	 }
	 
	 public void clickSubsButton() {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(subs_button));
		 driver.findElement(subs_button).click();
	 }
	 
	 public String getSuccessMessage() {
		 wait.until(ExpectedConditions.textToBePresentInElementLocated(success_msg, "Thank you for signing up! A verification email has been sent. We appreciate your interest."));
		 
		 return driver.findElement(success_msg).getText();
	 }
 }