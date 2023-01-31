package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_Utils {

	private WebDriver driver;

	@Before(order=0)
	public void Setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("This is Before");
	}

	@After(order=0)
	public void tearDown(Scenario scenario) throws InterruptedException {
// Here we need to write the Screenshots steps . 
		
		if(scenario.isFailed())
		{
			final byte[] scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES); 
			scenario.attach(scr, "image/png", scenario.getName());
			
		}
		
		
		driver.quit();
		Thread.sleep(3000);
		System.out.println("This is Main After ");
	}

	public WebDriver getDriver() {

		return driver;
	}
}
