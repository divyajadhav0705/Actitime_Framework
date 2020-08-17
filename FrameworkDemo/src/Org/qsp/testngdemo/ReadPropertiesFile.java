package Org.qsp.testngdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadPropertiesFile {
@Test
public void m1() throws IOException {
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(".\\src\\AnyName.properties");
	p.load(fis);
	String val=p.getProperty("Browser");
	String xlVal=p.getProperty("XL_SheetName");
	Reporter.log(val + " " + xlVal, true);
	}
}
