package tek.capstone.guardians.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);

		
	}

	@FindBy(id = "accountLink")
	public WebElement accountOption;

	@FindBy(id = "nameInput")
	public WebElement updatingName;

	@FindBy(id = "personalPhoneInput")
	public WebElement updatingPhone;

	@FindBy(id = "personalUpdateBtn")
	public WebElement updatButn;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement displayMessage;

	

	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement paymentLink;

	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberField;

	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInputField;

	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInputField;

	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInputField;

	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInputField;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;

	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement addPaymentMethodSuccessMsg;

	

	@FindBy(xpath = "//div[@class='false account__payment-item' or starts-with(@data-id,'77')]")
	public WebElement cardOption;

	@FindBy(xpath = "//button[contains(@class,'text-blue') and text()='Edit']")
	public WebElement Editbutton;

	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInputField;

	@FindBy(id = "nameOnCardInput")
	public WebElement editnameOnCardInput;

	@FindBy(id = "expirationMonthInput")
	public WebElement editexpirationMonthInput;

	@FindBy(id = "expirationYearInput")
	public WebElement editexpirationYearInput;

	@FindBy(id = "securityCodeInput")
	public WebElement editsecurityCodeInput;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement editupdatBtn;

	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement SuccessMssgDisplayed;

	

	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removingCard;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement AddButtonDisplay;

	// Adding address

	@FindBy(xpath = "//div[@class='account__address-new-wrapper']")
	public WebElement addressOption;

	@FindBy(id = "countryDropdown")
	public WebElement countryFeild;

	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;

	@FindBy(id = "phoneNumberInput")
	public WebElement AddressPhon;

	@FindBy(id = "streetInput")
	public WebElement addressStName;

	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;

	@FindBy(id = "cityInput")
	public WebElement cityInputField;

	@FindBy(name = "state")
	public WebElement statedropdown;

	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeField;

	@FindBy(id = "addressBtn")
	public WebElement addressButnField;

	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement MssgAddress;


	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement EditAdrssButon;

	@FindBy(id = "addressBtn")
	public WebElement updateAdressButn;

	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement UpdatingAddress;


	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement AddressremoveButon;

	@FindBy(xpath = "//p[text()='Add Address']")
	public WebElement RemovingMssg;

}
