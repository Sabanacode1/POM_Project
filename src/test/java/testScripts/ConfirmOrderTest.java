package testScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckoutPage;
import pages.HomePage;
import pages.SearchResultPage;

public class ConfirmOrderTest extends TestBase{
	 HomePage homePage;
	SearchResultPage resultPage ;
	CheckoutPage chkoutPage;
	
	@BeforeTest
	public void setUp() {
		initialize();
		
	}
	

	@Test(priority =1)
	public void searchItemTest() {
		homePage = new HomePage();
		resultPage = homePage.searchItem("Parry Hotter");
	   // resultPage = new SearchResultPage();
	    resultPage.viewItemDetails();
	    resultPage.addItemToCart();
	}
  @Test
  public void addItemToCartTest() {
	  
  }
  
  @Test(priority = 2)
  public void checkOutTest() {
	  chkoutPage = new CheckoutPage();
	  chkoutPage.applyCoupon();
	  chkoutPage.doCheckout();
	  chkoutPage.doEmptyCart();
  }
  }


