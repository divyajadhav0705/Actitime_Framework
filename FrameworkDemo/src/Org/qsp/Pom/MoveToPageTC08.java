package Org.qsp.Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveToPageTC08 {

	public MoveToPageTC08(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[contains(text(),'CreateUIUXPage')]")
	private WebElement createdCustomer;

	public void clickCreatedCustomer() {
		createdCustomer.click();
	}

	@FindBy(xpath="//div[@class='actionButtonWrapper']/div[@class='actionButton']")
	private WebElement actionsdropdown;

	public void clickActionsDropdown() {
		actionsdropdown.click();
	}
	@FindBy(xpath="//div[@class='moveButton']/div[@class='title' and contains(.,'Move to')]")
	private WebElement moveTo;
	
	public void clickMoveTo() {
		moveTo.click();
	}
	
	@FindBy(xpath="//div[@class='comboboxButton']/div[@class='dropdownButton']")
	private WebElement dropdown;

	public void clickdropdown() {
		dropdown.click();
	}

	@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and contains(.,'Galaxy Corporation')]")
	private WebElement customer;

	public void selectCustomer() {
		customer.click();
	}

	@FindBy(xpath="//div[@class='project']/descendant::div[@class='comboboxButton']/div[@class='dropdownButton']")
	private WebElement dropdown1;

	public void clickdropdown1() {
		dropdown1.click();
	}

	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and contains(.,'Android testing')]")
	private WebElement project;

	public void selectProject() {
		project.click();
	}

	@FindBy(xpath="//div[@class='ok button' and contains(.,'Move')]")
	private WebElement MoveButton;

	public void ScrollUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	  js.executeScript("arguments[0].scrollIntoView(true);",MoveButton);
	}

	public void ScrollUpClick(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", MoveButton);
		
	}

	@FindBy(xpath="//div[@class='ok button' and contains(.,'Move')]")
	private WebElement MoveButton1;

}
