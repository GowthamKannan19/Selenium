package Demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
		
		Actions ac = new Actions(driver);
		
		ac.sendKeys(Keys.CONTROL).keyDown(Keys.END).build().perform();
				
		WebElement furni = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Fashionable footwear']")));
		
		if(furni.getText().equals("Fashionable footwear")) {
			
			System.out.println(furni.getText());
		}

		else {
			
			System.out.println("Failed");
		}
		
	}

}
