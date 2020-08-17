package Org.qsp.testPom;
import org.testng.annotations.Test;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.ReportPage;
import Org.qsp.Pom.ReportedTimeTC13page;
import genericmethod.BaseTest;
import genericmethod.XL;

public class test_TC13 extends BaseTest{
@Test
public void tc13() throws InterruptedException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
	LoginPage lp=new LoginPage(driver);
	lp.username(un);
	lp.setPassword(pw);
	lp.loginButton();
	ReportPage rp=new ReportPage(driver);
	rp.clicktimetrack();
	ReportedTimeTC13page rt=new ReportedTimeTC13page(driver);
	Thread.sleep(2000);
	rt.clickPtask();
	Thread.sleep(2000);
	rt.clickRtime();
	Thread.sleep(2000);
}
}
