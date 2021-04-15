package actions;

import elements.EbayAdvSearchElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.CommonSteps;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EbayAdvSearchActions {

	    WebDriver driver;
	    EbayAdvSearchElements ebayAdvSearchElements;
	    WebDriverWait wait;

	    public EbayAdvSearchActions(CommonSteps commonSteps){
	        driver = commonSteps.getDriver();
	        ebayAdvSearchElements = new EbayAdvSearchElements(driver);
	        wait = new WebDriverWait(driver, 30);
	    }
	    public void clickEbayLogo(){
	        wait.until(ExpectedConditions.visibilityOf(ebayAdvSearchElements.ebayLogo));
	        wait.until(ExpectedConditions.elementToBeClickable(ebayAdvSearchElements.ebayLogo));
	        ebayAdvSearchElements.ebayLogo.click();
	    }
	    public void enterSearchString(String searchString){
	        ebayAdvSearchElements.searchString.sendKeys(searchString);
	    }
	    public void enterExcludeString(String excludeString){
	        ebayAdvSearchElements.excludeString.sendKeys(excludeString);
	    }
	    public void enterMinPrice(String minPrice){
	        ebayAdvSearchElements.minPrice.sendKeys(minPrice);
	    }
	    public void enterMaxPrice(String maxPrice){
	        ebayAdvSearchElements.maxPrice.sendKeys(maxPrice);
	    }
	    public void clickAdvSearchButton(){
	        ebayAdvSearchElements.advSearchButton.click();
	    }





	}

}
