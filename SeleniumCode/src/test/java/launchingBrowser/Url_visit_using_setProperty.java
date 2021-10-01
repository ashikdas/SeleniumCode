package launchingBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Url_visit_using_setProperty {

	public static void main(String[] args) {
		
		//Firefox browser
		
		//Geckodriver location setup using set property
		System.setProperty("webdriver.gecko.driver", "D:\\JavaProjects\\SeleniumCode\\drivers\\geckodriver\\geckodriver.exe");
		
		//Firefox browser webdriver object
		WebDriver driver = new FirefoxDriver();
		
		//url 
		driver.get("https://www.youtube.com/");
		
	}
}
