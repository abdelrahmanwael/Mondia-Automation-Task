package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.orderConfirmationPage;

public class orderConfirmationTest extends testBase {
	
	orderConfirmationPage orderConfirmObject;
	
  @Test(priority = 1)
  public void changeshippingMethod() {
	  orderConfirmObject = new orderConfirmationPage(driver);
	  orderConfirmObject.changeShippingMethod();
	  Assert.assertTrue(orderConfirmObject.shippingMethod.getText().contains("Flat Rate"));
  }
  @Test(dependsOnMethods = "changeshippingMethod")
  public void confirmOrder() {
	  orderConfirmObject.confimOrder();
	  Assert.assertTrue(orderConfirmObject.orderConfirmationMSG.getText().contains("Your Order Has Been Processed"));
  }
  @Test(dependsOnMethods = "confirmOrder")
  public void goToMyAccountPage() {
	  orderConfirmObject.proceedToMyAccountPage();
  }
  
}
