package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage{
	
	WebDriver driver;
	WebDriverWait wait;
	
	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	By register_link = By.linkText("Register");
	By gender = By.id("gender-male");
	By fname = By.id("FirstName");
	By lname = By.id("LastName");
	By email = By.id("Email");
	By password = By.id("Password");
	By cpass = By.id("ConfirmPassword");
	By register_button = By.id("register-button");
	By success_msg = By.cssSelector(".message-error li");
	
	public void clickRegisterLink() {
		driver.findElement(register_link).click();
	}
	
	public void selectGender() {
		driver.findElement(gender).click();
	}
	
	public void sendFirstName(String firstname) {
		driver.findElement(fname).sendKeys(firstname);
	}
	
	public void sendLastName(String lastname) {
		driver.findElement(lname).sendKeys(lastname);
	}
	
	public void sendEmail(String useremail) {
		driver.findElement(email).sendKeys(useremail);
	}
	
	public void sendPassword(String pw) {
		driver.findElement(password).sendKeys(pw);
	}
	
	public void sendConfirmPassword(String cpw) {
		driver.findElement(cpass).sendKeys(cpw);
	}
	
	public void clickRegisterButton() {
		driver.findElement(register_button).click();
	}
	
	public String getDuplicateEmailError() {
		
		try {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(success_msg)).getText();
		}
		catch(Exception e) {
			return "";
		}
	}
}