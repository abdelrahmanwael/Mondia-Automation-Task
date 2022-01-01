package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchResultsPage;
import pages.shoppingCartPage;

public class shoppingCartTest extends testBase {
	
	shoppingCartPage shoppingCartObject;
	SearchResultsPage searchResultObject;
	
  @Test(priority = 1)
  public void shoppingCheckOut() {
	  shoppingCartObject = new shoppingCartPage(driver);
	  searchResultObject = new SearchResultsPage(driver);
	  //Verify Game Name
	  String checkOutGameName = shoppingCartObject.checkOutGameName.getText();
	  String expectedGameName = searchResultObject.expectedGameName.getText();
	  if(checkOutGameName.equals(expectedGameName))
		  System.out.println("Game Title Verified");
	  else
		  System.out.println("Game Title Verification failed");
	  //Verify Game quantity
	  Assert.assertTrue(shoppingCartObject.gameQuantity.getText().contains("3"));
	  //Verify subtotal
	  Assert.assertTrue(shoppingCartObject.subtotalAmount.getText().contains("$239.97"));
	  shoppingCartObject.checkout();
  }
	 @Test(dependsOnMethods = "shoppingCheckOut")
	  public void loginToWebSite() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,600)");
		 shoppingCartObject.login("test1", "test1test1");
	  }
}
