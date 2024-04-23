package demo3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import demo4.class4;
import demo4.class5;

public class classes2 {
	WebDriver driver;
	class5 obj1;

	@Test
	public void notificationclc() throws InterruptedException {
		obj1 = new  class5(class4.driver);
		obj1.notification.click();
		Thread.sleep(5000);
		obj1.CancelNotify.click();
	}

	@Test
	public void ProdListed() throws InterruptedException {
		obj1 = new  class5(class4.driver);
		obj1.List2(obj1.allElements);
	}

	@Test
	public void verifymypro() {
		obj1 = new  class5(class4.driver);
		obj1.verifypro();
	}
}
/*
 * obj1.notification.click(); Thread.sleep(5000);
 * 
 * 
 * obj1.List2(obj1.allElements); obj1.verifypro(); }
 */
