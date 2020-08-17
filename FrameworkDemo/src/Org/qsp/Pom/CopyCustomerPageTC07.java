package Org.qsp.Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CopyCustomerPageTC07 {
@FindBy(xpath="//div[contains(text(),'CreateHomePage')]")
private WebElement createdCustomer;

public void clickCreatedCustomer() {
	createdCustomer.click();
}

@FindBy(xpath="//div[@class='actionButtonWrapper']/div[@class='actionButton']")
private WebElement actionsdropdown;

public void clickActionsDropdown() {
	actionsdropdown.click();
}

@FindBy(xpath="//div[@class='copyButton']/div[@class='title' and contains(.,'Copy to')]")
private WebElement copyTo;

public void clickCopyTo() {
	copyTo.click();
}

@FindBy(xpath="//div[@class='comboboxButton']/div[@class='dropdownButton']")
private WebElement dropdown;

public void clickdropdown() {
	dropdown.click();
}

@FindBy(xpath = "//div[@class='itemRow cpItemRow ' and contains(.,'Big Bang Company')]")
private WebElement customer;

public void selectCustomer() {
	customer.click();
}

@FindBy(xpath="//div[@class='project']/descendant::div[@class='comboboxButton']/div[@class='dropdownButton']")
private WebElement dropdown1;

public void clickdropdown1() {
	dropdown1.click();
}

@FindBy(xpath="//div[@class='itemRow cpItemRow ' and contains(.,'Flight operations')]")
private WebElement project;

public void selectProject() {
	project.click();
}

@FindBy(xpath="//div[@class='ok button' and contains(.,'Copy')]")
private WebElement CopyButton;

public void ScrollUp(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
   
  js.executeScript("arguments[0].scrollIntoView(true);",CopyButton);
}

public void ScrollUpClick(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", CopyButton);
	
}

@FindBy(xpath="//div[@class='ok button' and contains(.,'Copy')]")
private WebElement CopyButton1;

public void clickCopyButton() {
	CopyButton1.click();
}
public CopyCustomerPageTC07(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
