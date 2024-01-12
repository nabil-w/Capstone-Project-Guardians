package tek.capstone.guardians.steps;

import tek.capstone.guardians.utilities.CommonUtility;

import java.util.List;
//import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.capstone.guardians.pages.POMFactory;

public class HomeSteps extends CommonUtility {
	// created object of POMFactory class to access page object

	POMFactory factory = new POMFactory();

	@Given("User is on the retail home page")
	public void userIsOnTheRetailHomePage() {//// use CAMELCASE
		// I created object of POMFactory class to access the page object in page object
		// classes
		// using get method that I created in th POMFactory to have access for
		// validation below

	}
		

	@When("User click on all section")
	public void userClickOnAllSection() {
		click(factory.retailHomePage().allOptionsbar);
		logger.info("User clicked on all section");

	}

	@Then("below options should display in shop by Department sidebar")
	public void belowOptionsShouldDisplayInShopByDepartmentSidebar(DataTable dataTable) {

		List<List<String>> dropOptionsList = dataTable.asLists(String.class);// datatable from feature file. stored as
																				// string
		for (int i = 0; i < dropOptionsList.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(By
					.xpath("//div[@class='sidebar__content']//span[text()='" + dropOptionsList.get(0).get(i) + "']"))));
			logger.info("All options are displayed:" + dropOptionsList.get(0).get(i));
		}
	}

	@When("User on {string}")
	public void userOn(String Alldepartment) {
		List<WebElement> department = factory.retailHomePage().shopBaredisplay;
		for (int i = 0; i < department.size(); i++) {
			if (department.get(i).getText().equalsIgnoreCase(Alldepartment)) {
				department.get(i).click();
				break;
			}

		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> departmentOptions = dataTable.asLists(String.class);
		List<WebElement> options = factory.retailHomePage().SidebarOptinss;

		for (int i = 0; i < departmentOptions.get(0).size(); i++) {
			for (WebElement elments : options) {
				if (elments.getText().equalsIgnoreCase(departmentOptions.get(0).get(i))) {
					Assert.assertTrue(elments.isDisplayed());
					logger.info("All Options is presented");
				}
			}
		}

	}
}
