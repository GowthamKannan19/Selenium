package demo4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class class5 {

	WebDriver driver;

	static int count = 0;

	public class5(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// public static void SetUrl() {
	/// driver.get("https://www.medplusmart.com/");

	// }

	// public static void Large() {
	// driver.manage().window().maximize();
	// }

	@FindBy(how = How.XPATH, using = "//span[@class='user-name']")
	public WebElement signin;

	@FindBy(how = How.ID, using = "mobileNumber")
	public WebElement providemob;

	@FindBy(how = How.CLASS_NAME, using = "//button[@class='btn btn-brand-gradient rounded-pill btn-block custom-btn-lg']")
	public WebElement OTPGEN;

	@FindBy(how = How.CLASS_NAME, using = "//button[@class='close']")
	public WebElement cancel;

	@FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]")
	public WebElement TypeinSrch;

	@FindBy(how = How.XPATH, using = "(//a[@href='javascript:void();'])[16]")
	public WebElement ViewAllPro;

	@FindBy(how = How.XPATH, using = "//h6[@class='truncate-line-2']")
	public List<WebElement> allElements;

	public void List2(List<WebElement> ele) throws InterruptedException {

		Thread.sleep(10000);

		for (WebElement each : ele) {

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

	@FindBy(how = How.CLASS_NAME, using = "(//button[@class='btn btn-block btn-brand-gradient rounded-pill custom-btn-lg'])[1]")
	public WebElement PordCart;

	@FindBy(how = How.XPATH, using = "//span[@title='Shopping Cart']")
	public WebElement MainCart;

	public void verifypro() {
		WebElement verify = driver.findElement(By.xpath("//td[text()='KETOCIP 100ML 1% SHAMPOO']"));
		String text = verify.getText();
		Assert.assertEquals(text, "KETOCIP 100ML 1% SHAMPOO");
	}
	// @FindBy(how = How.XPATH, using = "//td[@class='col-sm-6 col-md-6']")
	// public WebElement inCart;

	@FindBy(how = How.XPATH, using = "//span[@class='clr-cart']")
	public WebElement removecart;

	@FindBy(how = How.XPATH, using = "//button[@class='mx-2 btn px-2 border-0']")
	public WebElement notification;
	@FindBy(how = How.XPATH, using = "//button[@aria-label='Close']")
	public WebElement CancelNotify;

}
