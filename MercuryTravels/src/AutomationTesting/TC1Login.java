package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1Login {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		driver.findElement(By.linkText("Log out")).click();
		
		driver.close();
		
	}

}