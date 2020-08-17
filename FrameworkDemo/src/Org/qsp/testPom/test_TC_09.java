package Org.qsp.testPom;
import org.testng.annotations.Test;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.ReportPage;
import Org.qsp.Pom.VTFiltersPageTC09;
import genericmethod.BaseTest;
import genericmethod.XL;

public class test_TC_09 extends BaseTest{
@Test
public void tc09() throws InterruptedException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
	
	LoginPage lp=new LoginPage(driver);
	lp.username(un);
	lp.setPassword(pw);
	lp.loginButton();
	ReportPage rp=new ReportPage(driver);
	rp.clicktimetrack();
	Thread.sleep(2000);
	VTFiltersPageTC09 fp=new VTFiltersPageTC09(driver);
	Thread.sleep(2000);
	fp.clickViewTimeTrack();
	Thread.sleep(2000);
	fp.clickFiltersDropDown();
	Thread.sleep(2000);
	fp.clickcpdropdown();
	fp.selectRadioButton();
	Thread.sleep(2000);
	fp.clickresetfilter();
	fp.clickCloseButton();
	fp.checkApprove();
	Thread.sleep(2000);
	fp.clickApplyButton();
}
}
