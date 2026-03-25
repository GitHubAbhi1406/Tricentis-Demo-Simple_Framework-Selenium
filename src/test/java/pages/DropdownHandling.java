package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownHandling{
	
	WebDriver driver;
	WebDriverWait wait;
	
	public DropdownHandling(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	By computer_link = By.xpath("//*[@href='/computers']");
	By notebook_click = By.xpath("//*[@href='/notebooks']");
	
	public void handleDropdownAndClick() {
		
		Actions action = new Actions(driver);
		
		WebElement comp = wait.until(ExpectedConditions.visibilityOfElementLocated(computer_link));
		action.moveToElement(comp).perform();
		
		WebElement note = wait.until(ExpectedConditions.visibilityOfElementLocated(notebook_click));
		
		note.click();
	}
	
	public String assertTitleOfPaage() {
		String actual_title = driver.getTitle();
		
		return actual_title;
	}
}