package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util_Methods extends Parent {

	// Constructor
	public Util_Methods(WebDriver dr) {
		this.driver = dr;
	}

	/* Generic Method */
	// Invoke Chrome browser
	public WebDriver initChrome() {
		driver = new ChromeDriver();
		return driver;
	}

	// Pass the URL
	public void url(String url) {
		driver.get(url);
	}

	// click
	public void click() {

	}

	// Send data
	public void doSendKeys(By elemBy, String value) {
		Util_WebElements.getElement(elemBy).sendKeys(value);
	}

	// Get Text
	public String getText(By elemBy) {
		return Util_WebElements.getElement(elemBy).getText();
	}

	// Close browser
	public static void quitBrowserWithTime(int n) throws InterruptedException {
		Thread.sleep(n);
		driver.quit();
	}
}
