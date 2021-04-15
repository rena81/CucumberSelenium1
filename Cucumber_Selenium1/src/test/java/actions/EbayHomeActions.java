package actions;

import elements.EbayHomeElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.CommonSteps;

import java.util.List;

public class EbayHomeActions {
	private WebDriver driver;
	EbayHomeElements ebayHomeElements;

	public EbayHomeActions(CommonSteps commonSteps){
		this.driver = commonSteps.getDriver();
		ebayHomeElements = new EbayHomeElements(driver);
	}
	public void clickAdvancedLink(){
		ebayHomeElements.advancedLink.click();
	}
	public void searchAnItem(String srchString){
		ebayHomeElements.searchBox.sendKeys(srchString);
	}
	public void clickSearchButton(){
		ebayHomeElements.searchButton.click();
	}
	public int getSearchItemsCount(){
		String itemCountStr = ebayHomeElements.numOfItems.getText().trim().replaceAll(",","");
		int itemCountInt = Integer.parseInt(itemCountStr);
		return itemCountInt;
	}
	public void selectCategoryOption(String option){
		List<WebElement> cat = ebayHomeElements.catOptions;
		for(WebElement x : cat){
			if (x.getText().trim().equalsIgnoreCase(option)){
				x.click();
				break;
			}
		}
	}

	public void clickOnLinkByText(String linkText){
		driver.findElement(By.linkText(linkText)).click();
	}
}


