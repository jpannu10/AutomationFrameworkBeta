package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util_WebElements extends Parent {

	// Constructor
	public Util_WebElements(WebDriver dr) {
		this.driver = dr;
	}

	// Return webElement. Accept 'By' as the parameter.
	public static WebElement getElement(By idhere) {
		return driver.findElement(idhere);
	}

}