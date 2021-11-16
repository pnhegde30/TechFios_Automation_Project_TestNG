package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MonthDropDown extends BasePage {
	
	WebDriver driver;
	
	//A constructor in order to instantiate the driver
	public MonthDropDown(WebDriver driver) {
		this.driver = driver;
	}
	
	//Elements Library 
	@FindBy(how = How.XPATH, using = "//select[option='None'][3]") WebElement list_of_months;
	//@FindBy(how = How.XPATH, using = "//span[@id=\"extra\"]/select[3]/option[4]") WebElement march;
	
	
	public void DropDownListMonth() throws InterruptedException {
		list_of_months.click();
		Thread.sleep(2000);
	}
	
	public String verifyMonths() { 
		return driver.getTitle();	
	}

}
