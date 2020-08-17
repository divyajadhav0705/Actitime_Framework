package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportedTimeTC13page {
	
public ReportedTimeTC13page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//div[@class='taskNameCellContainer']/descendant::div[@class='taskNameContainer']/div/div[@class='task' and contains(.,'Calls')]")
private WebElement ptask;

public void clickPtask() {
	ptask.click();
}

@FindBy(xpath="//div[@class='reportedTime']")
private WebElement rtime;

public void clickRtime() {
	rtime.click();
}
}
