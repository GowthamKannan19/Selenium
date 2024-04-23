package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertClass {

	WebDriver driver;
	
	@Test(priority=0)
	public void driverInit() {
		driver = new ChromeDriver();
		driver.get("https://www.tnpsc.gov.in/");
	}
	
	@Test(priority=1)
	public void getElements() {
		WebElement apply_link = driver.findElement(By.xpath("//h3[text()='Important Links']//parent::div//div//li[2]"));
		apply_link.click();
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		
		
	}
	@Test(priority=2)
	public void getElements2() {
		WebElement counselling = driver.findElement(By.xpath("//h3[text()='Important Links']//parent::div//div//li[7]"));
		counselling.click();
	}
	
	
	
	
	
}
