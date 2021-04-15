package actions;

import org.openqa.selenium.WebDriver;

import steps.CommonSteps;


public class CommonActions {
	
	    CommonSteps commonSteps;
	    private WebDriver driver;

	    public CommonActions(CommonSteps commonSteps) {
	        this.driver = commonSteps.getDriver();
	    }

	    public void goToUrl(String url) {
	        driver.get(url);
	    }

	    public String getCurrentPageUrl() {
	        return driver.getCurrentUrl();
	    }

	    public String getCurrentPageTitle() {
	        return driver.getTitle();
	    }

	    public void quitWebDriver() {
	        driver.quit();
	    }
	}


