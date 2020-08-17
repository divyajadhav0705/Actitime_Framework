package Org.qsp.testPom;
import org.testng.annotations.Test;
import Org.qsp.Pom.EnterTimeTrackPage;
import Org.qsp.Pom.ExportPdfpageTC05;
import Org.qsp.Pom.LoginPage;
import Org.qsp.Pom.ReportPage;
import genericmethod.BaseTest;
import genericmethod.XL;

public class test_TC05 extends BaseTest{
@Test
public void testExportPdfpage() throws InterruptedException {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 5, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 5, 1);
	String title=XL.getdata(XL_PATH, SHEET_NAME, 5, 2);
	LoginPage lp=new LoginPage(driver);
	lp.username(un);
	lp.setPassword(pw);
	lp.loginButton();
	ReportPage rp=new ReportPage(driver);
	rp.clicktimetrack();
	EnterTimeTrackPage entpage=new EnterTimeTrackPage(driver);
	entpage.verifyHomePageIsDisplayed(driver, ETO, title);
	ExportPdfpageTC05 ep=new ExportPdfpageTC05(driver);
	ep.clickViewTimeTrack();
	ep.clickexporttopdf();
	Thread.sleep(2000);
	ep.clickDownloadPdf();
	Thread.sleep(2000);
}
}
