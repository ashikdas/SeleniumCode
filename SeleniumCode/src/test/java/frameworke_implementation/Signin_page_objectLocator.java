package frameworke_implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin_page_objectLocator {
	
	private static WebElement locator = null;
	
	// Username object locator function
	public static WebElement username(WebDriver driver){
		locator = driver.findElement(By.id("Email"));
		return locator;
	}
	
	// Password object locator function
	public static WebElement password(WebDriver driver){
		locator = driver.findElement(By.id("Password"));
		return locator;
	}
		
	// RememberMe object locator function
	public static WebElement rememberme(WebDriver driver){
		locator = driver.findElement(By.id("RememberMe"));
		return locator;
	}
		
	// Sign in Button object locator function
	public static WebElement signInButton(WebDriver driver){
		locator = driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]"));
		return locator;
	}
}
