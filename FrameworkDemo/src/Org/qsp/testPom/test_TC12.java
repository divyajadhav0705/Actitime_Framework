package Org.qsp.testPom;

import org.testng.annotations.Test;

import Org.qsp.Pom.AddTaskTC11page;
import Org.qsp.Pom.EnterCustTC12page;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.ReportPage;
import genericmethod.BaseTest;
import genericmethod.XL;

public class test_TC12 extends BaseTest{
@Test
public void tc12() throws InterruptedException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
	LoginPage lp=new LoginPage(driver);
	EnterCustTC12page ep=new EnterCustTC12page(driver);
	lp.username(un);
	lp.setPassword(pw);
	lp.loginButton();
	ReportPage rp=new ReportPage(driver);
	rp.clicktimetrack();
	AddTaskTC11page ap=new AddTaskTC11page(driver);
	ap.clickAddTasks();
	Thread.sleep(2000);
	ap.clickdropdown();
	Thread.sleep(2000);
	ep.sendCust("Galaxy Corporation");
	Thread.sleep(2000);
	ep.checkSelectTasks();
	Thread.sleep(2000);
	ap.clickAddSelected();
	
}
}
