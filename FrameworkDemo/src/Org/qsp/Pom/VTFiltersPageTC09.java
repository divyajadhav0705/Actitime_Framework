package Org.qsp.Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class VTFiltersPageTC09 {
	
public VTFiltersPageTC09(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//a[@class='item' and contains(.,'View Time-Track')]")
private WebElement viewtimetrack;

public void clickViewTimeTrack() {
	viewtimetrack.click();
}

@FindBy(xpath="//div[contains(text(),'Filters')]")
               
private WebElement filtersdropdown;

public void clickFiltersDropDown() {
	filtersdropdown.click();
}

@FindBy(xpath="//td[@class='middle-right-cell']/div[@class='arrow']")
private WebElement cpdropdown;

public void clickcpdropdown() {
	cpdropdown.click();
}

@FindBy(xpath="//div[@class='x-form-radio-wrap ']/div/img")
private WebElement radiobutton;

public void selectRadioButton() {
    radiobutton.click();
}

@FindBy(xpath="//span[contains(text(),'reset filter')]")
private WebElement resetfilter;

public void clickresetfilter() {
	resetfilter.click();
}

@FindBy(xpath="//div[contains(@class,'x-btn greyButton close-button')]")
private WebElement closebtn;

public void clickCloseButton() {

	closebtn.click();
}

@FindBy(xpath="//input[@class='showApproved']")
private WebElement approvechkbox;

public void checkApprove() {
	approvechkbox.click();
}

@FindBy(xpath="//input[@class='applyFilterEdit']")
private WebElement applybutton;

public void clickApplyButton() {
	applybutton.click();
}
}
