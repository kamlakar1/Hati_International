package OPDpages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UpdateSponsorFlow {
	
	WebDriver driver=null;
	By EncounterListClick=By.xpath("//span[contains(text(),'Encounter List')]");
	//By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");
	By RegistrationMenu=By.cssSelector("a[id='2004']");
	
	By EncounterList=By.xpath("//span[contains(text(),'Encounter List')]");
	//MenuIcon 
	By Menu=By.cssSelector("mat-icon[ng-reflect-message='Menu']");
	
	//OPD Menu
		By OPDMenu=By.xpath("//*[@id='mat-menu-panel-6']/div/div/div[1]/div[1]/div[1]/div/img");
		
		//SideMenu
		By SideBarMenu=By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/ng-sidebar/aside");

		//UpdateSponsor
		
		By UpdateSponsor=By.cssSelector("a[id='2324']");
		
		//AdvanceSearch
		By Advancesearchclick=By.cssSelector("mat-icon[ng-reflect-message='Expand']");
		By MRNSearch=By.cssSelector("input[ng-reflect-name='mrn']");
		By Searchclick=By.cssSelector("button[ng-reflect-message='Search']");
		
		//SelectPatient
		By SelectPatient=By.cssSelector("mat-radio-group[ng-reflect-message='Payer Tariff']");
		
		//AddButton
		By AddButton=By.cssSelector("mat-icon[ng-reflect-message='Add Sponsor']");
		
		//PayerType
		By PayerType=By.cssSelector("mat-select[ng-reflect-name='payerType']");
		By PayertypeSearch=By.cssSelector("input[aria-label='dropdown search']");
		By PayertypeSelect=By.xpath("//span[contains(text(),'Insurance')]");
		
		//Payer
		By payerclick=By.cssSelector("mat-select[ng-reflect-name='payer']");
		By payersearch=By.cssSelector("input[aria-label='dropdown search']");
		By payerselect=By.xpath("//span[contains(text(),'AIA Berhad')]");
		
		//Tariff
		By Tariff=By.cssSelector("mat-select[ng-reflect-name='tariff']");
		By Tariffsearch=By.cssSelector("input[aria-label='dropdown search']");
		By Tariffselect=By.xpath("//span[contains(text(),'Insurance Tariff')]");
		
		//Contract
		By Contract=By.cssSelector("mat-select[ng-reflect-name='contract']");
		By ContractSearch=By.cssSelector("input[aria-label='dropdown search']");
		By Contractselect=By.xpath("//span[contains(text(),'Allianz Life Insurance Contract')]");
		
		//AssociateCompany 
		By AssociateCompany=By.cssSelector("mat-select[ng-reflect-name='AssociateCompany']");
		By AssociateCompanysearch=By.cssSelector("input[aria-label='dropdown search']");
		By AssocaiteCompanySelect=By.xpath("//span[contains(text(),' GE - OCBC Bank ')]");
		
		//PolicyNumber
		By PolicyNumber=By.cssSelector("input[formcontrolname='policyNo']");
		
		//EffectiveDate
		By EffectiveDate=By.cssSelector("input[ng-reflect-name='GLEffectiveDate']");
		
		//Save1
		By Savebutton1=By.cssSelector("mat-icon[ng-reflect-message='Save Sponsor']");
		
		//Confirmation
		By Confirmation=By.cssSelector("mat-icon[ng-reflect-message=\"Yes\"]");
		
		//Save2
		By Savebutton2=By.cssSelector("button[ng-reflect-message='Save Sponsor']");
		
		//Confirmation2 
		By Confirmation2=By.cssSelector("mat-icon[ng-reflect-message='Yes']");
		
		//AdvanceSearch2
		By Advancesearchclick2=By.cssSelector("mat-icon[ng-reflect-message='Collapse']");
		By MRNSearch2=By.cssSelector("input[ng-reflect-name='mrn']");
		By Searchclick2=By.cssSelector("button[ng-reflect-message='Search']");
		
		//ClickonRadio
		By RadioButton=By.cssSelector("mat-radio-group[ng-reflect-message='Payer Tariff']");
		
		
		public UpdateSponsorFlow (WebDriver driver)
		{
			this.driver=driver;
		}
			

  public void UpdateSponsor1(String PolicyNumberPar, String EffectivedatePar) throws InterruptedException, IOException 

  {
	
	//MenuIcon
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	
	WebElement MainMenu=driver.findElement(Menu);
	act.moveToElement(MainMenu).build().perform();
	act.click(MainMenu).perform();
	
	//OPDMenu
	  Thread.sleep(4000);
	  driver.findElement(OPDMenu).click();
	  
	//SideMenuBar
	  Thread.sleep(4000);
	  WebElement SidebarMenu=driver.findElement(SideBarMenu);
	  act.moveToElement(SidebarMenu).build().perform();
	  
	 
	  //Registration 
	  Thread.sleep(8000);
	  driver.findElement(RegistrationMenu).click();
	  driver.findElement(RegistrationMenu).click();
	  Thread.sleep(6000);
	  
	  driver.findElement(EncounterListClick).click();
	  Thread.sleep(4000);
	  
	  WebElement mrnvale=driver.findElement(By.xpath("/html/body/app-root/app-layout/ng-sidebar-container/div/div/mat-drawer-container/mat-drawer-content/div/div/app-patient-encounter-list/mat-drawer-container/mat-drawer-content/div[2]/table/tbody/tr[1]/td[4]"));
	  String val = mrnvale.getText();
	  System.out.println("print mrn" + val);
	  
		//SideMenuBar
	  Thread.sleep(4000);
	  WebElement SidebarMenu1=driver.findElement(SideBarMenu);
	  act.moveToElement(SidebarMenu1).build().perform();
	  
	//UpdateSponsor
	  Thread.sleep(4000);
	  driver.findElement(UpdateSponsor).click();
	  
	//Condition1
	  Thread.sleep(5000);
      if(driver.getPageSource().contains("No Patient Selected")) 
      {
      System.out.println("Update Sponsor Page Launch"); 
      } else 
      {
      System.out.println("Update Sponsor page failed"); 
      }
	  
    //ScreenShot
	  File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot1, new File("\\ScreenShots\\UpdateSponsor1.png"));
      
	 //AdvanceSearch 
	  Thread.sleep(3000);
	  driver.findElement(Advancesearchclick).click();
	  
	  //MRNSearch
	  Thread.sleep(3000);
	  
 
	  driver.findElement(MRNSearch).sendKeys(val);
	  
	  //Search click
	  driver.findElement(Searchclick).click();
	
	//Condition2
	  Thread.sleep(5000);
      if(driver.getPageSource().contains(val)) 
      {
      System.out.println("Patient MRN Showing on Screen"); 
      } else 
      {
      System.out.println("Patient MRN not showing on Screen"); 
      }
      
    //ScreenShot
	  File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot2, new File("\\ScreenShots\\UpdateSponsor2.png"));
      
	  //SelectPatient 
	  Thread.sleep(2000);
	  driver.findElement(SelectPatient).click();
	  
	  //AddButton
	  Thread.sleep(2000);
	  driver.findElement(AddButton).click();
	  
	//Condition3
	  Thread.sleep(5000);
      if(driver.getPageSource().contains("Add Sponsor")) 
      {
      System.out.println("Add Sponsor Window Appear"); 
      } else 
      {
      System.out.println("Add Sponsor Window Not Appear"); 
      }
	  
    //ScreenShot
	  File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot3, new File("\\ScreenShots\\UpdateSponsor3.png"));
	  
	  //PayerType
	  Thread.sleep(2000);
	  driver.findElement(PayerType).click();
	  driver.findElement(PayertypeSearch).sendKeys("Insurance");
	  driver.findElement(PayertypeSelect).click();
	  
	  //Payer
	  Thread.sleep(2000);
	  driver.findElement(payerclick).click();
	  driver.findElement(payersearch).sendKeys("AIA Berhad");
	  driver.findElement(payerselect).click();
	  
	  //Tariff
	  Thread.sleep(2000);
	  driver.findElement(Tariff).click();
	  driver.findElement(Tariffsearch).sendKeys("Insurance Tariff");
	  driver.findElement(Tariffselect).click();
	  
	  //Contract
	  Thread.sleep(2000);
	  driver.findElement(Contract).click();
	  driver.findElement(ContractSearch).sendKeys("Allianz Life Insurance Contract");
	  driver.findElement(Contractselect).click();
	  
	  //AssociateCompany 
	  Thread.sleep(2000);
	  driver.findElement(AssociateCompany).click();
	  driver.findElement(AssociateCompanysearch).sendKeys("GE - OCBC Bank");
	  driver.findElement(AssocaiteCompanySelect).click();
	  
	  //PolicyNumber
	  Thread.sleep(2000);
	  driver.findElement(PolicyNumber).sendKeys(PolicyNumberPar);
	  
	  //EffectiveDate 
	  Thread.sleep(2000);
	  driver.findElement(EffectiveDate).sendKeys(EffectivedatePar);
	  
	  //Save1
	  Thread.sleep(2000);
	  driver.findElement(Savebutton1).click();
	  
	  //Confirmation1
	  Thread.sleep(2000);
	  driver.findElement(Confirmation).click();
	
	//Condition4
	  Thread.sleep(5000);
      if(driver.getPageSource().contains("Insurance")) 
      {
      System.out.println("Insurance Payer Added Successfully"); 
      } else 
      {
      System.out.println("Insurance Payer not Added"); 
      }
      
    //ScreenShot
	  File screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot4, new File(".//ScreenShots//UpdateSponsor4.png"));
	  
	  //Save2
	  Thread.sleep(2000);
	  driver.findElement(Savebutton2).click();
	  
	  //Confirmation2
	  Thread.sleep(2000);
	  driver.findElement(Confirmation2).click();
	  
	  //Advancesearch2
	  Thread.sleep(2000);
	  driver.findElement(Advancesearchclick2).click();
	  
	  //MRNSearch2
	  Thread.sleep(2000);
	  driver.findElement(MRNSearch2).sendKeys(val);
	  
	  //SearchClick
	  Thread.sleep(2000);
	  driver.findElement(Searchclick2).click();
	
	  //Radio
	  Thread.sleep(2000);
	  driver.findElement(RadioButton).click();
	  
	//Condition5
	  Thread.sleep(5000);
      if(driver.getPageSource().contains("Insurance Tariff")) 
      {
      System.out.println("Insurance Payer Showing on Screen"); 
      } else 
      {
      System.out.println("Insurance Payer Not Showing on Screen"); 
      }
	  
	  //ScreenShot
	  File screenshot5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshot5, new File(".//ScreenShots//UpdateSponsor5.png"));
      
  }
}
