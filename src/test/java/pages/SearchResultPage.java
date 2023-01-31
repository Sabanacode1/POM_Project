package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase {
	
	@FindBy(css = "ul li.preview:nth-child(1)")
	WebElement item;
	
	@FindBy(css = "div.detail-wrapper button.call-to-action")
	WebElement addToCartBtn;
	
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	public void viewItemDetails() {
		item.click();
	}
	public void addItemToCart() {
		addToCartBtn.click();
	}
	

}
