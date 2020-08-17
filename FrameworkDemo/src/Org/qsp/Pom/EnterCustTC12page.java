package Org.qsp.Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterCustTC12page {

	public EnterCustTC12page(WebDriver driver) {
       PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//div[@class='customerProjectSelector activeProjects']/descendant::input")
	private WebElement custTextbox;
	
	public void sendCust(String cname){
		custTextbox.sendKeys(cname,Keys.ENTER);
	}
	
	@FindBy(xpath="//div[contains(@class,'taskList')]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	private WebElement selecttasks;
	
	public void checkSelectTasks() {
		selecttasks.click();
	}

	
}
