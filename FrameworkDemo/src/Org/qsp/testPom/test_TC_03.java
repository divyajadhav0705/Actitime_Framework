package Org.qsp.testPom;
import org.testng.annotations.Test;
import Org.qsp.Pom.CreatedCustomerpageTC03;
import Org.qsp.Pom.EnterTimeTrackPage;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.ReportPage;
import genericmethod.BaseTest;
import genericmethod.XL;

public class test_TC_03 extends BaseTest {
@Test
public void testCreatedCustomerPage() throws InterruptedException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
	String title=XL.getdata(XL_PATH, SHEET_NAME, 1, 2);
	CreatedCustomerpageTC03 cc=new CreatedCustomerpageTC03(driver);
	LoginPage lp=new LoginPage(driver);
	lp.username(un);
	lp.setPassword(pw);
	lp.loginButton();
	ReportPage rp=new ReportPage(driver);
	rp.clicktimetrack();
	EnterTimeTrackPage entpage=new EnterTimeTrackPage(driver);
	entpage.verifyHomePageIsDisplayed(driver, ETO, title);
	cc.clickCreatedCust();
	Thread.sleep(4000);
	cc.clickActionsDropdown();
	Thread.sleep(2000);
	cc.clickDeleteButton();
	Thread.sleep(2000);
	cc.clickDeletePermButton();
	Thread.sleep(3000);
}
}
