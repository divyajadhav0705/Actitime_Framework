package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadyForApprovalPageTC10 {
	
public ReadyForApprovalPageTC10(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[contains(@class,'showReady')]")
private WebElement ready;

public void checkReadyForApproval() {
	ready.click();
}

@FindBy(xpath="//input[contains(@class,'applyFilterEdit')]")
private WebElement apply;

public void clickApply() {
	apply.click();
}
}
