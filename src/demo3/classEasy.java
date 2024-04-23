package demo3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classEasy {

	static WebDriver driver;

	static int count = 0;

	public classEasy(WebDriver driver) {
		this.driver = driver;
	}

	public static void getUrl(String name) {
		driver.get(name);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void FindSign() {
		WebElement singup = driver.findElement(By.xpath("//span[@class='user-name']"));
		singup.click();
	}

	public static void mobilenumber(String num) {
		WebElement moblie = driver.findElement(By.id("mobileNumber"));
		moblie.sendKeys(num);
	}

	public static void ClickOTP() {
		WebElement sendOTP = driver.findElement(
				By.xpath("//button[@class='btn btn-brand-gradient rounded-pill btn-block custom-btn-lg']"));
		sendOTP.click();
	}

	public static void clearinfo() {
		WebElement cancel = driver.findElement(By.xpath("//button[@class='close']"));
		cancel.click();
	}

	public static void TypeinSrch() {
		WebElement TypeinSrch = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		TypeinSrch.sendKeys("Shampoo\n");
	}

	public static void visitmoreprod() {
		WebElement viewall = driver.findElement(By.xpath("(//a[@href='javascript:void();'])[16]"));
		viewall.click();

	}

	public static void listingEle() throws InterruptedException {

		Thread.sleep(10000);
		List<WebElement> listing = driver.findElements(By.xpath("//h6[@class='truncate-line-2']"));
		System.out.println(listing.size());

		for (WebElement each : listing) {

			String text = each.getText();

			count++;

		}

		if (count > 1) {

			System.out.println("more than one product");

		}

		else {

			System.out.println("only one prouct listed");
		}

	}

	public static void AddCart() throws InterruptedException {
		Thread.sleep(5000);
		WebElement AddToCart = driver.findElement(
				By.xpath("(//button[@class='btn btn-block btn-brand-gradient rounded-pill custom-btn-lg'])[1]"));
		AddToCart.click();

	}

	public static void GotoCart() {
		WebElement Going = driver.findElement(By.xpath("//span[@class='border-0 bg-transparent position-relative']"));
		Going.click();
	}

	public static void verifyprod() {
		WebElement verify = driver.findElement(By.xpath("//td[@class='col-sm-6 col-md-6']"));
		System.out.println(verify.isDisplayed());

	}

	public static void Quit() {
		driver.quit();
	}
}
