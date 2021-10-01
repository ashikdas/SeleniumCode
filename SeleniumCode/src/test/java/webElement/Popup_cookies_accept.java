package webElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_cookies_accept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		Thread.sleep(2000);
//		
		
		// simpleAlert box automation
		/*driver.findElement(By.id("alertBox")).click();
		Alert simplealert=driver.switchTo().alert();
		System.out.println(simplealert.getText());
		Thread.sleep(2000);
		simplealert.accept();*/
		
		
		driver.findElement(By.id("confirmBox")).click();
		Alert confirmBoxAlert=driver.switchTo().alert();
		System.out.println(confirmBoxAlert.getText());
//		Thread.sleep(2000);
		confirmBoxAlert.dismiss();
//		simplealert.dismiss();
//		simplealert.sendKeys("");
		
		

	}

}
