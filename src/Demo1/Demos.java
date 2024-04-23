package Demo1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demos {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://formstone.it/components/dropdown/demo/");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='demo_basic-dropdown-selected']")))
				.click();

		WebElement select = driver.findElement(By.xpath("//select[@id='demo_basic']"));

		Select s = new Select(select);

		List<WebElement> alloptions = s.getOptions();

		for (WebElement each : alloptions) {
			System.out.println(each.getText());
			
		}
	

	}
}
