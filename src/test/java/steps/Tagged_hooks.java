package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_hooks {

	private WebDriver driver;

	public Tagged_hooks(Common_Utils common_utils) {

		driver = common_utils.getDriver();
	}
	
	@Before(value="@taghooks", order=1)
	public void taghooks()
	{
		System.out.println("This is Before Tag hooks");
		
	}
	
	@After(value="@test", order=1)
	public void AfterTest()
	{
		System.out.println("This is After tag hooks");
		
	}

}
