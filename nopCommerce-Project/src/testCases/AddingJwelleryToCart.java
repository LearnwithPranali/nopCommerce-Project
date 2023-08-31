package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddingJwelleryToCart {

	@Test
	public void AddingJewlleryToCart() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.xpath("//a[@href=\"/jewelry\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//img[@alt=\"Picture of Flower Girl Bracelet\"]")).click();
		driver.findElement(By.id("add-to-cart-button-41")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();
	}
}
