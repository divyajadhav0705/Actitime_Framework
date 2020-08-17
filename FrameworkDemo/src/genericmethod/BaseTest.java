package genericmethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst {
 static {
	 if(BROWSER_NAME.equalsIgnoreCase("chrome")) {
		 System.setProperty(CHROME_KEY,CHROME_VALUE);
		 
	 }
	 if(BROWSER_NAME.equalsIgnoreCase("firefox")) {
		 System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
		 
	 }
 }
 
 
 public WebDriver driver;
 
 public BaseTest() {
	PageFactory.initElements(driver, this);
}

@BeforeMethod
 public void openApp() {
	 if(BROWSER_NAME.equalsIgnoreCase("chrome")) {
		 driver=new ChromeDriver();
		 
	 }
	 
	 if(BROWSER_NAME.equalsIgnoreCase("firefox")) {
		 driver=new FirefoxDriver();
		 
	 }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	 driver.get(url);
	 }
 
@FindBy(xpath = "//input[@name='username']")
private WebElement unTB;
@FindBy(xpath="//input[@name='pwd']")
private WebElement pwTB;
@FindBy(xpath="//a[@id='loginButton']")
private WebElement loginBtn;
		
public void username(String un) {
	unTB.sendKeys(un);
	}

public void setPassword(String pw) {
	  pwTB.sendKeys(pw);
	}

public void loginButton() {
			loginBtn.click();
	}

 @AfterMethod
 public void closeApp(ITestResult testResult) throws IOException, EncryptedDocumentException, InvalidFormatException {
	 String name=testResult.getName();
	 int status=testResult.getStatus();
	 if(status==1) {
		 Reporter.log("Test"+ name + "is passed", true);
	 }
	 else {
		 Reporter.log("Test" + name + "is failed", true);
		 String path=IMGPATH + name + ".png";  //.\\screenshot\\TC_20.png
		 FWUtil.getPhoto(driver, path);
		}
	 driver.close();
	 
 }
 
}
