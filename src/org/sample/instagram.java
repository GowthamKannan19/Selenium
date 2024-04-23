package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		WebElement forget = driver.findElement(By.xpath(
				"//span[@class='x1lliihq x1plvlek xryxfnj x1n2onr6 x193iq5w xeuugli x1fj9vlw x13faqbe x1vvkbs x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x1i0vuye x1fhwpqd xo1l8bm x7l2uk3 x10wh9bi x1wdrske x8viiok x18hxmgj']"));
		forget.click();
		Thread.sleep(2000);
		WebElement type = driver.findElement(By.xpath("//label[@class='_aaik _aaic _ag7n']"));
		type.sendKeys("gowthamjillo30@gmail.com");
		Thread.sleep(3000);// a[@role='link']"));

		WebElement createnew = driver.findElement(By.xpath("//body[@class='_a3wf system-fonts--body segoe']"));
		createnew.click();
		Thread.sleep(3000);
		WebElement mail = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		mail.click();
		driver.quit();

	}

}
