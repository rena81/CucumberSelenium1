package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonSteps {
	private WebDriver driver;

	@Before(order = 1)
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		driver = new ChromeDriver(options);
		System.out.println("Global Before hook executed");
	}

	@After(order = 1)
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(1000);
		System.out.println("Global After hook executed");
	}

	public WebDriver getDriver(){
		return driver;
	}
}

