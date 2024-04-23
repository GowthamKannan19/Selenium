package Demo2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonPrime {
    
	@FindBy(how = How.CLASS_NAME, using = "Zjopow")
	public static WebElement amazonprime;

	@FindBy(how = How.XPATH, using = "(//ol[@class='ZpvVcj']//li//label//a[@class='qWtUWN'])[1]")
	public static WebElement HomePage;
	
	@FindBy(how = How.XPATH, using = "(//ol[@class='ZpvVcj']//li//label//a[@class='qWtUWN'])[2]")
	public static WebElement Store;

	@FindBy(how = How.XPATH, using = "(//ol[@class='ZpvVcj']//li[@class='d2TCzI']//a[@class='hLHLjl'])[1]")
	public static WebElement LiveTv;

	@FindBy(how = How.XPATH, using = "(//ol[@class='ZpvVcj']//li[@class='d2TCzI']//a[@class='hLHLjl'])[2]")
	public static WebElement categories;

	@FindBy(how = How.XPATH, using = "//input[@class='iLtUZ-']")
	public static WebElement Search;

	@FindBy(how = How.ID, using = "pv-search-nav")
	public static WebElement fillSearch;

	@FindBy(how = How.NAME, using = "//input[@name='reset']")
	public static WebElement clear;

	@FindBy(how = How.CLASS_NAME, using = "B66+8O")
	public static WebElement clickyours;

	@FindBy(how = How.XPATH, using = "(//li[@class='d2TCzI'])[2]")
	public static WebElement TryforFree;

	@FindBy(how = How.XPATH, using = "//div[text()='EN']")
	public static WebElement Languages;

	@FindBy(how = How.XPATH, using = "//label[@class='_1OnVVB']")
	public static WebElement profile;

}
