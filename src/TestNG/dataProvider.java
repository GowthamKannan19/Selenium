package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	/* 
	 * @DataProvider(name = "LogIn") public Object[][] provideValue() { Object[][]
	 * value = new Object[2][2];
	 * 
	 * // row1 value[0][0] = "gowthamjillo1919@gamil.com"; value[0][1] =
	 * "gowthammmmm";
	 * 
	 * // row2 value[1][0] = "HelloWorld@gmail.com"; value[1][1] = "HelloEveryone";
	 * return value;
	 * 
	 * }
	 */

	@Test(dataProvider = "LogIn")
	public void LogIn(String email, String Pass) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(email);
		String val1 = username.getAttribute("value");
		System.out.println("User Name Given : " + val1);

		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys(Pass);
		String val2 = password.getAttribute("value");
		System.out.println("Password Given  : " + val2);

		// WebElement loggy = driver.findElement(By.xpath("//button[@class=' _acan _acap
		// _acas _aj1- _ap30']"));
		// loggy.click();
		//
		// String title = driver.getTitle();
		// System.out.println("the titl of thid Site is " + title);
		// picko container
	}

	@DataProvider(name = "LogIn")
	private Object[][] testdata() {
		return new Object[][] { { "gowthamjillo19@gmil.com", "gowtham" }, { "HElloWorld@gmail.com", "HIeveryone" },
				{ "dfgh@gamil.com", "asshg" }, { "maDrAsChristianCOLLEGE@gmail.com", "Mcc" },
				{ "SPortsCenter@gmail.com", "basketball" } };
	}

}
