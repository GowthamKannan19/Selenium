package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement f = driver.findElement(By.id("email"));
		f.sendKeys("kalaijhjy");
		WebElement t = driver.findElement(By.id("pass"));
		t.sendKeys("kAIAky");
		WebElement element = driver.findElement(By.name("login"));
		element.click();

		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
		mail.sendKeys("krkrk@gamil.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("krkrkrkr");
		WebElement log = driver.findElement(By.xpath("//button[@value='1']"));
		log.click();

		WebElement forg = driver.findElement(By.xpath("//a[@class='_97w4']"));
		forg.click();

		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ss = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));

		ss.sendKeys("9876543210");
		WebElement rr = driver.findElement(By.xpath("//input[@aria-label='FullName']"));
		rr.sendKeys("gowtham");
		// WebElement ff =
		// driver.findElement(By.xpath("//input[@aria-label='Username']"));
		// ff.sendKeys("gowtha019");
		driver.quit();
	}

}
