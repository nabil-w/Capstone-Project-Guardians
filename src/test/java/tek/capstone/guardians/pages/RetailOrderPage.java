package tek.capstone.guardians.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {


	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "search")
	public WebElement allDepartmentdropdwon;

	@FindBy(id = "searchInput")
	public WebElement searchInputField;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;

	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement Itemkasaoutdoorsmartplug;

	@FindBy(xpath = "//select[starts-with(@class,'product__select')]")
	public WebElement qtyDropDwon;

	@FindBy(id = "addToCartBtn")
	public WebElement addToCartBtn;

	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartItemQty;

	@FindBy(id = "search")
	public WebElement DepartDropDown;

	@FindBy(id = "searchInput")
	public WebElement searchInputbar;

	@FindBy(id = "searchBtn")
	public WebElement searchBtnFieldss;

	@FindBy(xpath = "//img[starts-with(@alt,'Apex Legends')]") // created element for line 76 public WebElement
																// apexLegends;
	public WebElement apexLegendsItems;

	@FindBy(xpath = "//select[starts-with(@class,'product__select')]")
	public WebElement selectQuantity;


	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQuantityTofive;

	@FindBy(id = "cartBtn")
	public WebElement cartBtnField;

	@FindBy(id = "proceedBtn")
	public WebElement proceedTochekcout;

	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBtn;

	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement successfullyMssg;

	// Cancel Order

	@FindBy(id = "orderLink")
	public WebElement orderLink;

	@FindBy(xpath = "//div[@class='order']//descendant::p[7]")
	public List<WebElement> listOfOrders;

	@FindBy(xpath = "//button[text()='Cancel The Order']")
	public List<WebElement> listOfCancel;

	@FindBy(id = "reasonInput")
	public WebElement reasonOfCancellation;

	@FindBy(id = "orderSubmitBtn")
	public WebElement orderSubmitBtnCancellation;

	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancelSucessfullyMsg;

	@FindBy(xpath = "//button[text()='Return Items']")
	public WebElement ReturnItem;

	@FindBy(id = "reasonInput")
	public WebElement ReasonDamageItem;

	@FindBy(id = "dropOffInput")
	public WebElement dropAtFedEx;

	@FindBy(id = "orderSubmitBtn")
	public WebElement OrderSumbitBTN;

	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returneItemMessg;

	@FindBy(id = "reviewBtn")
	public WebElement ReviewBtn;

	@FindBy(id = "headlineInput")
	public WebElement headlineInputField;

	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;

	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;

	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement amessageDisplayed;
}
