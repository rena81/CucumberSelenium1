package steps;

import actions.CommonActions;
import actions.EbayAdvSearchActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;

public class EbayAdvSearchSteps {
	CommonActions commonActions;
	EbayAdvSearchActions ebayAdvSearchActions;

	public EbayAdvSearchSteps(CommonActions commonActions, EbayAdvSearchActions ebayAdvSearchActions) {
		this.commonActions = commonActions;
		this.ebayAdvSearchActions = ebayAdvSearchActions;
	}

	@Given("I am on Advanced Search Page")
	public void iAmOnAdvancedSearchPage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		commonActions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
	}

	@When("I click on Ebay Logo")
	public void iClickOnEbayLogo() {
		ebayAdvSearchActions.clickEbayLogo();
	}

	@Then("I am navigated to Ebay Home Page")
	public void iAmNavigatedToEbayHomePage() {
		String expTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		if (!expTitle.equals(commonActions.getCurrentPageTitle())) {
			fail("Failed navigation to Ebay Home");
		}
	}

	@When("I Advanced search an item")
	public void iAdvancedSearchAnItem(DataTable dataTable) throws InterruptedException {
		ebayAdvSearchActions.enterSearchString(dataTable.cell(1, 0));
		ebayAdvSearchActions.enterExcludeString(dataTable.cell(1, 1));
		ebayAdvSearchActions.enterMinPrice(dataTable.cell(1, 2));
		ebayAdvSearchActions.enterMaxPrice(dataTable.cell(1, 3));
		ebayAdvSearchActions.clickAdvSearchButton();
		Thread.sleep(3000);
	}
}

