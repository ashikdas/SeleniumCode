package frameworke_implementation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import frameworke_implementation.Signin_page_objectLocator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn_page_TestNG {
	
	// class variable
	static WebDriver driver = null;

	@BeforeTest
	public static void Setup(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test (priority = 1)
	public static void SignInTest(){
		
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

	@Test (priority = 2)
	public static void ContactUsPage() throws InterruptedException{
		driver.get("https://www.nexchar.com/contactus");
		driver.findElement(By.id("FullName")).sendKeys("FullName");
		Thread.sleep(3000);
	}	
	
	@AfterTest
	public static void TearDown(){
		
		driver.close();
		System.out.println("Testing End");
	
	}
		

		

}
