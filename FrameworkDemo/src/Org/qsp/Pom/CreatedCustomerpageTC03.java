package Org.qsp.Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreatedCustomerpageTC03 {
	
	@FindBy(xpath="//div[@class='taskNameContainer']/div/div[contains(.,'Create statement page')]")
	private WebElement createdCust;
	
	public void clickCreatedCust() {
		createdCust.click();
	}

	public CreatedCustomerpageTC03(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='actionButtonWrapper']/div[@class='actionButton']")
	private WebElement actionsdropdown;
	
	public void clickActionsDropdown() {
		actionsdropdown.click();
	}
	
	@FindBy(xpath="//div[@class='title' and contains(.,'Delete')]")
	private WebElement deletebutton;
	
	public void clickDeleteButton() {
		deletebutton.click();
	}
	
	@FindBy(xpath="//div[@class='buttonIcon']/span[contains(.,'Delete permanently')]")
	private WebElement deletepermbutton;
	
	public void clickDeletePermButton() {
		deletepermbutton.click();
	}
}
