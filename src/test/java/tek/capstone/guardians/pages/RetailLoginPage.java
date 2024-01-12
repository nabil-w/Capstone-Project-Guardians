package tek.capstone.guardians.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailLoginPage extends BaseSetup {

	
	public RetailLoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(linkText = "TEKSCHOOL")
	public WebElement TekSchoolLogo;

	@FindBy(id = "signinLink")
	public WebElement sigInLink;

	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "password")
	public WebElement passwordField;

	@FindBy(id = "loginBtn")
	public WebElement loginBtn;

	@FindBy(id = "logoutBtn")
	public WebElement logoutBtn;

	@FindBy(id = "newAccountBtn")
	public WebElement createbuton;

	@FindBy(id = "nameInput")
	public WebElement nameInput;

	@FindBy(id = "emailInput")
	public WebElement emailInputField;

	@FindBy(id = "passwordInput")
	public WebElement passwordInptField;

	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;

	@FindBy(id = "signupBtn")
	public WebElement signupBtnField;

	@FindBy(xpath = "//h1[text()='John']")
	public WebElement validationField;

}