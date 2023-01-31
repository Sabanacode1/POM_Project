package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckoutPage extends TestBase {
	
	@FindBy(css= "input#billing-coupon")
	WebElement chkBoxCoupon;
	
	@FindBy(id= "coupon")
	WebElement inpCoupon;
	
	@FindBy(xpath = "//button[contains(text(),'Apply')]")
	WebElement applyBtn;
	
	@FindBy(xpath = "//button[contains(text(),'CheckOut')]")
	WebElement chkoutBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Empty Cart')]")
	WebElement emptyCartBtn;
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void applyCoupon() {
		chkBoxCoupon.click();
		inpCoupon.sendKeys("C100");
		applyBtn.click();
	}
	public void doCheckout() {
		PageFactory.initElements(driver, this);
	}
	
	public void doEmptyCart() {
		PageFactory.initElements(driver, this);
	}
	
	
	}


