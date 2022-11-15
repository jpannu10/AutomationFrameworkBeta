package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.Util_Methods;

public class Case1 {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		// Get the url from resource file.
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\jaskaran.singh\\Dropbox\\workspace\\HP-G9-workspace\\NaveenAutomation_01\\src\\main\\java\\Resources\\R1.properties");
		prop.load(file);

		// Creating the object of 'Util1'.
		Util_Methods ut1 = new Util_Methods(driver);

		driver = ut1.initChrome();
		ut1.url(prop.getProperty("url"));

		// Util_WebElements ut2 = new Util_WebElements(driver);

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By cart = By.partialLinkText("Shopping Car");

		/*
		 * ut1.doSendKeys(firstName, "Jaskaran"); ut1.doSendKeys(lastName, "Singh");
		 */

//		driver.findElement(By.partialLinkText("My Acc")).click();

		String data = ut1.getText(cart);

		System.out.println(data);

		// Quit the browser
		ut1.quitBrowserWithTime(10000);

	}

}
