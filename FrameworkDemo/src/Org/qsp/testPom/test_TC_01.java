package Org.qsp.testPom;
import org.testng.annotations.Test;
import java.lang.reflect.InvocationTargetException;
import Org.qsp.Pom.EnterTimeTrackPage;
import Org.qsp.Pom.TimeTrackPageTC01;
import genericmethod.BaseTest;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.ReportPage;
import genericmethod.XL;

public class test_TC_01 extends BaseTest {
@Test
public void testCreateNewTask() throws InterruptedException, InvocationTargetException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
	String title=XL.getdata(XL_PATH, SHEET_NAME, 1, 2);
	TimeTrackPageTC01 tp=new TimeTrackPageTC01(driver);
	LoginPage lp=new LoginPage(driver);
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
	tp.EnterCustNameTBSendCname("Dipti1234");
	tp.EnterProjNameSendPname("Test11");
	tp.EnterTaskNameSendTname("Testtask");
	tp.EnterEstimateTime("2");
    Thread.sleep(10000);
	tp.SetDeadlineClick();
	Thread.sleep(5000);
    tp.clickSelectDate();
	Thread.sleep(6000);
	tp.clickcreateTaskButton();
	Thread.sleep(3000);
	}
}
