package Org.qsp.testPom;
import org.testng.annotations.Test;
import Org.qsp.Pom.EnterTimeTrackPage;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.MoveToPageTC08;
import Org.qsp.Pom.ReportPage;
import Org.qsp.Pom.TimeTrackPageTC01;
import genericmethod.BaseTest;
import genericmethod.XL;

public class test_TC08 extends BaseTest{
@Test
public void TC08() throws InterruptedException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
	String title=XL.getdata(XL_PATH, SHEET_NAME, 1, 2);
	MoveToPageTC08 mp=new MoveToPageTC08(driver);
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
	tp.EnterCustNameTBSendCname("Nikisha");
	tp.EnterProjNameSendPname("AviationDemo");
	tp.EnterTaskNameSendTname("CreateUIUXPage");
	tp.EnterEstimateTime("3");
    Thread.sleep(10000);
	tp.SetDeadlineClick();
	Thread.sleep(5000);
    tp.clickSelectDate();
	Thread.sleep(6000);
	tp.clickcreateTaskButton();
	Thread.sleep(3000);
	mp.clickCreatedCustomer();
	mp.clickActionsDropdown();
	mp.clickMoveTo();
	mp.clickdropdown();
	mp.selectCustomer();
	mp.clickdropdown1();
	mp.selectProject();
	mp.ScrollUp(driver);
	mp.ScrollUpClick(driver);
	Thread.sleep(3000);
	}
}
