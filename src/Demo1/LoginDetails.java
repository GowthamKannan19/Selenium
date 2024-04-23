package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Demo2.Launch2;

public class LoginDetails {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		PageFactory.initElements(driver, Launch2.class);
		Launch2.username.sendKeys("Gowtham");
		Launch2.pass.sendKeys("Gowtham123");
		Launch2.Log.click();

		String title = driver.getTitle();
		if (title.equals("Instagram")) {

			System.out.println("HomePage successfully Launched");
		}

		else {

			System.out.println("Login Failed");
		}

		/*
		 * // WebElement user = driver.findElement(By.
		 * xpath("//input[@aria-label='Phone number, username or email address']"));
		 * //user.sendKeys("gowtham");
		 * 
		 * WebElement pass = driver.findElement(By.id("pass"));
		 * pass.sendKeys("gowtham0000");
		 * 
		 * WebElement log = driver.findElement(By.
		 * xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")); log.click(); }
		 */
	}
}
