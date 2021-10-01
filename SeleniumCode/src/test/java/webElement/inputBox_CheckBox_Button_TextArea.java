package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class inputBox_CheckBox_Button_TextArea {
	
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		//url
		driver.get("https://www.nexchar.com/signin");
		
		// --input box testing
		
		//1. Id Edit username inputbox testing using id locator
		driver.findElement(By.id("Email")).sendKeys("gift_shop");
		
		//driver.findElement(By.id("Email")).clear();
		//2. Name Edit password input box testing using name locator
		driver.findElement(By.name("Password")).sendKeys("12345");
		
		//---checkbox Testing
		
		//3. Xpath (Chropath) remember me ckeck box testing using Xpath locator
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		//4.CssSelector(SelectorHub): Sign in button testing using cssSelector locator
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		
		//Navigate back
		driver.navigate().back();
		
		// link Testing
		driver.findElement(By.linkText("Demo")).click();
		Thread.sleep(3000);
		
		//6. Partial linkText: Contact page testing using Partial LinkText Locator
		driver.findElement(By.partialLinkText("Conta")).click();
		Thread.sleep(3000);
		
		// --Image Button Testing
		
		//7. Class Name: Nexchar logo image button testing using class Name Locator
		driver.findElement(By.className("navbar-brand-image")).click();
		*/
		
		//-- Text Area --
		driver.get("https://www.nexchar.com/contactus");
		driver.findElement(By.id("Message")).sendKeys("Okay");
		
	}


}
