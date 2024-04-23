package practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.primevideo.com/");

	/*	File src = driver.getScreenshotAs(OutputType.FILE);

		File dest = new File("./ScreenShot/img1.png");

		FileHandler.copy(src, dest);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign in to join Prime']"));
		
		File eleSrc = ele.getScreenshotAs(OutputType.FILE);

		File eledest = new File("./ScreenShot/img2.png");

		FileHandler.copy(eleSrc, eledest);*/
		
		
		
		driver.quit();
	}
}
