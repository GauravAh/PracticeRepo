package TestCasePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;

public class OrangeHRM extends BaseClass{

	OrangeHRM(WebDriver driver) {
		super(driver);
	}
	
	public void categoriesDropdown(By Locator) {
		
		Select select = new Select(driver.findElement(Locator));
		List<WebElement> getpptions = select.getOptions();
		int dropSize = getpptions.size();
		
		System.out.println("Size is.." + dropSize);
		
		for(int i=0;i<dropSize;i++) {
			getpptions.get(i).click();
			
		}
		
	}
	

}
