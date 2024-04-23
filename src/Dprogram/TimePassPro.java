package Dprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TimePassPro {

	public static void main(String[] args) throws AWTException {

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.facebook.com/");

//		WebElement search_button = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		search_button.click();
//
//		WebElement val = driver.findElement(By.xpath("//input[@value='1']"));
//		val.click();
//
//		WebElement fname = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
//		fname.sendKeys("dfdss");

		// JavascriptExecutor js = (JavascriptExecutor) driver;

		// js.executeScript("arguments[0].setAttribute('value','Sanitizer')",
		// search_button);

		// WebElement click_btn =
		// driver.findElement(By.xpath("//input[contains(@id,'submit-button')]"));

		// click_btn.click();
		
		driver.get("https://www.amazon.in/");
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Fresh']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(ele1).perform();

	}
}
