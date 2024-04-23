package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parallelTest {
@Test
	public void openmythra() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

	}
@Test
	public void openFlipkart() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}
@Test
	public void openAmazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}
@AfterMethod
	public void Quit() {
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}
}
