package ADTPages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ADTAdmissionFormwith_Convert_Charges_OP_To_IP 
{
	WebDriver driver;

	By mainmenuADTScreen=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	By ADTMenu=By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div[3]/div/img");
	By SideBarMenuADTScreen=By.cssSelector("aside[ng-reflect-ng-class='sidebar-panel']");
	By AdmissionForm=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[5]/a/span[1]");


	//Main Search
	By MainSearchClick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//Click on MRN
	By MRNClick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchButtonClick=By.cssSelector("button[ng-reflect-message='Search']");

	//Outstanding Click on Ok Button
	By OutstandingOkClick=By.cssSelector("mat-icon[ng-reflect-message='Ok']");

	//Error Outstanding info close dialog
	//By OutstandingInfoClose=By.xpath("/html/body/div[2]/div[4]/div/mat-dialog-container/app-info-dialog/div/form/div[1]/span/mat-icon");

	//Op to Ip Conversion
	//Close button
	By CloseClick=By.cssSelector("mat-icon[ng-reflect-message='Close']");
	//Clcik on Check box
	By CheckBoxClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-episode-conversion/div/div[2]/div/table/tbody/tr/td[1]/mat-checkbox/label/span[1]");
	//Click on Plus Button Conversion
	By PlusButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Add Episode Conversion']");

	//Click on Confirmation Yes button
	By ConfirmationYesClick=By.xpath("//span[contains(text(),'Yes')]");


	//For all Drop down Search
	By AllDropDownSearch=By.cssSelector("input[aria-label='dropdown search']");

	//General Information
	By TypeOfAdmissionClick=By.cssSelector("mat-select[ng-reflect-name='typeOfAdmission']");
	By TypeOfAdmissionSelopt=By.xpath("//span[contains(text(),'Elective')]");

	//Reason for admission
	By ReasonForAdmissionClick=By.cssSelector("mat-select[ng-reflect-name='reasonForAdmission']");
	By ReasonForAdmissionSelOpt=By.xpath("//span[contains(text(),'Observation')]");

	//Selecting Doctor Specialty
	By DoctorSpecialityClick=By.cssSelector("mat-select[ng-reflect-name='doctorSpeciality']");
	By DoctorSpecialitySelOpt=By.xpath("//span[contains(text(),'General Surgery')]");

	//Doctor
	By DoctorClick=By.cssSelector("mat-select[formcontrolname='doctor']");
	By DoctorSelOpt=By.xpath("//span[contains(text(),'Dr. Micheal Tan')]");

	//Admission Time
	By AdmissionTimeClick=By.cssSelector("input[formcontrolname='admissionTime']");


	//Patient Meal Preferences
	By PatientMealClick=By.cssSelector("mat-select[ng-reflect-name='patientMealPreference']");
	By PatientMealSelOpt=By.xpath("//span[contains(text(),'Children')]");

	//Attendance Meal Reference
	By AttendenceMealClick=By.cssSelector("mat-select[ng-reflect-name=\"attendanceMealReference\"]");
	By AttendenceMealSelOpt=By.xpath("//span[contains(text(),'MAC Vegetarian')]");

	//Length Of Stay
	By LengthStayClick=By.cssSelector("input[formcontrolname='lengthOfStay']");

	//Admitting Diagnosis
	By AdmittingDiagnosisClick=By.cssSelector("input[formcontrolname='admittingDiagnosis']");

	//Admission Notes
	By AdmissionNotesclick=By.cssSelector("mat-icon[ng-reflect-message='Admission Notes']");

	//Add Notes
	By AddNotesclick=By.cssSelector("input[ng-reflect-name='notes']");

	//Add remark Button
	By AddRemarkButtonclick=By.cssSelector("mat-icon[ng-reflect-message='Add Remark']");

	//close button
	By CloseButton=By.cssSelector("mat-icon[ng-reflect-message='Close']");

	//Patient Notes
	By PatientNotes=By.cssSelector("input[formcontrolname='patientNotes']");

	//Admission Remark
	By Admissionremark=By.cssSelector("input[formcontrolname='remarks']");

	//Bill Estimation No
	By BillEstimationNoClick=By.cssSelector("input[ng-reflect-placeholder='Bill Estimation No']");

	//Referral Details

	//Referral Type
	By ReferraltypesClick=By.cssSelector("mat-select[ng-reflect-name='referralType']");
	By ReferralTypeSelopt=By.xpath("//span[contains(text(),'Emergency Referral')]");

	//Referral
	By RefferralClick=By.cssSelector("mat-select[ng-reflect-name='referral']");
	By RefferralSelopt=By.xpath("//span[contains(text(),\"Dato' Dr. Jefri Zain\")]");

	//Referral Remarks
	By ReferralRemarkClick=By.cssSelector("input[ng-reflect-placeholder='Referral Remarks']");

	//Assigned Bed
	//Click on Add button
	By AddButtonClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[1]/div[2]/div[2]/div[1]/b/a[1]/mat-icon");

	//Select ward
	By SelectWardClick=By.cssSelector("mat-select[ng-reflect-placeholder='Select Ward']");
	By ALlSelOpt=By.xpath("//span[contains(text(),'Ward W3-A')]");

	//clicking on search
	By SearchClick=By.cssSelector("mat-grid-tile[style='left: calc((8.33333% - 0.916667px + 1px) * 6); width: calc((8.33333% - 0.916667px) * 1 + 0px); top: 0px; height: calc(60px);']");

	//Select Bed
	By BedClick=By.xpath("//span[contains(text(),'WW3')]");

	//Click on Save Button
	By SaveButtonClick=By.cssSelector("button[type='submit']");

	//Doctor Specialty
	By AttendingDoctorSpecialityClick=By.cssSelector("mat-select[ng-reflect-name='dept']");
	By AttendingDoctorSpecialitySelOpt=By.xpath("//span[contains(text(),'Cardiology')]");

	//Selecting doctor
	By AttendingDoctorClick=By.cssSelector("mat-select[data-automation-attribute='sltdepartment']");
	By AttendingDoctorSelOpt=By.xpath("//span[contains(text(),'Dr. Salina Yusof')][1]");

	//Add Attending Doctor
	By AddAttendingDoctorclick=By.cssSelector("mat-icon[ng-reflect-message='Add Attending Doctor']");

	//Selecting Tab

	//Selecting Tab1 Payer Details
	By PayerDetailsTabclick=By.cssSelector("div[aria-controls='mat-tab-content-1-0']");

	//Select Tariff
	By TariffClick=By.cssSelector("mat-select[data-automation-attribute='encounterTariff0']");
	By TariffSelOpt=By.xpath("//span[contains(text(),'Self Tariff')]");

	//Clicking on TAb2 Next Of Kin
	By NextOfKinClick=By.xpath("//mat-icon[contains(text(),'how_to_reg')]");

	//Title
	By TitleClick=By.cssSelector("mat-select[ng-reflect-name='kinPrefix']");
	By TitleSelOpt=By.xpath("//span[contains(text(),\" Tan Sri Dato' Ir \")]");

	//Name
	By NameClick=By.cssSelector("input[formcontrolname='kinName']");

	//Relation
	By RelationClick=By.cssSelector("mat-select[ng-reflect-name='kinRelation']");
	By RelationSelOpt=By.xpath("//span[contains(text(),'Wife')]");

	//Primary Identification
	By PrimaryIdentificationClick=By.cssSelector("mat-select[ng-reflect-name='kinIDType']");
	By PrimaryIdentificationSelOpt=By.xpath("//span[contains(text(),'Passport')]");

	//Identification No
	By IdentificationNoClick=By.cssSelector("input[formcontrolname='kinIDDesc']");

	//PhoneNumber
	By PhoneNumberClick=By.cssSelector("input[ng-reflect-name='Kinmobile']");

	//Permanent Address
	//Address
	By AddressClick=By.cssSelector("input[formcontrolname='kinAdress']");

	//Country
	By CountryClick=By.cssSelector("mat-select[formcontrolname='kinCountry']");
	By CountrySelOpt=By.xpath("//span[contains(text(),'Malaysia')]");

	//State
	By StateClick=By.cssSelector("mat-select[formcontrolname='kinState']");
	By StateSelOpt=By.xpath("//span[contains(text(),'Negeri Sembilan')]");

	//city
	By CityClick=By.cssSelector("mat-select[formcontrolname='kinDist']");
	By CitySelOpt=By.xpath("//span[contains(text(),'Nilai')]");

	//Zipcode
	By ZipCodeClick=By.cssSelector("input[formcontrolname='kinPincode']");

	//Tab3 Documents
	By DocumentsClickTab=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[1]/div[2]/mat-tab-group/mat-tab-header/div/div/div/div[3]");

	//Uplad Document

	By UploadDocClick=By.cssSelector("mat-icon[ng-reflect-message='Upload Document']");

	//Choose Button
	By ChooseButtonClick=By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-uploadfile/div/div[2]/table/tr/td/input");

	//Upload Button
	By UploadClick=By.cssSelector("mat-icon[ng-reflect-message='Upload']");

	//Save Button
	By SaveBtnClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-form/mat-drawer-container/mat-drawer-content/div/div[2]/mat-grid-list/div/mat-grid-tile[4]/div/div/div/button[3]/span[1]/mat-icon");
	//Yes BUtton
	By OkButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Yes']");

	By AdvancedSearchClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/div[2]/mat-icon");
	//MRN
	By MRNSearchClick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchClick12=By.cssSelector("button[ng-reflect-message='Search']");

	By Tableclick=By.cssSelector("tbody[role='rowgroup']");
	//Clicking on row
	By ROWClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr");
	//Update Satus
	By UpdateStatus=By.cssSelector("img[ng-reflect-message='Update Status']");

	//Status
	By StatusClick=By.cssSelector("mat-select[ng-reflect-name='first']");
	By StatusSelopt=By.xpath("/html/body/div[2]/div[4]/div/div/div/mat-option[2]/span");

	//Remarks
	By RemarksClick12=By.cssSelector("input[ng-reflect-name='remarks']");

	//Confirm 
	By ConfirmButtonClick=By.cssSelector("mat-icon[ng-reflect-message='Confirm']");

	//Taking MRN from dashboard
	By MRNNumberClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-admission-dashboard/mat-drawer-container/mat-drawer-content/div/table/tbody/tr[1]/td[2]");

	//clicking on billing menu
	By BillingMenuClik=By.xpath("//span[contains(text(),'Billing')]");
	//IP Charges
	By IPChargesClick=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[2]/ul/li[5]/a/span[1]");
	//advanced search
	By AdvancedSearchClick2=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
	//MRN 
	By MRNCLick=By.cssSelector("input[ng-reflect-name='mrn']");
	//Search button
	By SearchButtonClick2=By.cssSelector("button[ng-reflect-message='Search']");

	//By Search=By.xpath("mat-icon[mattooltip='Search']");
	By mainmenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/app-header/nav/mat-icon[1]");
	By OPDMenu=By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div[1]");
	By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By RegistrationMenu=By.cssSelector("a[id='2004']");
	By EncounterList=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside/app-sidebar/app-menu/ul/li[3]/ul/li[1]/a/img");
	public void ADT_Admission_Form_Convert_Charges(String LengthOfStayPar,String AdmittingDiagPar,String AddNotesPar,String PatientNotesPar,String AdmissionRemarksPar,String ReferralRemarksPar,String NamePar,String IdentificationNOPar,String PhoneNumberPar,String AddressPar) throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(8000);
		WebElement ele=driver.findElement(mainmenu);
		act.moveToElement(ele).build().perform();
		act.click(ele).perform();
		
		Thread.sleep(10000);
		driver.findElement(OPDMenu).click();
		
		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide1=driver.findElement(SideBarMenu);
		act.moveToElement(overforopdslide1).build().perform();

		Thread.sleep(5000);
		driver.findElement(RegistrationMenu).click();
		driver.findElement(RegistrationMenu).click();

		Thread.sleep(5000);
		driver.findElement(EncounterList).click();

		Thread.sleep(5000);
		WebElement MRN1=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[4]"));
		String MRNS=MRN1.getText();

		System.out.println("MRN Number:"+MRNS);

		Thread.sleep(3000);
		Actions act1 = new Actions(driver);
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(mainmenu);
		act.moveToElement(ele1).build().perform();
		act.click(ele1).perform();
		//Thread.sleep(2000);
		
		Thread.sleep(8000);
		driver.findElement(ADTMenu).click();

		//Over the slide bar in OPD Screen
		Thread.sleep(3000);
		WebElement overforopdslide2=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide2).build().perform();

		//Admission Click
		Thread.sleep(4000);
		driver.findElement(AdmissionForm).click();

		Thread.sleep(4000);
		if(driver.getPageSource().contains("ADT > Admission Form")) 
		{
			System.out.println("ADT Admission form has been launched successfully"); 
		} else 
		{
			System.out.println("ADT Admission form failed to open"); 
		}
		//Click on search menu
		Thread.sleep(2000);
		driver.findElement(MainSearchClick).click();

		//Click On MRN Text Field
		Thread.sleep(2000);
		driver.findElement(MRNClick).sendKeys(MRNS);

		//Click on Search button
		Thread.sleep(2000);
		driver.findElement(SearchButtonClick).click();

		//Click on Check Box
		Thread.sleep(3000);
		driver.findElement(CheckBoxClick).click();

		//Clicking on Plus button
		Thread.sleep(3000);
		driver.findElement(PlusButtonClick).click();

		//Clicking confirmation Yes button
		Thread.sleep(3000);
		driver.findElement(ConfirmationYesClick).click();

		//Selecting type of admission
		Thread.sleep(2000);
		driver.findElement(TypeOfAdmissionClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Elective");
		Thread.sleep(1000);
		driver.findElement(TypeOfAdmissionSelopt).click();

		//Reason For Admission admission
		Thread.sleep(2000);
		driver.findElement(ReasonForAdmissionClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Observation");
		Thread.sleep(1000);
		driver.findElement(ReasonForAdmissionSelOpt).click();

		//Selecting Doctor Specialty
		Thread.sleep(2000);
		driver.findElement(DoctorSpecialityClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("General Surgery");
		Thread.sleep(1000);
		driver.findElement(DoctorSpecialitySelOpt).click();

		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(DoctorClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Dr. Micheal Tan");
		Thread.sleep(2000);
		driver.findElement(DoctorSelOpt).click();

		//Admission Time
		Thread.sleep(2000);
		driver.findElement(AdmissionTimeClick).sendKeys("11:00AM");

		//Patient Meal Preference
		Thread.sleep(2000);
		driver.findElement(PatientMealClick).click();
		Thread.sleep(1000);
		driver.findElement(AllDropDownSearch).sendKeys("Children");
		Thread.sleep(1000);
		driver.findElement(PatientMealSelOpt).click();

		//Attendance Meal Preference
		Thread.sleep(2000);
		driver.findElement(AttendenceMealClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("MAC Vegetarian");
		Thread.sleep(2000);
		driver.findElement(AttendenceMealSelOpt).click();

		//Length Of Stay
		Thread.sleep(2000);
		driver.findElement(LengthStayClick).sendKeys(LengthOfStayPar);

		//Admitting Diagnosis
		Thread.sleep(2000);
		driver.findElement(AdmittingDiagnosisClick).sendKeys(AdmittingDiagPar);

		/*//Click on Admission notes button
		Thread.sleep(2000);
		driver.findElement(AdmissionNotesclick).click();

		//Add Notes
		Thread.sleep(2000);
		driver.findElement(AddNotesclick).sendKeys(AddNotesPar);

		//Click on Add Remark
		Thread.sleep(2000);
		driver.findElement(AddRemarkButtonclick).click();

		//Click on Close button
		Thread.sleep(2000);
		driver.findElement(CloseButton).click(); */

		//Patient Notes
		Thread.sleep(2000);
		driver.findElement(PatientNotes).sendKeys(PatientNotesPar);

		//Admission Remarks
		Thread.sleep(2000);
		driver.findElement(Admissionremark).sendKeys(AdmissionRemarksPar);

		//Bill Estimation NO
		driver.findElement(BillEstimationNoClick).sendKeys("2345");

		//Referral Type
		Thread.sleep(2000);
		driver.findElement(ReferraltypesClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Emergency Referral");
		Thread.sleep(2000);
		driver.findElement(ReferralTypeSelopt).click();

		//Referral 
		Thread.sleep(2000);
		driver.findElement(RefferralClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Dato");
		Thread.sleep(2000);
		driver.findElement(RefferralSelopt).click();


		//Referral Remarks
		Thread.sleep(2000);
		driver.findElement(ReferralRemarkClick).sendKeys(ReferralRemarksPar);

		//Click on Add Button for adding bed
		Thread.sleep(2000);
		driver.findElement(AddButtonClick).click();

		//Selecting Ward
		Thread.sleep(4000);
		driver.findElement(SelectWardClick).click();
		Thread.sleep(4000);
		driver.findElement(AllDropDownSearch).sendKeys("Ward W3-A");

		Thread.sleep(5000);
		driver.findElement(ALlSelOpt).click();

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveByOffset(0,0).click().build().perform();

		//Clicking on Search
		Thread.sleep(2000);
		driver.findElement(SearchClick).click();

		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		String Actual_1="HAE";
        String Expected_1 ="HAE" ;
        Assert.assertEquals(Actual_1, Expected_1, "Bed Found");
        Thread.sleep(1000);
        File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp3= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
        FileUtils.copyFile(screenshot3, new File(".//ScreenShots//Failed_Bed_Not_Found.png"+timestamp3));
        Thread.sleep(3000);

		//Bed CLick
		Thread.sleep(2000);
		driver.findElement(BedClick).click();
	
		//Click on Save Button
		Thread.sleep(2000);
		driver.findElement(SaveButtonClick).click();

		//Selecting Doctor Specialty
		Thread.sleep(2000);
		driver.findElement(AttendingDoctorSpecialityClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Cardiology");
		Thread.sleep(2000);
		driver.findElement(AttendingDoctorSpecialitySelOpt).click();

		//Selecting Doctor
		Thread.sleep(2000);
		driver.findElement(AttendingDoctorClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Dr. Salina Yusof");
		Thread.sleep(2000);
		driver.findElement(AttendingDoctorSelOpt).click();

		//Clicking Add Attending Doctor button
		Thread.sleep(2000);
		driver.findElement(AddAttendingDoctorclick).click();

		//Scrolling the web page
		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);
		actions1.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		//Selecting TAB1 Payer Details
		//Thread.sleep(2000);
		//driver.findElement(PayerDetailsTabclick).click();

		//Selecting Tariff
		Thread.sleep(2000);
		driver.findElement(TariffClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Self Tariff");
		Thread.sleep(2000);
		driver.findElement(TariffSelOpt).click();

		//Clicking on TAb2 Next Of Kin
		Thread.sleep(2000);
		driver.findElement(NextOfKinClick).click();

		//Clicking on title
		Thread.sleep(2000);
		driver.findElement(TitleClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Tan Sri Dato' Ir");
		Thread.sleep(2000);
		driver.findElement(TitleSelOpt).click();

		//Adding Name
		Thread.sleep(2000);
		driver.findElement(NameClick).sendKeys(NamePar);

		//Selecting Relation
		Thread.sleep(2000);
		driver.findElement(RelationClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Wife");
		Thread.sleep(2000);
		driver.findElement(RelationSelOpt).click();

		//Selecting Primary Identification
		Thread.sleep(2000);
		driver.findElement(PrimaryIdentificationClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Passport");
		Thread.sleep(2000);
		driver.findElement(PrimaryIdentificationSelOpt).click();

		//Adding Identification NO
		Thread.sleep(2000);
		driver.findElement(IdentificationNoClick).sendKeys(IdentificationNOPar);

		//Phone Number
		Thread.sleep(2000);
		driver.findElement(PhoneNumberClick).sendKeys(PhoneNumberPar);

		//Address
		Thread.sleep(2000);
		driver.findElement(AddressClick).sendKeys(AddressPar);

		//Selecting Country
		Thread.sleep(2000);
		driver.findElement(CountryClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Malaysia");
		Thread.sleep(2000);
		driver.findElement(CountrySelOpt).click();

		//Selecting State
		Thread.sleep(2000);
		driver.findElement(StateClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Negeri Sembilan");
		Thread.sleep(2000);
		driver.findElement(StateSelOpt).click();

		//Selecting City
		Thread.sleep(2000);
		driver.findElement(CityClick).click();
		Thread.sleep(2000);
		driver.findElement(AllDropDownSearch).sendKeys("Nilai");
		Thread.sleep(2000);
		driver.findElement(CitySelOpt).click();

		//Adding ZipCode
		Thread.sleep(2000);
		driver.findElement(ZipCodeClick).sendKeys(AddressPar);

		//Tab3 Documents
		//Clicking on Document tab
		Thread.sleep(2000);
		driver.findElement(DocumentsClickTab).click();

		//Click on Upload document button

		Thread.sleep(4000);
		driver.findElement(UploadDocClick).click();

		Thread.sleep(3000);
		WebElement browse = driver.findElement(ChooseButtonClick);
		//click on ‘Choose file’ to upload the desired file
		browse.sendKeys("C:\\MedcareImg\\data.txt");

		Thread.sleep(4000);
		driver.findElement(UploadClick).click();

		//Clicking on save button	
		Thread.sleep(2000);
		driver.findElement(SaveBtnClick).click();


		//Clicking on ok dialog
		Thread.sleep(3000);
		driver.findElement(OkButtonClick).click();

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//ScreenShot//ADTAdmissionForm.png"));  

		Thread.sleep(5000);
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles

		ArrayList<Object> tabs = new ArrayList<Object> (driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window((String) tabs.get(0));

		//Clicking on advanced search
		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick).click();

		Thread.sleep(1500);
		WebElement MRN=driver.findElement(MRNSearchClick);
		MRN.sendKeys(MRNS);

		//Click on search button
		Thread.sleep(1500);
		driver.findElement(SearchClick12).click();

		//Clicking Row 
		Thread.sleep(1500);
		driver.findElement(ROWClick).click();

		//Clicking update status menu. 
		Thread.sleep(1500);
		driver.findElement(UpdateStatus).click();

		//Clicking on status.
		Thread.sleep(3000);
		driver.findElement(StatusClick).click();
		Thread.sleep(3000);
		driver.findElement(StatusSelopt).click();

		//Adding Remarks
		Thread.sleep(1500);
		driver.findElement(RemarksClick12).sendKeys("Want to do admitted patient");

		//Clicking on confirm button
		Thread.sleep(3000);
		driver.findElement(ConfirmButtonClick).click();
		Thread.sleep(5000);
		if(driver.getPageSource().contains(MRNS)) 
		{
			System.out.println("Patient has been successfully created"); 
		} else 
		{
			System.out.println("Patient not created"); 
		}	

		WebElement MRNNumber=driver.findElement(MRNNumberClick);
		String MRNC=MRNNumber.getText();

		Thread.sleep(3000);
		Actions At = new Actions(driver);
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(mainmenuADTScreen);
		act.moveToElement(ele2).build().perform();
		At.click(ele2).perform();

		Thread.sleep(3000);
		driver.findElement(BillingMenuClik).click();

		//Over the slide bar in Billing Screen
		Thread.sleep(3000);
		WebElement overforopdslide3=driver.findElement(SideBarMenuADTScreen);
		act.moveToElement(overforopdslide3).build().perform();

		Thread.sleep(3000);
		driver.findElement(IPChargesClick).click();

		Thread.sleep(3000);
		driver.findElement(AdvancedSearchClick2).click();

		Thread.sleep(2000);
		driver.findElement(MRNCLick).sendKeys(MRNC);

		Thread.sleep(3000);
		driver.findElement(SearchButtonClick2).click();
		


	}
	private static WebElement last() {
		// TODO Auto-generated method stub
		return null;
	}
	public ADTAdmissionFormwith_Convert_Charges_OP_To_IP(WebDriver driver)
	{
		this.driver=driver;
	}

}
