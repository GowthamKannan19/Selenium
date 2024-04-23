package PF2;

import org.openqa.selenium.WebDriver;

import Pagefac.Demo;
import Pagefac.Login;

public class main extends Demo {
	 static Login login;

	    static WebDriver driver = getDriver();

	    public static void main(String[] args) {

	// LOGIN PAGE
	        login = new Login(driver);

	        login.launchURL("https://www.instagram.com/");

	        login.enterUsername("gowtham");

	        login.enterPassword("gowtham123");

	        login.clickSubmit();
	        login.endTest();

	    }
	}

