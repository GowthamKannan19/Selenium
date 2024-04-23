package demo4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class class4 {
	public static WebDriver driver;

	@Test
	public void launching() { 
		driver = new ChromeDriver();
		}

	@Test
	public void Quit() {
		driver.quit();
		}
}
