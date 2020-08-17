package Org.qsp.testPom;
import org.testng.annotations.Test;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.RemoveMgrPageTC17;
import Org.qsp.Pom.ReportPage;
import genericmethod.BaseTest;
import genericmethod.XL;

public class test_TC17 extends BaseTest {
@Test
public void tc17() throws InterruptedException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
	RemoveMgrPageTC17 rm=new RemoveMgrPageTC17(driver);
	LoginPage lp=new LoginPage(driver);
	lp.username(un);
	lp.setPassword(pw);
	lp.loginButton();
	ReportPage rp=new ReportPage(driver);
	rp.clicktimetrack();
	Thread.sleep(2000);
	rm.clickStask();
    Thread.sleep(2000);
	rm.clickMgr();
	Thread.sleep(2000);
	rm.clickAddMgr();
	Thread.sleep(2000);
	rm.slctmgr();
	Thread.sleep(2000);
	rm.ScrollUp(driver);
	Thread.sleep(2000);
	rm.ScrollUpClick(driver);
	Thread.sleep(2000);
	rm.clickdelmgr();
	Thread.sleep(3000);
	}
}
