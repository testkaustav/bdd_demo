package PageMethods_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import element_Repo.Ebay_Search;
import steps.Common_Utils;

public class Ebay_Page {

	private WebDriver driver;
	Ebay_Search ebpayele;

	public Ebay_Page(Common_Utils common_utils) {

		this.driver = common_utils.getDriver();
		ebpayele = new Ebay_Search(driver);
	}

	public void clickOnSearch(String str) {

		ebpayele.searchElement.sendKeys(str);
		ebpayele.SearchButton.click();

	}

	public void advancedSearch_Click() {

		ebpayele.adbutton.click();

	}

	public void includeString(String str) {

		ebpayele.keyword.sendKeys(str);

	}

	public void excludeString(String str) {

		ebpayele.exclude.sendKeys(str);

	}

	public void min(String str) {

		ebpayele.min.sendKeys(str);

	}

	public void max(String str) {

		ebpayele.max.sendKeys(str);

	}

	public void SearchClick() {

		ebpayele.Srele.click();

	}
	
	public void linkTestClick(String strLink) {
		
		driver.findElement(By.linkText(strLink)).click();
		
		
	}

}
