package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

//FindAll - ||
//FindBys- && 
public class Launch2 {
	// @FindAll({ @FindBy(how = How.XPATH, using = "/input[@aria-label='Phone
	// number, username, or email']"),
	// @FindBy(id = "username"), @FindBy(how = How.ID, using = "username") })
	@FindBy(xpath = "/input[@aria-label='Phone number, username, or email']")
	public static WebElement username;

	@FindBys({ @FindBy(how = How.XPATH, using = "//input[@aria-label='password']"),
			@FindBy(how = How.ID, using = "pass"), @FindBy(id = "pass") })
	@FindBy(id = "pass")
	public static WebElement pass;

	@FindAll({ @FindBy(how = How.XPATH, using = "Log"), @FindBy(id = "Log") })
	@FindBy(id = "Log")
	public static WebElement Log;

	public static WebElement VerifyHomePage;

	/*
	 * //public static WebElement username(WebElement driver) { return
	 * driver.findElement(By.id("email"));
	 * 
	 * }
	 * 
	 * public static WebElement pass(WebElement driver) { return
	 * driver.findElement(By.id("pass"));
	 * 
	 * }
	 * 
	 * public static WebElement Log(WebElement driver) { return
	 * driver.findElement(By.
	 * xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")); }
	 */

}
