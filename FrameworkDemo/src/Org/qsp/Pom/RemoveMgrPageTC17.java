package Org.qsp.Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveMgrPageTC17{

	@FindBy(xpath="//div[contains(text(),'Calls')]")
	private WebElement ptask1;

	public void clickStask() {
		System.out.println("in Stack");
		ptask1.click();
	}
	
	
	@FindBy(xpath="//span[contains(text(),'MANAGERS (3)')]")
	private WebElement managers;

	public void clickMgr() {
		managers.click();
	}

	@FindBy(xpath="//div[@class='loadingContainer managersTab panelTab']/descendant::div[@class='assignUserButton components_button withPlusIcon' and text()='Add Managers']")
	private WebElement addMgr;

	public void clickAddMgr() {
		addMgr.click();
	}
	@FindBy(xpath="//div[contains(@class,'x-layer x-menu at-selector-menu')]//div[3]//div[2]//div[2]//div[1]//a[1]//span[1]")
	private WebElement mgrcs;
	
	public void slctmgr() {
		mgrcs.click();
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
	
	@FindBy(xpath="//body[contains(@class,'ext-chrome')]//div[contains(@class,'contentWrapper')]//div[contains(@class,'content')]//div[contains(@class,'content')]//div[2]//div[2]//div[1]//div[1]//div[2]//div[3]//div[1]")
    private WebElement delmgr;
	
	public void clickdelmgr() {
		delmgr.click();
	}
	public RemoveMgrPageTC17(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
