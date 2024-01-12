package tek.capstone.guardians.steps;

import tek.capstone.guardians.utilities.CommonUtility;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.guardians.pages.DataGenerator;
import tek.capstone.guardians.pages.POMFactory;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

//		 Update Account

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.retailAccountPage().accountOption);
		logger.info("Usre clicked on accout option");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.retailAccountPage().updatingName);
		sendText(factory.retailAccountPage().updatingName, name);
		logger.info("User updated name successfull");
		clearTextUsingSendKeys(factory.retailAccountPage().updatingPhone);
		sendText(factory.retailAccountPage().updatingPhone, phone);
		logger.info("User updated phone number successfull");
	}

	@When("User click on update button")
	public void userClickOnUpdateButton() {
		click(factory.retailAccountPage().updatButn);
		logger.info("User clicked on update button");

	}

	@Then("User profile should be updated")
	public void userProfileShouldBeUpdated() {
		waitTillPresence(factory.retailAccountPage().displayMessage);
		String expectedMessg = "Personal Information Updated Successfully";
		String acualMessg = factory.retailAccountPage().displayMessage.getText();
		Assert.assertEquals(expectedMessg, acualMessg);
		// Assert.assertTrue(factory.retailAccountPage().displayMessage.isDisplayed());

		// adding payment method
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.retailAccountPage().paymentLink);
		logger.info("User clicked on payment link");

	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> updatePayment = dataTable.asMaps(String.class, String.class);

		sendText(factory.retailAccountPage().cardNumberField, updatePayment.get(0).get("cardNumber"));
		sendText(factory.retailAccountPage().nameOnCardInputField, updatePayment.get(0).get("nameOnCard"));
		selectByVisibleText(factory.retailAccountPage().expirationMonthInputField,
				updatePayment.get(0).get("expirationMonth"));
		selectByVisibleText(factory.retailAccountPage().expirationYearInputField,
				updatePayment.get(0).get("expirationYear"));
		sendText(factory.retailAccountPage().securityCodeInputField, updatePayment.get(0).get("securityCode"));
		logger.info("User added payment info successfully");

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.retailAccountPage().paymentSubmitBtn);
		logger.info("User clicked on payment button");

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String successMessage) {
		if (successMessage.contains("Payment Method added")) {
			waitTillPresence(factory.retailAccountPage().addPaymentMethodSuccessMsg);
			Assert.assertEquals(successMessage, factory.retailAccountPage().addPaymentMethodSuccessMsg.getText());
			logger.info("User validated a message" + successMessage);

		} else if (successMessage.contains("Payment Method updated")) {
			waitTillPresence(factory.retailAccountPage().SuccessMssgDisplayed);
			Assert.assertEquals(successMessage, factory.retailAccountPage().SuccessMssgDisplayed.getText());
			logger.info("User validated a message" + successMessage);

		} else if (successMessage.contains("Address Added")) {
			waitTillPresence(factory.retailAccountPage().MssgAddress);
			Assert.assertEquals(successMessage, factory.retailAccountPage().MssgAddress.getText());
			logger.info("User validated a message" + successMessage);

		} else if (successMessage.contains("Address Updated")) {
			waitTillPresence(factory.retailAccountPage().UpdatingAddress);
			Assert.assertEquals(successMessage, factory.retailAccountPage().UpdatingAddress.getText());
			logger.info("User validated a message" + successMessage);
		}
	}

//			waitTillPresence(factory.retailAccountPage().addPaymentMethodSuccessMsg);
//			Assert.assertEquals(successMessage, factory.retailAccountPage().addPaymentMethodSuccessMsg.getText()); I created this method
//		    logger.info("User validated a message");
//
//			}

	// updating Payment Method

	@When("User click on the Card")
	public void userClickOnTheCard() {
		click(factory.retailAccountPage().cardOption);
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.retailAccountPage().Editbutton);
		logger.info("User clicked on edit button");

	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> eiditpayment = dataTable.asMaps(String.class, String.class);

		clearTextUsingSendKeys(factory.retailAccountPage().cardNumberInputField);
		sendText(factory.retailAccountPage().cardNumberInputField, eiditpayment.get(0).get("cardNumber"));

		clearTextUsingSendKeys(factory.retailAccountPage().editnameOnCardInput);
		sendText(factory.retailAccountPage().editnameOnCardInput, eiditpayment.get(0).get("nameOnCard"));

		clearTextUsingSendKeys(factory.retailAccountPage().editexpirationMonthInput);
		selectByVisibleText(factory.retailAccountPage().editexpirationMonthInput,
				eiditpayment.get(0).get("expirationMonth"));

		clearTextUsingSendKeys(factory.retailAccountPage().editexpirationYearInput);
		selectByVisibleText(factory.retailAccountPage().editexpirationYearInput,
				eiditpayment.get(0).get("expirationYear"));

		clearTextUsingSendKeys(factory.retailAccountPage().editsecurityCodeInput);
		sendText(factory.retailAccountPage().editsecurityCodeInput, eiditpayment.get(0).get("securityCode"));
		logger.info("User edited payment method");

	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.retailAccountPage().editupdatBtn);
		logger.info("User clicked on update button");

	}

