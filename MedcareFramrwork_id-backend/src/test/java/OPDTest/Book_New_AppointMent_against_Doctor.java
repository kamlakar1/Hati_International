package OPDTest;
import org.testng.annotations.Test;

import OPDpages.Book_NewAppointMent_against_doctor;
import OPDpages.BookedNewAppointment;
import OPDpages.Employeedetails;
import OPDpages.ExistingAppointment;
import OPDpages.Medcare_Registeration;
import OPDpages.NewAppointMent;
import OPDpages.New_Appointment_Encounterr;
import OPDpages.OPD_Registration_Encounter;
import OPDpages.OPD_Registration_Encounterr;
import OPDpages.arrivedAppointment;
import OPDpages.fillbasicinfopostapponitment;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
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
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Book_New_AppointMent_against_Doctor {


	 WebDriver driver;
	ATUTestRecorder recorder;

	


	@Test(priority=1)
	@Parameters({"Uesrid"})
	public void TC_01_Verify_that_user_is_able_to_login_the_application(String Uesrid) throws InterruptedException, IOException {
		Medcare_Registeration medcare = new Medcare_Registeration(driver);
		medcare.login(Uesrid);
		//Thread.sleep(5000);

	}
	@Test(priority=2)
	@Parameters({"AppointmenttypeA","consultationA","specialityA","passportA","PrimeryIDNumberA","ExpiryDateA","TitleoptA","GendesendA","dateOfBirthA","addressA","countryPrimaryA","stateA","CityA","postA","CountryCodeA","AreaA","mobileNumberA","workcontactnoA","homecontactnoA","emailA"})
	public void TC_02_Verify_that_user_is_able_to_book_the_New_appointment(String AppointmenttypeA,String consultationA,String specialityA,String passportA,String PrimeryIDNumberA,String ExpiryDateA,String TitleoptA,String GendesendA,String dateOfBirthA,String addressA,String countryPrimaryA,String stateA,String CityA,String postA,String CountryCodeA,String AreaA,String mobileNumberA,String workcontactnoA,String homecontactnoA,String emailA)throws InterruptedException, AWTException {
		Book_NewAppointMent_against_doctor BookNewAppointment = new Book_NewAppointMent_against_doctor(driver);
		BookNewAppointment.NewAppontmetfunc(AppointmenttypeA,consultationA,specialityA,passportA,PrimeryIDNumberA,ExpiryDateA,TitleoptA,GendesendA,dateOfBirthA,addressA,countryPrimaryA,stateA,CityA,postA,CountryCodeA,AreaA,mobileNumberA,workcontactnoA,homecontactnoA,emailA);

	}
	@Test(priority=3)
	@Parameters({"issuedCountryPrimaryA", "secondaryIdA", "secondaryNumberA","genderrA","martialA", "religionA", "patientCategoryA", "preferredLanguageA","nationA","nation1A", "motherNameA", "educationA", "occupationA","raceA","ethnicA","birthplaceA","bloodGroupA","sourceTypeA","employmentStatusA","patientNotesA","contactRelationA","CorrespondenceA","personalFaxA","workFaxA","subDistrictSecondaryA","PostcodeA"}) 
	public void TC_03_Verify_that_user_is_able_to_redirect_to_the_registeration_page_and_fill_the_details_successfully(String issuedCountryPrimaryA, String secondaryIdA, String secondaryNumberA,String genderrA,String martialA, String religionA, String patientCategoryA, String preferredLanguageA,String nationA,String nation1A, String motherNameA, String educationA, String occupationA,String raceA,String ethnicA,String birthplaceA,String bloodGroupA,String sourceTypeA,String employmentStatusA,String patientNotesA,String contactRelationA,String CorrespondenceA,String personalFaxA,String workFaxA,String subDistrictSecondaryA,String PostcodeA)throws InterruptedException, AWTException, IOException { 
		OPDpages.fillbasicinfopostapponitment appointmentt = new OPDpages.fillbasicinfopostapponitment(driver);
		appointmentt.fillbasicinfopostapponitmentfun(issuedCountryPrimaryA,  secondaryIdA,  secondaryNumberA,genderrA, martialA,  religionA,  patientCategoryA,  preferredLanguageA, nationA, nation1A,  motherNameA,  educationA,  occupationA,raceA, ethnicA, birthplaceA, bloodGroupA, sourceTypeA, employmentStatusA, patientNotesA, contactRelationA, CorrespondenceA, personalFaxA, workFaxA, subDistrictSecondaryA, PostcodeA);

	}
	@Test(priority=4)
	@Parameters({"employmentNoB","workingFromB","employmentContactNoB","ResidentialB","Residential1B","employmentCountryB","employmentStateB","employmentCityB","employmentPostCodeB"})
	public void TC_04_Verify_that_user_is_able_to_fill_the_emp_details_successfully(String employmentNoB,String workingFromB,String employmentContactNoB,String ResidentialB,String Residential1B,String employmentCountryB,String employmentStateB,String employmentCityB,String employmentPostCodeB) throws InterruptedException, AWTException, IOException{ 
		OPDpages.Employeedetails emp = new OPDpages.Employeedetails(driver);
		emp.empdetailsfun(employmentNoB, workingFromB, employmentContactNoB, ResidentialB, Residential1B, employmentCountryB, employmentStateB, employmentCityB, employmentPostCodeB);

	}

	@Test(priority=5) 
	@Parameters({"EncounterRemarksPar","AddNotesPar","NamePar","IdentificationNOPar","PhoneNoPar","AddressPar","PostcodeParAdetailsPar"}) 
	public void TC_05_Verify_that_user_is_able_to_redirect_to_the_encounter_page_and_fill_the_details(String EncounterRemarksPar,String AddNotesPar,String NamePar,String IdentificationNOPar,String PhoneNoPar,String AddressPar,String PostcodeParAdetailsPar)throws InterruptedException, AWTException, IOException { 
		New_Appointment_Encounterr encounterr = new  New_Appointment_Encounterr(driver);
		encounterr.Encounter(EncounterRemarksPar,AddNotesPar, NamePar,IdentificationNOPar,PhoneNoPar,AddressPar,PostcodeParAdetailsPar);
		//Thread.sleep();
	}

	@Test(priority=6) 
	public void TC_06_Verify_that_appointment_is_arrived_successfully() throws InterruptedException, AWTException, IOException { 
		OPDpages.arrivedAppointment appointmentt = new arrivedAppointment(driver);
		appointmentt.Appointmentarrivedfunc();

	}


	@BeforeTest 
	public void beforeTest() throws InterruptedException, ATUTestRecorderException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		recorder = new ATUTestRecorder(".//Videos//","Book_New_AppointMent_against_Doctor -"+dateFormat.format(date),false);
		recorder.start();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://medcare-productqa.hatiintl.com/");
		driver.manage().window().maximize(); Thread.sleep(8000);
	}

	@AfterSuite
	public void afterTest() throws ATUTestRecorderException { 
		//driver =new ChromeDriver();
		driver.quit();
		recorder.stop();
	}

}
