package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class TaggedHooks {
	WebDriver driver;

	public TaggedHooks(CommonSteps commonSteps){
		driver = commonSteps.getDriver();
	}

	@Before(value = "@test3", order = 0)
	public void setCookies(){
		System.out.println("Scenario specific Before hook executed");
	}

	@After(value = "@testTag", order = 0)
	public void testAfterHook(){
		System.out.println("Scenario specific After hook executed");
	}
}


