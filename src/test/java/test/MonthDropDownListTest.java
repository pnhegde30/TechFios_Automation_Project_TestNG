package test;

import java.awt.List;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import util.BrowserFactory;

public class MonthDropDownListTest {
	
	WebDriver driver; 
	
	public void launchBrowser() { 
		driver = BrowserFactory.init();
	}
	
	public void MonthListDropDown() { 
		//The test site
		driver.get("https://techfios.com/test/101/index.php");
		
		String monthsMenu[] = {"None", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		Select select = new Select(driver.findElement(By.xpath("//select[option='None'][3]")));
		
		java.util.List<WebElement> monthValues = select.getOptions();
		System.out.println("Size:" + monthValues.size());
		
		for(int i = 0; i < monthValues.size(); i++) {
			Assert.assertEquals(monthsMenu[i], monthValues.get(i).getText(), "Dropdown menu contains 13 entries");
		}
		
		driver.close();
	}

}
