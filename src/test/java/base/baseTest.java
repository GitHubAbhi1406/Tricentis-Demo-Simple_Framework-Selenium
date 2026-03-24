package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest{
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Launching browser...");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing browser...");
		driver.quit();
	}
}