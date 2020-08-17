package Org.qsp.Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignedUsersTC14 {

	public AssignedUsersTC14(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//div[@class='assignedUsers']")
	private WebElement assignedUser;
	
	public void clickassignedUser() {
		assignedUser.click();
	}
	
	@FindBy(xpath="//div[@class='assignUserButton components_button withPlusIcon' and contains(.,'Assign')]")
	private WebElement assign;
	
	public void clickassign(){
		assign.click();
	}

	@FindBy(xpath="//div[contains(@class,'x-layer x-menu at-selector-menu')]//div[3]/div[2]/div[1]/div[1]/a[1]/span[1]")
	private WebElement taskchkbox;
	
	public void checktask() {
		taskchkbox.click();
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
