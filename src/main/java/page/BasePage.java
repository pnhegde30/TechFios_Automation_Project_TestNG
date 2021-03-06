package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static void waitForElement(WebElement element, WebDriver driver) {
		WebDriverWait waiting = new WebDriverWait(driver, 15);
		waiting.until(ExpectedConditions.visibilityOf(element));
	}

}
