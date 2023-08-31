package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Register {

	@Test
	public void RegisterUser() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("A");
		driver.findElement(By.id("LastName")).sendKeys("Z");
		WebElement dropdown_birth = driver.findElement(By.name("DateOfBirthDay"));
		Select sec = new Select(dropdown_birth);
		sec.selectByVisibleText("24");
		
		WebElement dropdown = driver.findElement(By.name("DateOfBirthMonth"));
		Select sec1 = new Select(dropdown);
		sec1.selectByValue("2");
		
		WebElement dropdown_year = driver.findElement(By.name("DateOfBirthYear"));
		Select sec2 = new Select(dropdown_year);
		sec2.selectByVisibleText("2000");
		driver.findElement(By.id("Email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("AZppp@01");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("AZppp@01");
		driver.findElement(By.id("register-button")).click();
		driver.close();
	}
}
