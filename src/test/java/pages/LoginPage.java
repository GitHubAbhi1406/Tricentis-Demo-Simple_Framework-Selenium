package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
	
	WebDriver driver;
	WebDriverWait wait;
	
		public LoginPage(WebDriver driver, WebDriverWait wait) {
			this.driver = driver;
			this.wait = wait;
		}
		
		
		By login_link = By.partialLinkText("Log in");
		By email_text = By.id("Email");
		By pass_text = By.id("Password");
		By login_button = By.xpath("//*[@class='button-1 login-button']");
		
		
		public void clickLoginLink() {
			wait.until(ExpectedConditions.elementToBeClickable(login_link));
			driver.findElement(login_link).click();
		}
		
		public void enterEmail(String emailText) {
			driver.findElement(email_text).sendKeys(emailText);
		}
		
		public void enterPassword(String pw) {
			driver.findElement(pass_text).sendKeys(pw);
		}
		
		public void clickLoginButton() {
			driver.findElement(login_button).click();
		}
}