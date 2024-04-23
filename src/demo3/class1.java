package demo3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import demo4.class4;
import demo4.class5;

public class class1 {

	static WebDriver driver;
	class5 obj;

	@Test
	public void UserName() {

		this.driver = class4.driver;
		obj = new class5(class4.driver);
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		obj.signin.click();
		obj.providemob.sendKeys("7358609072");

	}

	@Test
	public void ClickSignin() {
		obj = new class5(driver);
		obj.OTPGEN.click();
		obj.cancel.click();
	}

	@Test
	public void OTP() throws InterruptedException {
		obj = new class5(driver);
		obj.TypeinSrch.sendKeys("shampoo");
		Thread.sleep(3000);
	}

	@Test
	public void SearchPro() throws InterruptedException {
		obj = new class5(driver);
		obj.PordCart.click();
	}

}

/*
 * obj.SetUrl(); obj.Large(); obj.signin.click(); obj.providemob.sendKeys("");
 * obj.OTPGEN.click(); obj.cancel.click(); obj.TypeinSrch.sendKeys("Shampoo");
 * Thread.sleep(3000); obj.ViewAllPro.click(); obj.PordCart.click();
 * 
 * }
 */

// *@Test(groups = { "start" })
/*
 * public void method1() throws InterruptedException { WebDriver driver = new
 * ChromeDriver();
 * 
 * class5 first = new class5(driver);
 * 
 * first.SetUrl("https://www.medplusmart.com/searchAll/QTo6U2hhbXBvbw==");
 * 
 * first.Large();
 * 
 * first.signin.click();
 * 
 * first.providemob.sendKeys("9361134434");
 * 
 * first.OTPGEN.click();
 * 
 * first.cancelxx.click();
 * 
 * first.fillingtxt.sendKeys("shampoo"); Thread.sleep(3000);
 * 
 * first.VistMorepro.click();
 * 
 * first.List2(first.allElements);
 * 
 * first.ClickCart.click();
 * 
 * first.MainCart.click();
 * 
 * }
 */
