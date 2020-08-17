package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class EnterTimeTrackPage {

	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyHomePageIsDisplayed(WebDriver driver,long ETO,String title)
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver,ETO);
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Home page is displayed", true);
		}catch(Exception e) {
			Reporter.log("Home page is not displayed", true);
			Assert.fail();
		}
	}

	
}
