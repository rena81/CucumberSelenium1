package steps;

import actions.CommonActions;
import actions.EbayHomeActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;

public class EbayHomeSteps {
	CommonActions commonActions;
	EbayHomeActions ebayHomeActions;

	public EbayHomeSteps(CommonActions commonActions, EbayHomeActions ebayHomeActions) {
		this.commonActions = commonActions;
		this.ebayHomeActions = ebayHomeActions;
	}

	@Given("I am on Ebay Home Page")
	public void iAmOnEbayHomePage() {
		commonActions.goToUrl("https://www.ebay.com/");
	}

	@When("I click on Advanced Link")
	public void iClickOnAdvancedLink() {
		ebayHomeActions.clickAdvancedLink();
	}

	@Then("I navigate to Advanced Search page")
	public void iNavigateToAdvancedSearchPage() {
		String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
		String actUrl = commonActions.getCurrentPageUrl();
		if (!expUrl.equals(actUrl)) {
			fail("Page does not navigate to expected page");
		}
	}

	@When("I search for {string}")
	public void iSearchForIPhone(String str1) {
		ebayHomeActions.searchAnItem(str1);
		ebayHomeActions.clickSearchButton();
	}

	@Then("I validate atleast {int} search items present")
	public void iValidateAtleastSearchItemsPresent(int count1) {
		if (ebayHomeActions.getSearchItemsCount() < count1) {
			fail("Less than " + count1 + " results shown");
		}

	}

	@When("I search for {string} in {string} category")
	public void iSearchForSoapInBaByCategory(String item, String categ) throws InterruptedException {
		ebayHomeActions.searchAnItem(item);
		ebayHomeActions.selectCategoryOption(categ);
		Thread.sleep(3000);
		ebayHomeActions.clickSearchButton();
		Thread.sleep(1000);
	}

	@When("I click on {string}")
	public void i_click_on(String link) {
		ebayHomeActions.clickOnLinkByText(link);
	}

	@Then("I validate that page navigates to {string} and title contains {string}")
	public void i_validate_that_page_navigates_to_and_title_contains(String url, String title) {
		String actUrl = commonActions.getCurrentPageUrl();
		String actTitle = commonActions.getCurrentPageTitle();
		if (!actUrl.equals(url)) {
			fail("Page does not navigate to expected URL: " + url);
		}
		if (!actTitle.contains(title)) {
			fail("Title mismatch");
		}

	}



}
