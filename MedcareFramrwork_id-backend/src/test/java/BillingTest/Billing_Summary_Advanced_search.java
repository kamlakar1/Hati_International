package BillingTest;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Billing_Summary_Advanced_search {

	ATUTestRecorder recorder;
	public static WebDriver driver=null;

	SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
	Date date = new Date();


	@Test(priority=1)
	@Parameters({"Uesrid"})
	public void TC_01_Verify_Login(String Uesrid) throws InterruptedException, IOException 
	{

		OPDpages.Login LoginScreen=new OPDpages.Login(driver);
		LoginScreen.login_Medcare(Uesrid);

	}

	@Test(priority=2)
	public void TC_02_Billing_Summary_Advanced_search() throws InterruptedException, IOException, AWTException 

	{
		BillingPages.Billing_Summary_Advanced_search OPDBill=new BillingPages.Billing_Summary_Advanced_search(driver);
		OPDBill.Billing_Summary_Advanced_searchfunc();

	}

	@BeforeTest

	public void startBrowser() throws ATUTestRecorderException 
	{

		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(".//Videos//","Billing_Summary_Advanced_search -"+dateFormat.format(date),false);
		recorder.start();  

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");

	}
	@AfterMethod(alwaysRun=true)
	public void FailedScreenShot(ITestResult Result) throws IOException
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File(".//ScreenShotFailedTestCase//Failed_Billing_Summary_Advanced_search"+ dateFormat.format(date)));
		}
	}

	@AfterSuite
	public void afterTest() throws ATUTestRecorderException {
		driver.quit();
		recorder.stop();   
	}
}