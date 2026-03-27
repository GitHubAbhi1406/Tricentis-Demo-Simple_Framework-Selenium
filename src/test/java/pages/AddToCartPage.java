package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage{
	
	WebDriver driver;
	WebDriverWait wait;
	
		public AddToCartPage(WebDriver driver, WebDriverWait wait) {
			this.driver = driver;
			this.wait = wait;
		}
		
	
		By electronics = By.xpath("//*[@href='/electronics']");
		By cellPhones = By.xpath("//*[@href='/cell-phones']");
		By addToCartButton = By.cssSelector(".product-box-add-to-cart-button");
		By successBar = By.cssSelector(".bar-notification.success");
		
		public void hoverToElectronics() {
			
			Actions action = new Actions(driver);
			
			WebElement elec = wait.until(ExpectedConditions.elementToBeClickable(electronics));
			action.moveToElement(elec).perform();
			
			WebElement cell = wait.until(ExpectedConditions.elementToBeClickable(cellPhones));
			cell.click();
		}
		
		public String assertCellPhonesPage() {
			String title_cell = driver.getTitle();
			
			return title_cell;
		}
		
		public void addingTaskValidation() {
			driver.findElement(addToCartButton).click();
		}
		
		public String validateAdded() {
			
			return wait.until(ExpectedConditions.visibilityOfElementLocated(successBar)).getText();
		}
}