package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pack1 {
	public static void main(String[] args) {
		
		
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.xpath("(//input[@aria-label= 'Phone number, username, or email'][1])"));
				
		Username.sendKeys("Gowthamkannan19");
		WebElement Pass = driver.findElement(By.xpath("(//input[@aria-label= 'Password'][1])"));
		Pass.sendKeys("fghjkjhfdf");
		WebElement log = driver.findElement(By.xpath("//div[text( )='Log in']"));
		log.click();
		

	}

}
