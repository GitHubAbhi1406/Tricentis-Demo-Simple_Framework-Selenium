package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartsPage{
	
	WebDriver driver;
	WebDriverWait wait;
	
		public CartsPage(WebDriver driver, WebDriverWait wait) {
			this.driver = driver;
			this.wait = wait;
		}
		
		By cartLink = By.xpath("//*[@href='/cart']");
		By quant = By.cssSelector(".qty-input");
		By checkBox = By.xpath("//input[@type='checkbox' and @name='removefromcart']");
		By terms = By.xpath("//input[@id='termsofservice']");
		By acceptButton = By.xpath("//button[@id='checkout']");
		
		public void clickCartButton() {
			
			WebElement cl = wait.until(ExpectedConditions.elementToBeClickable(cartLink));
			cl.click();
		}
		
		public void quantity(int x) {
			
			WebElement quanti = wait.until(ExpectedConditions.visibilityOfElementLocated(quant));
			quanti.clear();
			quanti.sendKeys(String.valueOf(x));
		}
		
		public void selectQuant() {
			
			WebElement findBox = wait.until(ExpectedConditions.elementToBeClickable(checkBox));
			findBox.click();
		}
		
		public void acceptTerms() {
			
			WebElement box = wait.until(ExpectedConditions.visibilityOfElementLocated(terms));
			box.click();
		}
		
		public void clickAcceptButton() {
			
			WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(acceptButton));
			checkBox.click();
		}
		
		public String titleOfPage() {
			String title = driver.getTitle();
			
			return title;
		}
}