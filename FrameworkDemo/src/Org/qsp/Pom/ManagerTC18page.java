package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerTC18page {
@FindBy(xpath="//span[contains(text(),'Alvarez, Daniel')]")
private WebElement mgr;

public void checkmgr() {
	mgr.click();
}

public ManagerTC18page(WebDriver driver) {
	PageFactory.initElements(driver, this);
 }
}
