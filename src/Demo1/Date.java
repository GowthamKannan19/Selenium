package Demo1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("//div[@tabindex='1']"));
		from.sendKeys("chennai");

		WebElement to = driver.findElement(By.xpath("//div[@tabindex='2']"));
		to.sendKeys("delhi");
		
		WebElement date = driver.findElement(By.className("dateText"));
		date.click();
		
		
		Date obj= new Date();
		
		
		
	//	SimpleDateFormat  format= new SimpleDateFormat();
		//Calendar cals = format.getCalendar(date);
		
		
		
	}

}
