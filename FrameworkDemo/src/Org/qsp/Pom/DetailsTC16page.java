package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsTC16page {
@FindBy(xpath="//div[@class='details']")
private WebElement details;

public void clickdetails() {
	details.click();
}

@FindBy(xpath="/html/body/div[18]/div[1]/div/div[1]/div/div[2]/div/div[7]/div[1]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div")
private WebElement statusdd;

public void clickStatusdd() {
	statusdd.click();
}

@FindBy(xpath="//div[@class='cellButton']/descendant::div[@class='name' and contains(.,'In Progress')]")
private WebElement sstatus;

public void clicksstatus() {
	sstatus.click();
}

public DetailsTC16page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}

