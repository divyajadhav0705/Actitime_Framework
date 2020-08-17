package Org.qsp.Pom;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPageTC01{
	
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

public void EnterCustNameTBSendCname(String cname) {
	EnterCustName.sendKeys(cname);
}

@FindBy(xpath = "//input[@placeholder='Enter Project Name']")
private WebElement EnterProjName;

public void EnterProjNameSendPname(String pname) {
	EnterProjName.sendKeys(pname);
}

@FindBy(xpath="//tbody/tr[1]/td[1]/input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name']")
private WebElement EnterTaskName;

public void EnterTaskNameSendTname(String tname) {
	EnterTaskName.sendKeys(tname);
}

@FindBy(xpath="//*[@id='createTasksPopup_content']/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[3]/input")
private WebElement EstimateTime;

public void EnterEstimateTime(String est) {
	EstimateTime.sendKeys(est);
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
public TimeTrackPageTC01(WebDriver driver) {
PageFactory.initElements(driver, this);
 }
}
