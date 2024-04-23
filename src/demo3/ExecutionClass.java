package demo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutionClass {

	@Test
	public void method1() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		classEasy cl = new classEasy(driver);

		cl.getUrl("https://www.medplusmart.com/");
		cl.maximize();
		cl.FindSign();
		cl.mobilenumber("9361134434");
		cl.ClickOTP();
		cl.clearinfo();
		cl.TypeinSrch();
		// cl.visitmoreprod();
		cl.listingEle();
		cl.AddCart();
		cl.GotoCart();
		cl.verifyprod();
	}
}