package element_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Search {

	WebDriver driver ; 
	
	
	
	// Created the All Elements Repo As per the Page . 
	
	
	@FindBy(xpath="//input[@id='gh-ac']") public WebElement searchElement; 
	@FindBy(xpath="//input[@id='gh-btn']") public WebElement SearchButton;

	@FindBy(xpath="//a[@id='gh-as-a']") public WebElement adbutton; 
	
	
	@FindBy(xpath="//input[@id='_nkw']") public WebElement keyword; 
	
	@FindBy(xpath="//input[@id='_ex_kw']") public WebElement exclude; 
	@FindBy(xpath="//input[@name='_udlo']") public WebElement min; 
	@FindBy(xpath="//input[@name='_udhi']") public WebElement max; 
	@FindBy(xpath="//button[@id='searchBtnLowerLnk']") public WebElement Srele ; 
	
	
	// Using the Constructor the PageFactoris 
	public Ebay_Search( WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	
}
