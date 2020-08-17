package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTaskTC11page {

	public AddTaskTC11page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='addTasksButton ']/span[@class='dashedLink ' and contains(.,'Add Tasks from the List')]")
	private WebElement addtasks;
	
	public void clickAddTasks() {
		addtasks.click();
	}
	
	@FindBy(xpath="//div[@class='customerProjectSelector activeProjects']/descendant::td[@class='dropdownButton']")
	private WebElement dropdown;
	
	public void clickdropdown() {
		dropdown.click();
	}

    @FindBy(xpath = "//*[@id='taskSelectControl']/div[2]/div[2]/div[1]/div/div[1]/table[5]/tbody/tr/td[1]")
	private WebElement customer;
	
	public void selectcustomer() {
		customer.click();
	}
	
	@FindBy(xpath="//div[contains(@class,'taskList')]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	private WebElement selecttasks;
	
	public void checkSelectTasks() {
		selecttasks.click();
	}
	
	@FindBy(xpath="//button[contains(@class,'addSelectedButton')]")
	private WebElement AddSelected;
	
	public void clickAddSelected() {
		AddSelected.click();
	}
	
}
