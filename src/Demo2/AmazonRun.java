package Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonRun {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		driver.manage().window().maximize();

		PageFactory.initElements(driver, AmazonPrime.class);

		AmazonPrime.amazonprime.click();

		AmazonPrime.HomePage.click();

		/*
		 * String title = driver.getTitle(); if (title.equals("welcome to prime video"))
		 * {
		 * 
		 * System.out.println("HomePage successfully Launched"); }
		 * 
		 * else {
		 * 
		 * System.out.println("HomePage failed"); }
		 */

		AmazonPrime.Store.click();
		AmazonPrime.LiveTv.click();
		// AmazonPrime.categories.click();
		AmazonPrime.Search.click();
		AmazonPrime.fillSearch.sendKeys("Thriller");

		// Thread.sleep(2000);

		// AmazonPrime.clear.click();
		// AmazonPrime.clickyours.click();
		// AmazonPrime.TryforFree.click();
		// AmazonPrime.Languages.click();
	       AmazonPrime.profile.click();

	}
}
