package launchingBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url_visit_using_webdrivermanager {
	
	public static void main(String[] args) {
		
		//Chrome browser
		//chrome driver location setup using webdriverManager
		WebDriverManager.chromedriver().setup();
		
		//chrome browser webdriver object
		WebDriver driver = new ChromeDriver();
		
		//url visit
		driver.get("https://www.youtube.com/");
	}
}
