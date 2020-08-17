package Org.qsp.testPom;

import org.testng.annotations.Test;
import Org.qsp.Pom.EnterTimeTrackPage;
import Org.qsp.Pom.HideRowPageTC02;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.ReportPage;
import genericmethod.BaseTest;
import genericmethod.XL;

public class test_TC_02 extends BaseTest{
@Test
public void testHideRowPage() throws InterruptedException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 5, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 5, 1);
	String title=XL.getdata(XL_PATH, SHEET_NAME, 5, 2);
	HideRowPageTC02 hp=new HideRowPageTC02(driver);
	LoginPage lp=new LoginPage(driver);
	lp.username(un);
	lp.setPassword(pw);
	lp.loginButton();
	ReportPage rp=new ReportPage(driver);
	rp.clicktimetrack();
	
	EnterTimeTrackPage entpage=new EnterTimeTrackPage(driver);
	entpage.verifyHomePageIsDisplayed(driver, ETO, title);
	hp.NewLinkClick();
	Thread.sleep(3000);
	hp.SelectCustomerDropDownClick();
	
	hp.ScrollUp(driver);
	hp.ScrollUpClick(driver);
	
	Thread.sleep(3000);

    Thread.sleep(4000);
	hp.EnterCustNameTBSendCname();
	Thread.sleep(2000);
	hp.EnterProjNameSendPname();
	hp.EnterTaskNameSendTname();
	hp.EnterEstimateTime();
    Thread.sleep(10000);
	hp.SetDeadlineClick();
	Thread.sleep(5000);
    hp.clickSelectDate();
	Thread.sleep(6000);
	hp.clickcreateTaskButton();
	Thread.sleep(6000);
	


	
	
}
}
