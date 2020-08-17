package Org.qsp.Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagersTC15page {
	
public ManagersTC15page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//div[@class='managers']/span[@class='tabText']")
private WebElement managers;

public void clickMgr() {
	managers.click();
}

@FindBy(xpath="//div[@class='loadingContainer managersTab panelTab']/descendant::div[@class='assignUserButton components_button withPlusIcon' and text()='Add Managers']")
private WebElement addMgr;

public void clickAddMgr() {
	addMgr.click();
}


@FindBy(xpath = "//div[contains(@class,'loadingContainer managersTab panelTab')]//div[contains(@class,'treeContainer filtered hideDisabled')]/div[1]/div[2]/div[1]/div[1]/a[1]/span[1]")
private WebElement mgrchkbox;

public void chkmgr() {
	mgrchkbox.click();
}

@FindBy(xpath="//div[contains(@class,'x-btn greyButton close-button')]/span")
private WebElement closeBtn;

public void ScrollUp(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
   
  js.executeScript("arguments[0].scrollIntoView(true);",closeBtn);
}

public void ScrollUpClick(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", closeBtn);
	
}
}