package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath = "//input[@name='username']")
private WebElement unTB;
@FindBy(xpath="//input[@name='pwd']")
private WebElement pwTB;
@FindBy(xpath="//a[@id='loginButton']")
private WebElement loginBtn;
@FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
private WebElement keepMeLoggedIn;
@FindBy(xpath="//a[@id='toPasswordRecoveryPageLink']")
private WebElement forgetPassword;
@FindBy(xpath="//a[contains(.,'actiTIME Inc.')]")
private WebElement actiTimeInc;
public LoginPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}

public void username(String un) {
	unTB.sendKeys(un);
	
}

public void setPassword(String pw) {
	pwTB.sendKeys(pw);
}

public void loginButton() {
	loginBtn.click();
}

public void checkKeepMeLogin() {
	keepMeLoggedIn.click();
}
public void clickForgetPassword() {
forgetPassword.click();
}
public void clickActiTimeInc() {
	actiTimeInc.click();
}

}
