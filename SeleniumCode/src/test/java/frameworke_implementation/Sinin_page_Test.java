package frameworke_implementation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import frameworke_implementation.Signin_page_objectLocator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sinin_page_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Url
		driver.get("https://www.nexchar.com/signin");
		
		// UserName
		Signin_page_objectLocator.username(driver).sendKeys("hamidsaymon9@gmail.com");
		
		// Password
		Signin_page_objectLocator.password(driver).sendKeys("Abc12345");
		
		// RememberMe
		Signin_page_objectLocator.rememberme(driver).click();
		
		//Signin Button
		Signin_page_objectLocator.signInButton(driver).click();
		
	}

}
