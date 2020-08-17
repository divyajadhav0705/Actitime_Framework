package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage {
@FindBy(xpath = "//input[@id='forgetPasswordEmailOrUsername']")
private WebElement EmailorUsername;

@FindBy(xpath = "//a[@id='forgetPasswordButton']")
private WebElement RequestLoginInfo;

@FindBy(xpath = "//a[@id='toLoginPageLink']")
private WebElement ReturnToLoginPage;

public void EmailOrUserNameTBSendText(String un) {
	EmailorUsername.sendKeys(un);
}

public void RequestLoginInfoBtnClick() {
	RequestLoginInfo.click();
}

public void ReturnToLoginPageLink() {
	ReturnToLoginPage.click();
}

public ForgetPasswordPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
