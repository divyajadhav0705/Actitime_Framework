package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeTC19page {
@FindBy(xpath="//td[@class='userSelectorButton']/span[@class='arrow']")
private WebElement Me;

public void clickMe() {
	Me.click();
}

public MeTC19page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//span[contains(text(),'Alvarez, Daniel')]")
private WebElement precord;

public void clickPrecord() {
	precord.click();
}

}
