package basic_Operation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_operation_of_web_page {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//object create
		WebDriver driver = new ChromeDriver();
		
		//url visit
		driver.get("https://www.nexchar.com");
		
		//capture page title
		System.out.println(driver.getTitle());
		
		//capture the current url of the web page
		System.out.println(driver.getCurrentUrl());
		
		//capture the page source code
		System.out.println(driver.getPageSource());
		
		// browser window maximize
		driver.manage().window().maximize();
		
		// delay 5 sec
		Thread.sleep(5000);
		
		//browser window fulscreen
		driver.manage().window().fullscreen();
		
		//minimize window
		//driver.manage().window().minimize();
		
		//navigate mathod
		driver.navigate().to("http://sheradambd.com");
		
		//navigate back
		driver.navigate().back();
		
		//navigate forward
		driver.navigate().forward();
		
		//refresh window
		driver.navigate().refresh();
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://youtube.com");
		
		//close current tab
		Thread.sleep(2000);
		driver.close();
		
		//close browser
		Thread.sleep(2000);
		driver.quit();
		
		//resize window dimention
		Dimension d = new Dimension(600,600);
		driver.manage().window().setSize(d);
		

	}

}
