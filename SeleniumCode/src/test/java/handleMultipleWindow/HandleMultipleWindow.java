package handleMultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		// URL Visit
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		// parent window save
		String parentWindow=driver.getWindowHandle();
		
		// print the parent window name
		System.out.println("Parent window name is: "+parentWindow);
		
		// click on the new window button
		driver.findElement(By.id("newWindowBtn")).click();
		
		// All windows data capture
		Set<String>allWindows=driver.getWindowHandles();
		
		// for each loop is used for performing list of data action
		
		for (String windows : allWindows) 
		{
		
			// verify windows object can able to store allwindows data
			
			System.out.println(windows);
			
			// for not going to parent window
			
			if(!windows.equals(parentWindow))
			{
				// switch to child window
				driver.switchTo().window(windows);
				Thread.sleep(2000);
				driver.findElement(By.id("firstName")).sendKeys("All is well");
				Thread.sleep(2000);
				
				// close the child window
				driver.close();
		
			}
		}
		
		// switch to parent window
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("ok tested");

	}

}
