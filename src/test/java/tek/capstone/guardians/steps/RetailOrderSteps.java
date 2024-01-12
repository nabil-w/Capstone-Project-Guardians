package tek.capstone.guardians.steps;

import tek.capstone.guardians.utilities.CommonUtility;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

import tek.capstone.guardians.pages.POMFactory;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	// @AddItemToCart
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String alldropdwon) {
		selectByVisibleText(factory.retailOrderPage().allDepartmentdropdwon, alldropdwon);
		logger.info("User clicked on All Dropdwon menue");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String kasaoutdoorsmartplug) {
		sendText(factory.retailOrderPage().searchInputField, kasaoutdoorsmartplug);
		logger.info("User entered item in sreach");

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.retailOrderPage().searchBtn);
		logger.info("User clicked on search button");

	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.retailOrderPage().Itemkasaoutdoorsmartplug);
		logger.info("User clicked on search Button");

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String addQuantity) {
		selectByVisibleText(factory.retailOrderPage().qtyDropDwon, addQuantity);
		logger.info("User selected iteme Quantities");

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.retailOrderPage().addToCartBtn);
		logger.info("User clicked on Cart bottun");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String itemQtyInTheCart) {
		Assert.assertEquals(itemQtyInTheCart, factory.retailOrderPage().cartItemQty.getText());
		logger.info("Items Quantities indicated in the Cart");
	}

	// Place Order with shipping address

	@When("User change the category to {string} Apex Legends")
	public void userChangeTheCategoryToApexLegends(String ToElectronic) {
		selectByVisibleText(factory.retailOrderPage().DepartDropDown, ToElectronic);
		logger.info("Category changed to electronics section");
	}

	@When("User search for an item {string} Apex Legends")
	public void userSearchForAnItemApexLegends(String ApexLegends) {
		sendText(factory.retailOrderPage().searchInputbar, ApexLegends);
		logger.info("User searched for Apex Legends");
	}

	@When("User click on Search icon option")
	public void userClickOnSearchIconOption() {
		click(factory.retailOrderPage().searchBtnFieldss);
		logger.info("User clicked on search bar icon");

	}

	@When("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		click(factory.retailOrderPage().apexLegendsItems);
		logger.info("User clicked on Apex Legends");
	}

	@When("User select quantity {string} for Apex Legends")
	public void userSelectQuantityForApexLegends(String SelectQuantity) {
		selectByVisibleText(factory.retailOrderPage().selectQuantity, SelectQuantity);
		logger.info("User Selected Quantity");

	}

	@Then("the cart icon quantity should change to {string} Apex Legends")
	public void theCartIconQuantityShouldChangeToApexLegends(String ChangeTofive) {
		Assert.assertEquals(ChangeTofive, factory.retailOrderPage().cartQuantityTofive.getText());
		logger.info("Items Quantities indicated in the Cart");

	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.retailOrderPage().cartBtnField);
		logger.info("User clicked on Cart Options");

	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.retailOrderPage().proceedTochekcout);
		logger.info("User clicked Proceed button");
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.retailOrderPage().placeOrderBtn);
		logger.info("User clicked on Place Order button");
	}

	@Then("a message should be displaying {string}")
	public void aMessageShouldBeDisplaying(String aMessageDisplayed) {
		Assert.assertEquals(aMessageDisplayed, factory.retailOrderPage().successfullyMssg.getText());
		logger.info("User validated a message");
	}

	// Cancel Order

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.retailOrderPage().orderLink);
		logger.info("User Clicked on Order Link");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrders = factory.retailOrderPage().listOfOrders;
		for (int i = 0; i < listOfOrders.size(); i++) {
			if (listOfOrders.get(i).getText().equalsIgnoreCase("Hide Details")) {
			} else if (listOfOrders.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(factory.retailOrderPage().listOfOrders.get(i));
				logger.info("First Order canceled");
			}
		}

	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {

		List<WebElement> listOfCancel = factory.retailOrderPage().listOfCancel;
//		for(int i = 0;i<listOfCancel.size();i++) {
		// click(listOfCancel.get(0));
		// cancell all orders
		for (int i = 0; i < listOfCancel.size(); i++) {
			click(listOfCancel.get(i));

		}
		logger.info("User clicked on cancel button");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancealtionReason) {
		selectByVisibleText(factory.retailOrderPage().reasonOfCancellation, cancealtionReason);
		logger.info(" cancellation reason was selected ");

	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.retailOrderPage().orderSubmitBtnCancellation);
		logger.info("User clicked on cancel sumite button");

	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String CancellationMssg) {
		Assert.assertEquals(CancellationMssg, factory.retailOrderPage().orderCancelSucessfullyMsg.getText());
		logger.info("User validated the message");
	}
	// Return the order

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.retailOrderPage().ReturnItem);
		logger.info("User clicked on return bottun");

	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String damageItem) throws InterruptedException {
		Thread.sleep(3000);
		selectByVisibleText(factory.retailOrderPage().ReasonDamageItem, damageItem);

		logger.info("User selected return");

	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String FedEX) throws InterruptedException {
		Thread.sleep(3000);
		selectByVisibleText(factory.retailOrderPage().dropAtFedEx, FedEX);

		logger.info("User selected the drop off");

	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.retailOrderPage().OrderSumbitBTN);
		logger.info("User clicked on return button");

	}

	@Then("a return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String ReasonDamageItem) {
		Assert.assertEquals(ReasonDamageItem, factory.retailOrderPage().returneItemMessg.getText());
		logger.info("User validated a message");
	}

	// Write Review

	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.retailOrderPage().ReviewBtn);
		logger.info("User cliked on review button");

	}

	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String Review) {
		// clearTextUsingSendKeys(factory.retailOrderPage().headlineInputField);
		click(factory.retailOrderPage().headlineInputField);
		sendText(factory.retailOrderPage().headlineInputField, headline);
		// clearTextUsingSendKeys(factory.retailOrderPage().descriptionInput);
		click(factory.retailOrderPage().descriptionInput);
		sendText(factory.retailOrderPage().descriptionInput, Review);
		logger.info("User wrote review");

	}

	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.retailOrderPage().reviewSubmitBtn);
		logger.info("User clicked on review button");

	}

	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String Message) {
		waitTillPresence(factory.retailOrderPage().amessageDisplayed);
		Assert.assertEquals(Message, factory.retailOrderPage().amessageDisplayed.getText());
		logger.info("User validated a message");

	}

}
