package Org.qsp.Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HideRowPageTC02 {
	
	@FindBy(xpath = "//div[@class='addTaskButton enabled']/descendant::span[contains(.,'New')]")
	private WebElement NewLink;

	public void NewLinkClick() {
		NewLink.click();
	}

	
	@FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/descendant::div[@class='dropdownButton']")
	private WebElement SelectCustomerDropDown;



	public void SelectCustomerDropDownClick() throws InterruptedException {
	   SelectCustomerDropDown.click();
	}
	
	
	@FindBy(xpath="//div[@class='searchItemList']/div[@class='itemRow ' and text()='- New Customer -']")
	private WebElement Cust;
	
	public void ScrollUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	   
      js.executeScript("arguments[0].scrollIntoView(true);",Cust);
	}
	
	public void ScrollUpClick(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Cust);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement EnterCustName;

	public void EnterCustNameTBSendCname() {
		EnterCustName.sendKeys("Kirti");
	}

	@FindBy(xpath = "//input[@placeholder='Enter Project Name']")
	
	private WebElement EnterProjName;

	public void EnterProjNameSendPname() {
		EnterProjName.sendKeys("Aviation");
	}

	@FindBy(xpath="//tbody/tr[1]/td[1]/input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name']")
	private WebElement EnterTaskName;

	public void EnterTaskNameSendTname() {
		EnterTaskName.sendKeys("Create HLD");
	}

	@FindBy(xpath="//*[@id='createTasksPopup_content']/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[3]/input")
	private WebElement EstimateTime;

	public void EnterEstimateTime() {
		EstimateTime.sendKeys("2");
	}


	@FindBy(xpath="//*[@id='createTasksPopup_content']/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[4]/div/table/tbody/tr/td[2]/em/button")
	private WebElement SetDeadline;

	public void SetDeadlineClick() {
	SetDeadline.click();
	}

	@FindBy(xpath ="//tbody/tr[3]/descendant::td[5]/a[@class='x-date-date']/em/span")
	private WebElement SelectDate;

	public void clickSelectDate() {
		SelectDate.click();
	}

	@FindBy(xpath="//div[@class='components_button withPlusIcon']/div[contains(.,'Create Tasks')]")
	private WebElement createTask;
	public void clickcreateTaskButton() {
		createTask.click();
	}
	
 @FindBy(xpath="//div[@class='taskNameContainer']/div[@class='taskNameBlock']/following::div[@class='task-customer-and-project']/span[@class='customer' and contains(.,'Sachin')]")
 private WebElement newlyAddedRecord;

 public void mouseover1(WebDriver driver,String cname) {
	String xpt="//div[@class='taskNameContainer']/div[@class='taskNameBlock']/following::div[@class='task-customer-and-project']/span[@class='customer' and contains(.,'"+cname+"')]";
	WebElement ele2=driver.findElement(By.xpath(xpt));
	Actions a=new Actions(driver);
	a.moveToElement(ele2).build().perform();
	
}

public HideRowPageTC02(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
