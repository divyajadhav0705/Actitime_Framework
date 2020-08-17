package Org.qsp.testPom;
import org.testng.annotations.Test;
import Org.qsp.Pom.EnterTimeTrackPage;
import Org.qsp.Pom.LoginPage;
import genericmethod.BaseTest;
import genericmethod.XL;

public class TestValidLogin extends BaseTest{
@Test
public void testValidLogin() {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
	String pw=XL.getdata(XL_PATH, SHEET_NAME, 1, 1);
	String title=XL.getdata(XL_PATH, SHEET_NAME, 1, 2);
	LoginPage lp=new LoginPage(driver);
	lp.username(un);
	lp.setPassword(pw);
	lp.loginButton();
	
	EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
	etp.verifyHomePageIsDisplayed(driver, ETO, title);
	
}
}
