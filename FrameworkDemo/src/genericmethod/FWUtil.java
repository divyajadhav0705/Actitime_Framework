package genericmethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class FWUtil {
//methods for taking screenshot
	public static void getPhoto(WebDriver driver,String path) throws IOException, EncryptedDocumentException, InvalidFormatException {
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcfile=t.getScreenshotAs(OutputType.FILE);
		File destfile=new File(path);
		Files.copy(srcfile, destfile);
		FileInputStream fis=new FileInputStream(".\\data\\Book1.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet sh = w.getSheet("Sheet1");
		
	}
}
