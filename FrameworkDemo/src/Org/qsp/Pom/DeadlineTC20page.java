package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeadlineTC20page {

	public DeadlineTC20page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//span[@class='na']")
private WebElement setupdeadline;

public void clkSetupdeadline() {
	setupdeadline.click();
}

@FindBy(xpath ="//tbody/tr[3]/descendant::td[5]/a[@class='x-date-date']/em/span")
private WebElement SelectDate;

public void clickSelectDate() {
	SelectDate.click();
}

@FindBy(xpath="//tbody/tr[4]/descendant::td[3]/a[@class='x-date-date']/em/span")
private WebElement pdate;

public void selectpdate() {
	pdate.click();
}

}
