package TestCasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import BasePackage.StartTest;

public class Tc_01_HRMTest extends StartTest {
	
	OrangeHRM om;
	
	@Test
	public void selectValues() {

		om= new OrangeHRM(driver);
		om.categoriesDropdown(By.cssSelector("#searchDropdownBox"));
		
	}


}
