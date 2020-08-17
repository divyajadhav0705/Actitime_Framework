package Org.qsp.testPom;
import org.testng.annotations.Test;
import Org.qsp.Pom.CopyPropertiesPageTC04;
import Org.qsp.Pom.EnterTimeTrackPage;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.ReportPage;
import Org.qsp.Pom.TimeTrackPageTC01;
import genericmethod.BaseTest;
import genericmethod.XL;

public class Test_Case_04 extends BaseTest {
@Test
public void testCopyPropPage() throws InterruptedException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 5, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 5, 1);
	String title=XL.getdata(XL_PATH, SHEET_NAME, 5, 2);
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
	tp.EnterCustNameTBSendCname("Rutika");
	tp.EnterProjNameSendPname("Create Design");
	CopyPropertiesPageTC04 cp=new CopyPropertiesPageTC04(driver);
	Thread.sleep(3000);
	cp.clickCopyPropLink();
	Thread.sleep(3000);
	cp.clickDropDownCustProj();
	Thread.sleep(3000);
	cp.BBCClick();
	Thread.sleep(3000);
	cp.CheckboxClick();
	Thread.sleep(3000);
	cp.CopyPropertiesClick();
	Thread.sleep(3000);
	}
}
