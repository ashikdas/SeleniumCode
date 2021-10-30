package frameworke_implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extentReport {

	public static void main(String[] args) {
		
		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		// create a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("NexChar Signin Page Test", "Complete SignIn Page Test Using ExtentReport");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// way1 for message print
		test.log(Status.INFO, "webdriver Object setup");
		
		driver.get("https://www.nexchar.com/signin");
		
		test.log(Status.PASS, "URL visited successfully");
		
		driver.findElement(By.id("Email")).sendKeys("gepas32592@soulsuns.com");
		
		// way 2 for message print
		test.pass("userName data has been given");
		driver.findElement(By.id("Password")).sendKeys("54321");
		test.pass("password data has been given");
		test.fail("fail testing");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		test.pass("SignIn button has been clicked");
		driver.close();
		test.info("Closing the test");
		
		// calling flush writes everything to the log file
		extent.flush();

	}

}
