package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	//driver.findElement(By.id)
	@FindBy(name="searchbar")
	WebElement searchBox;
	
	@FindBy(id = "button-search")
	WebElement btnSearch;
	
	@FindBy(id = "login")
	WebElement loginBtn;
	
	@FindBy(id = "signup")
	WebElement signUpBtn;
	
	@FindBy(id = "cart")
	WebElement cartBtn;
	
	
	//Actions
	//SearchItem
	//LogintoApp
	//signUp
	//viewCart
	//navigationToFriction
	public HomePage() {
		PageFactory.initElements(driver, this); //this is a keyword its a current class instance
	
	}
	
	public SearchResultPage searchItem(String strItem) {
		searchBox.sendKeys(strItem);
		btnSearch.click();
		return new SearchResultPage();
		
	}
	
	public void viewCart() {
		cartBtn.sendKeys("");
		
	}

}
