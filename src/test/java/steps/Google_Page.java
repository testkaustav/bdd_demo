package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Page {
	WebDriver driver;

	public Google_Page(Common_Utils common_utils) {

		this.driver = common_utils.getDriver();
	}

	@Given(": I am on the Google Home Page")
	public void i_am_on_the_google_home_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		driver.get("https://www.google.com/");

		
		System.out.println("I am on Google Page ");

	}

	@When("Click on the Search option")
	public void click_on_the_search_option_Search() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I am on Google Page ");
		WebElement search_Option = driver.findElement(By.xpath("//input[@class=\"gLFyf\"]"));

		// search_Option.click();
		search_Option.sendKeys("BongKnot");

		Thread.sleep(2000);

	}

	@Then("I can see the Search Returls")
	public void i_can_see_the_search_returls() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I am on Google Page ");
		// driver.quit();

	}

	@When("I Click on the Search and Search {string}")
	public void i_click_on_the_search_and_search(String str) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		WebElement search_Option = driver.findElement(By.xpath("//input[@class=\"gLFyf\"]"));
		

		// search_Option.click();
		search_Option.sendKeys(str);
		search_Option.sendKeys(Keys.ENTER); 
		Thread.sleep(5000); 


	}

	@Then("I can see the Result will display .")
	public void i_can_see_the_result_will_display() throws InterruptedException {

		// element.click();
		// driver.
		System.out.println("This is checking");
		
		Thread.sleep(1000);
		
	}
}
