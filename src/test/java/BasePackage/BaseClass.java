package BasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public WebDriver driver;
	private final int Timeout=20;
	private static WebDriverWait wait;
	
	protected BaseClass(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
	}
	
	public static void waitForVisibilityElement(By Locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}
	
}
