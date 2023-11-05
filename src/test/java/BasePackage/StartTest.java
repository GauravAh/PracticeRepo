package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import ExcelUtility.ObjectRepositorys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StartTest {
	
	protected WebDriver driver;
	ObjectRepositorys ob;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ob = new ObjectRepositorys();
		driver.get(ob.getUrl());
		driver.manage().window().maximize();
		Thread.sleep(25000);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
}
