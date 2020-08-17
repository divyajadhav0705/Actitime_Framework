package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class actiTimeIncpage {
	@FindBy(xpath = "//a[@class='header__logo']")
	private WebElement actiTimeHeaderLogo;
	
	@FindBy(xpath = "//a[contains(.,'Why actiTIME')]")
	private WebElement whyActiTime;
	
	@FindBy(xpath = "//a[contains(.,'Features')]/parent::li")
	private WebElement Features;
	
	@FindBy(xpath = "//ul[@class='main-menu__ul']/descendant::li/a[contains(.,'Pricing')]")
	private WebElement Pricing;
	
	@FindBy(xpath = "//ul[@class='main-menu__ul']/descendant::li/a[contains(.,'Clients')]")
	private WebElement Clients;
	
	@FindBy(xpath = "//ul[@class='main-menu__ul']/descendant::li/a[contains(.,'Blog')]")
	private WebElement Blog;
	
	@FindBy(xpath="//ul[@class='main-menu__ul']/descendant::li/a[contains(.,'Help Center')]")
	private WebElement HelpCenter;
	
	@FindBy(xpath="//a[@class='button button--header' and contains(.,'Try Free')]")
	private WebElement TryFree;
	
	@FindBy(xpath="//a[@class='button' and contains(.,'Start Using actiTIME')]")
	private WebElement StartUsingactiTIME;
	
	@FindBy(xpath="//a[contains(.,'See why they have chosen actiTIME')]")
	private WebElement SeeWhyChosenActiTime;
	
	@FindBy(xpath="//a[@class='new-index-our-story__article' and contains(.,'Time Tracking Software: The Complete List 2020')]")
	private WebElement TheCompleteList2020;
	
	@FindBy(xpath="//a[@class='new-index-our-story__article' and contains(.,'Tracking Project Progress with actiTIME')]")
	private WebElement TrackingProjectProgress;
	
	@FindBy(xpath="//a[@class='new-index-our-story__article' and contains(.,'How Time Reports Help Manage Teams and Projects')]")
	private WebElement HowTimeReportsHelp;
	
	@FindBy(xpath="//a[@class='button start-trial__button' and contains(.,'Start Using actiTIME')]")
	private WebElement StartUsingActitime;
	
	@FindBy(xpath="//div[@class='call-back-app__question-button call-back-app__animation-first-step']")
	private WebElement QuestionMarkIcon;
	
	public void actiTimeHeaderClick() {
		actiTimeHeaderLogo.click();
	}
	
	public void WhyActitimeClick() {
		whyActiTime.click();
	}
	
	public void mouseover(WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(Features).build().perform();
		a.moveToElement(Clients).build().perform();
		a.moveToElement(Blog).build().perform();
		a.moveToElement(HelpCenter).build().perform();
	}
	
	public void PricingClick() {
		Pricing.click();
	}
	
	public void TryFreeClick() {
		TryFree.click();
	}
	
	public void StartUsingActiTimeButton() {
		StartUsingactiTIME.click();
	}
	
	public void TheCompleteList2020click() {
		TheCompleteList2020.click();
	}
	
	public void TrackingProjectProgressclick() {
		TrackingProjectProgress.click();
	}
	
	
}
