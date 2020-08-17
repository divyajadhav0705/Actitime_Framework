package Org.qsp.testPom;

import org.testng.annotations.Test;

import genericmethod.BaseTest;
import genericmethod.XL;
import Org.qsp.Pom.CopyCustomerPageTC07;
import Org.qsp.Pom.EnterTimeTrackPage;
import Org.qsp.Pom.TimeTrackPageTC01;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.ReportPage;

public class test_TC07 extends BaseTest{
@Test
public void TC07() throws InterruptedException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
	String title=XL.getdata(XL_PATH, SHEET_NAME, 1, 2);
	CopyCustomerPageTC07 cp=new CopyCustomerPageTC07(driver);
	LoginPage lp=new LoginPage(driver);
	TimeTrackPageTC01 tp=new TimeTrackPageTC01(driver);
	lp.username(un);
	lp.setPassword(pw);
	lp.loginButton();
	ReportPage rp=new ReportPage(driver);
	rp.clicktimetrack();
	EnterTimeTrackPage entpage=new EnterTimeTrackPage(driver);
	entpage.verifyHomePageIsDisplayed(driver, ETO, title);
	tp.NewLinkClick();
	tp.SelectCustomerDropDownClick();
	tp.ScrollUp(driver);
	tp.ScrollUpClick(driver);
	tp.EnterCustNameTBSendCname("Nitasha5");
	tp.EnterProjNameSendPname("AviationNew");
	tp.EnterTaskNameSendTname("CreateHomePage");
	tp.EnterEstimateTime("3");
    Thread.sleep(10000);
	tp.SetDeadlineClick();
	Thread.sleep(5000);
    tp.clickSelectDate();
	Thread.sleep(6000);
	tp.clickcreateTaskButton();
	Thread.sleep(6000);
	cp.clickCreatedCustomer();
	cp.clickActionsDropdown();
	cp.clickCopyTo();
	cp.clickdropdown();
	cp.selectCustomer();
	cp.clickdropdown1();
	cp.selectProject();
	cp.ScrollUp(driver);
	cp.ScrollUpClick(driver);
	Thread.sleep(3000);
	}
}
