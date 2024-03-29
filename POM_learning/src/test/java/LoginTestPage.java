import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestPage {
	public WebDriver driver;
	LoginPage lp;
	@BeforeMethod
	public void launchBrowser() {
		 driver=new ChromeDriver();
		 driver.get("https://admin-demo.nopcommerce.com/login");
	 lp=new LoginPage(driver);
	}
	@Test
	public void VerifyLoginPage() {
	String actualValue=	lp.getPageTitle();
	String ExpectedValue="Admin";
	Assert.assertEquals(actualValue, ExpectedValue);
	System.out.println("U r in login page");
	}
	@Test
	public void VerifyLoginFunction() throws InterruptedException {
		lp.performLogin();
	}
}
