package tek.capstone.guardians.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.guardians.pages.POMFactory;
import tek.capstone.guardians.utilities.CommonUtility;

public class LoginSteps extends CommonUtility {

	// Created object of POMFactor to validate the method from LoginPage
	POMFactory factory = new POMFactory();

	@Given("User is on the retail website homepage")
	public void userIsOnTheRetailWebsiteHomepage() {
		Assert.assertTrue(factory.retailLoginPage().TekSchoolLogo.isDisplayed());
		logger.info("Tekschool logo is displayed");

	}

	@When("User click on the login link")
	public void userClickOnTheLoginLink() {
		click(factory.retailLoginPage().sigInLink);
		logger.info("Usre clicked successfully");
	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.retailLoginPage().emailField, email);
		sendText(factory.retailLoginPage().passwordField, password);
		logger.info("User entered email and password sucessfully");
	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.retailLoginPage().loginBtn);
		logger.info("User click on login button sucessfully");
	}

	@When("Verify user is logged in")
	public void verifyUserIsLoggedIn() {
		Assert.assertTrue(factory.retailLoginPage().logoutBtn.isDisplayed());

	}

	// Created an account

	@When("User click on create an new account")
	public void userClickOnCreateAnNewAccount() {
		click(factory.retailLoginPage().createbuton);
		logger.info("User clicked on create button");

	}

	@When("User enter {string} and {string} and {string} and {string}")
	public void userEnterAndAndAnd(String name, String email, String password, String confpassword) {
		sendText(factory.retailLoginPage().nameInput, name);
		sendText(factory.retailLoginPage().emailInputField, email);
		sendText(factory.retailLoginPage().passwordInptField, password);
		sendText(factory.retailLoginPage().confirmPasswordInput, confpassword);
		logger.info("Usre enetered name, email, and password");

	}

	@When("User click on signup button")
	public void userClickOnSignupButton() {
		click(factory.retailLoginPage().signupBtnField);
		logger.info("User signed sucessfully");
	}

	@Then("User account is created")
	public void userAccountIsCreated() {
		Assert.assertTrue(factory.retailLoginPage().validationField.isDisplayed());
	}
}
