package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportPdfpageTC05 {

	public ExportPdfpageTC05(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='secondLevelNavigationItem preventPanelsHiding  ']/a[@class='item' and contains(.,'View Time-Track')]")
	private WebElement viewtimetrack;
	
	public void clickViewTimeTrack() {
		viewtimetrack.click();
	}
	
	@FindBy(xpath="//td[@class='generatePDF headerFooterCell activeButton cellWithBorder']")
	private WebElement exporttopdf;
	
	public void clickexporttopdf() {
		exporttopdf.click();
	}

	@FindBy(xpath="//span[@class='buttonTitle']")
	private WebElement downloadpdf;
	
	public void clickDownloadPdf() {
		downloadpdf.click();
	}
}
