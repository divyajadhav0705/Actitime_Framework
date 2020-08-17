package Org.qsp.Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CopyPropertiesPageTC04 {
@FindBy(xpath = "//div[@class='title dashedLink']")
private WebElement copyproplink;

public void clickCopyPropLink() {
	copyproplink.click();
}

@FindBy(xpath="//div[@class='addTasksSelectorPanelContent']/descendant::div/descendant::td[@class='dropdownButton']")
private WebElement dropdowncustproj;

public void clickDropDownCustProj() {
	dropdowncustproj.click();
}

@FindBy(xpath="//td[contains(text(),'Big Bang Company')]")
private WebElement BBC;
@FindBy(xpath="//span[contains(text(),'Flight analysis')]")
private WebElement Checkbox;
@FindBy(xpath="//span[contains(@class,'buttonImportTitle')]")
private WebElement CopyProperties;

public void BBCClick() {
	BBC.click();
}
public void CheckboxClick() {
	Checkbox.click();
}
public void CopyPropertiesClick() {
	CopyProperties.click();
}

public CopyPropertiesPageTC04(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