//		@Then("a message should  display {string}") I created this method for myself
//		public void aMessageShouldDisplay(String PaymentUpdate) {
//			waitTillPresence(factory.retailAccountPage().SuccessMssgDisplayed);
//			Assert.assertEquals(PaymentUpdate, factory.retailAccountPage().SuccessMssgDisplayed.getText()); i c]
//	    logger.info("User validated a message");

	// Removing Card Method

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.retailAccountPage().cardOption);
		click(factory.retailAccountPage().removingCard);
		logger.info("Card Removed");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.retailAccountPage().AddButtonDisplay.isDisplayed());
	}

	// Adding address

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.retailAccountPage().addressOption);
		logger.info("User clicked on address button");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addAdress = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.retailAccountPage().countryFeild,
				DataGenerator.addressGenerator(addAdress.get(0).get("country")));
		sendText(factory.retailAccountPage().fullNameInput,
				DataGenerator.addressGenerator(addAdress.get(0).get("fullName")));
		sendText(factory.retailAccountPage().AddressPhon,
				DataGenerator.addressGenerator(addAdress.get(0).get("phoneNumber")));
		sendText(factory.retailAccountPage().addressStName,
				DataGenerator.addressGenerator(addAdress.get(0).get("streetAddress")));
		sendText(factory.retailAccountPage().apartmentInput,
				DataGenerator.addressGenerator(addAdress.get(0).get("apt")));
		sendText(factory.retailAccountPage().cityInputField,
				DataGenerator.addressGenerator(addAdress.get(0).get("city")));
		selectByVisibleText(factory.retailAccountPage().statedropdown,
				DataGenerator.addressGenerator(addAdress.get(0).get("state")));
		sendText(factory.retailAccountPage().zipCodeField,
				DataGenerator.addressGenerator(addAdress.get(0).get("zipCode")));

	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.retailAccountPage().addressButnField);
		logger.info("User clicked on Address button");
	}

	@Then("a message should be displayin {string}")
	public void aMessageShouldBeDisplayin(String addressMessg) {
		waitTillPresence(factory.retailAccountPage().MssgAddress);
		Assert.assertEquals(addressMessg, factory.retailAccountPage().MssgAddress.getText());
		logger.info("User validated a message");

	}

	// Updating the Address

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.retailAccountPage().EditAdrssButon);
		logger.info("User cliked on edit button");

	}

	@When("user fill the new address form with below information")
	public void userFillTheNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> editAdress = dataTable.asMaps(String.class, String.class);

		selectByVisibleText(factory.retailAccountPage().countryFeild,
				DataGenerator.addressGenerator(editAdress.get(0).get("country")));

		clearTextUsingSendKeys(factory.retailAccountPage().fullNameInput);
		sendText(factory.retailAccountPage().fullNameInput,
				DataGenerator.addressGenerator(editAdress.get(0).get("fullName")));

		clearTextUsingSendKeys(factory.retailAccountPage().AddressPhon);
		sendText(factory.retailAccountPage().AddressPhon,
				DataGenerator.addressGenerator(editAdress.get(0).get("phoneNumber")));

		clearTextUsingSendKeys(factory.retailAccountPage().addressStName);
		sendText(factory.retailAccountPage().addressStName,
				DataGenerator.addressGenerator(editAdress.get(0).get("streetAddress")));

		clearTextUsingSendKeys(factory.retailAccountPage().apartmentInput);
		sendText(factory.retailAccountPage().apartmentInput,
				DataGenerator.addressGenerator(editAdress.get(0).get("apt")));

		clearTextUsingSendKeys(factory.retailAccountPage().cityInputField);
		sendText(factory.retailAccountPage().cityInputField,
				DataGenerator.addressGenerator(editAdress.get(0).get("city")));

		selectByVisibleText(factory.retailAccountPage().statedropdown,
				DataGenerator.addressGenerator(editAdress.get(0).get("state")));

		clearTextUsingSendKeys(factory.retailAccountPage().zipCodeField);
		sendText(factory.retailAccountPage().zipCodeField,
				DataGenerator.addressGenerator(editAdress.get(0).get("zipCode")));
		logger.info("User entered address information");

	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.retailAccountPage().updateAdressButn);
		logger.info("User clicked on update button");

	}

	@Then("a message should be displayed info {string}")
	public void aMessageShouldBeDisplayedInfo(String updateAddress) {
		waitTillPresence(factory.retailAccountPage().UpdatingAddress);
		Assert.assertEquals(updateAddress, factory.retailAccountPage().UpdatingAddress.getText());
		logger.info("User validated a message");

	}

	// Removing Address

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.retailAccountPage().AddressremoveButon);
		logger.info("User clicked on remove button");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.retailAccountPage().RemovingMssg.isDisplayed());
		logger.info("User validated a message");

	}
}
