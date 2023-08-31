package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddToWishlist {

	@Test
	public void AddClothToWishlist() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
		
	WebElement Apparel_dropdown =  driver.findElement(By.xpath("//a[@href=\'/apparel\']"));
	Actions actions = new Actions(driver);
	actions.pause(Duration.ofSeconds(5)).
	moveToElement(Apparel_dropdown).
	moveToElement(driver.findElement(By.xpath("//a[@href=\"/clothing\"]"))).click().perform();
	
	driver.findElement(By.xpath("//a[text()='Oversized Women T-Shirt']")).click();
	driver.findElement(By.id("add-to-wishlist-button-28")).click();
	
	}
}
