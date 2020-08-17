package Org.qsp.testPom;

import org.testng.annotations.Test;

import Org.qsp.Pom.ForgetPasswordPage;
import Org.qsp.Pom.LoginPage;
import genericmethod.BaseTest;
import genericmethod.XL;

public class TestForgetPasswordPage extends BaseTest {
@Test
public void m1() {
	String un=XL.getdata(XL_PATH, SHEET_NAME, 1, 0);
	LoginPage lp1=new LoginPage(driver);
	lp1.clickForgetPassword();
	ForgetPasswordPage fp=new ForgetPasswordPage(driver);
	
fp.EmailOrUserNameTBSendText(un);
fp.RequestLoginInfoBtnClick();
}
}
