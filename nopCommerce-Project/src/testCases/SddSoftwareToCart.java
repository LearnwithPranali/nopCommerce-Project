package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SddSoftwareToCart {

	
	@Test
	public void AddClothToWishlist() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
		
	WebElement Computer_dropdown =  driver.findElement(By.xpath("//a[@href=\'/computers\']"));
	Actions actions = new Actions(driver);
	actions.pause(Duration.ofSeconds(5)).
	moveToElement(Computer_dropdown).
	moveToElement(driver.findElement(By.xpath("//a[@href=\"/software\"]"))).click().perform();
	
	driver.findElement(By.xpath("//a[text()='Windows 8 Pro']")).click();
	driver.findElement(By.id("add-to-cart-button-11")).click();
	driver.findElement(By.id("product_enteredQuantity_11")).click();
	
	
	}
}
