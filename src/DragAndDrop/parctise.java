package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class parctise {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();

		WebElement start = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		WebElement dr = driver.findElement(By.xpath("//div[@id='draggable']"));

		Actions obj = new Actions(driver);
		obj.dragAndDrop(start, dr).perform();

		WebElement b1 = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement b2 = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions obj1 = new Actions(driver);
		obj1.dragAndDrop(b1, b2).perform();
		
		driver.quit();

	}

}
