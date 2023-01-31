package steps;

import static org.junit.Assert.fail;

 

import PageMethods_Actions.Common_Actions;
import PageMethods_Actions.Ebay_Page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_TestCase {


	Common_Actions ca; 
	Ebay_Page ep; 

	public Ebay_TestCase(Common_Actions ca, Ebay_Page ep) {
		
		this.ca=ca; 
		this.ep=ep; 

		 
		
	}

	@Given(": I am on the Ebay Home Page")
	public void i_am_on_the_ebay_home_page() {

		ca.gotoUrl("https://www.ebay.com/");
		System.out.println("Navigate to the ebay Page ");
	}

	@When("I can Search Baby Products {string}")
	public void i_can_search_baby_products(String str) {
		try {
			// Write code here that turns the phrase above into concrete actions
			
		// need to use the search part . 
			
			ep.clickOnSearch(str);
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("this is the error" + e);
		}

	}

	@Then("I can see the Results need to Verify")
	public void i_can_see_the_results_need_to_verify() {

		String url = ca.pageUrl().trim(); 
		String exeUrl = "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=baby+oil&_sacat=0";
		if (!url.equals(exeUrl)) {

			fail("search page not navagate");

		}

	}

	@When("Click on the Advnaced Search")
	public void click_on_the_advnaced_search(DataTable dataTable) {

		try {
			ep.advancedSearch_Click();

			Thread.sleep(2000);

			ep.includeString(dataTable.cell(1, 0));
			ep.excludeString(dataTable.cell(1, 1));
			ep.min(dataTable.cell(1, 2));
			ep.max(dataTable.cell(1, 3));

			ep.SearchClick(); 

			Thread.sleep(3000);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("I Click on the {string}")
	public void i_click_on_the(String link) {
		// Write code here that turns the phrase above into concrete actions
		
		ep.linkTestClick(link);
	}

	@Then("I need to Validate the {string} and the page {string}")
	public void i_need_to_validate_the_and_the_page(String url, String title) {
		String actualUrl = ca.pageUrl();
		String actitle=ca.pageTitle(); 
		if(!actualUrl.equals(url)) {
			
			fail("this is not working : "+url); 
		}
		
if(!actitle.contains(title)) {
			
			fail("this is not working :"+actitle); 
		}
		
		
	}
	
	
	
}
