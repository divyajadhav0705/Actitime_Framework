package Org.qsp.testPom;
import org.testng.annotations.Test;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.ManagersTC15page;
import Org.qsp.Pom.ReportPage;
import Org.qsp.Pom.ReportedTimeTC13page;
import genericmethod.BaseTest;
import genericmethod.XL;

public class test_TC15 extends BaseTest {
	@Test
	public void tc15() throws InterruptedException {
		String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
		String pw=XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
		//AssignedUsersTC14 au=new AssignedUsersTC14(driver);
		LoginPage lp=new LoginPage(driver);
		//EnterCustTC12page ep=new EnterCustTC12page(driver);
		lp.username(un);
		lp.setPassword(pw);
		lp.loginButton();
		ReportPage rp=new ReportPage(driver);
        rp.clicktimetrack();
		ReportedTimeTC13page rt=new ReportedTimeTC13page(driver);
		Thread.sleep(2000);
		rt.clickPtask();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ManagersTC15page mp=new ManagersTC15page(driver);
		mp.clickMgr();
		Thread.sleep(2000);
		mp.clickAddMgr();
		Thread.sleep(2000);
		mp.chkmgr();
		Thread.sleep(2000);
		mp.ScrollUp(driver);
		Thread.sleep(2000);
		mp.ScrollUpClick(driver);
		Thread.sleep(2000);
		
	}
}
