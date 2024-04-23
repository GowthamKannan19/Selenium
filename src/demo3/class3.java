package demo3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import demo4.class4;
import demo4.class5;

public class class3 {
	WebDriver driver;
	class5 obj3;

	@Test
	public void GoToADDtocart() throws InterruptedException {
		obj3 = new class5(class4.driver);
		obj3.MainCart.click();
	}

	@Test
	public void verifyproduct() throws InterruptedException {
		obj3 = new class5(class4.driver);
		obj3.verifypro();
		Thread.sleep(10000);
	}

	@Test
	public void RemoveMYpro() {
		obj3 = new class5(class4.driver);
		obj3.removecart.click();
	}
}
