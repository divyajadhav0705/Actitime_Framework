package Org.qsp.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommentsPageTc6 {
@FindBy(xpath = "//div[@class='userNameWrapper']")
private WebElement Me;
public void clickMe() {
	Me.click();

}
}
