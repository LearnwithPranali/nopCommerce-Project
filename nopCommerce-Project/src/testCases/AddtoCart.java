package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddtoCart {

	@Test
	public void AddBookToCart() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.xpath("//a[@href=\"/books\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/pride-and-prejudice\"]")).click();
		driver.findElement(By.id("add-to-cart-button-39")).click();
		
		
	}
}
