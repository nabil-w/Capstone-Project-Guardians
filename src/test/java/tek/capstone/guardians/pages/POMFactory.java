package tek.capstone.guardians.pages;

import tek.capstone.guardians.base.BaseSetup;

public class POMFactory extends BaseSetup {

	private RetailHomePage retailHomePage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retailOrderPage;
	private RetailLoginPage retailLoginPage;

	public POMFactory() {
		this.retailHomePage = new RetailHomePage();
		this.retailAccountPage = new RetailAccountPage();
		this.retailOrderPage = new RetailOrderPage();
		this.retailLoginPage = new RetailLoginPage();
	}

	public RetailHomePage retailHomePage() {
		return this.retailHomePage;
	}

	public RetailAccountPage retailAccountPage() {
		return this.retailAccountPage;
	}

	public RetailOrderPage retailOrderPage() {
		return this.retailOrderPage;
	}

	public RetailLoginPage retailLoginPage() {
		return this.retailLoginPage;
	}

}
