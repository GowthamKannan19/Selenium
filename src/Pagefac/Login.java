package Pagefac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class Login {
	  WebDriver driver;
	    public Login(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver,this);
	    }

	    @FindBy(how = How.ID, using = "username")
	    protected WebElement txtUsername;

	    @FindBy(how = How.ID, using = "password")
	    protected WebElement txtPassword;

	    @FindBy(how = How.ID, using = "submit")
	    protected WebElement btnSubmit;


	    public void launchURL(String strURL){
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        driver.get(strURL);
	    }
	    public void enterUsername(String username){
	        txtUsername.sendKeys(username);
	    }
	    public void enterPassword(String passsword){
	        txtPassword.sendKeys(passsword);
	    }

	    public void clickSubmit() {
	        btnSubmit.click();
	    }

	    public void endTest(){
	        driver.close();
	        driver.quit();
	    }

}
