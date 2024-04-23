package start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://codoid.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();

	}

}
