package PageMethods_Actions;

import org.openqa.selenium.WebDriver;

import steps.Common_Utils;

public class Common_Actions {
	private WebDriver driver;

	public Common_Actions(Common_Utils common_utils) {

		this.driver = common_utils.getDriver();

	}

	public void gotoUrl(String url) {

		driver.get(url);
	}

	public String pageUrl() {

		return driver.getCurrentUrl();

	}

	public String pageTitle() {

		return driver.getTitle();
	}


}
