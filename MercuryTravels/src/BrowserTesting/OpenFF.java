package BrowserTesting;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFF {

	public static void main(String[] args) {

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}

}
