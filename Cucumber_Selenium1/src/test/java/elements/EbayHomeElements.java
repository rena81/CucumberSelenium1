package elements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EbayHomeElements {
	WebDriver driver;

	@FindBy(linkText = "Advanced")
	public WebElement advancedLink;
	@FindBy(xpath = "//input[@id = 'gh-ac']")
	public WebElement searchBox;
	@FindBy(xpath = "//input[@id = 'gh-btn']")
	public WebElement searchButton;
	@FindBy(xpath = "//h1[@class = 'srp-controls__count-heading']/span[1]")
	public WebElement numOfItems;
	@FindBy(xpath = "//select[@id = 'gh-cat']/option")
	public List<WebElement> catOptions;

	public EbayHomeElements(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
}


