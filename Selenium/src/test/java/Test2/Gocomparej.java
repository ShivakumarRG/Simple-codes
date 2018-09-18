package Test2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gocomparej 
{
	
	WebDriver driver;
	
	
	@BeforeTest
	public void Preequisite()
	{
		driver=Driverutility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://test.gocompare.biz/");
	}
	
	@Test(priority=1)
	public void Gocopage1() 
	{
				
		driver.findElement(By.xpath("(//img[@alt='Get Quotes'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='postcode-entry small']")).sendKeys("N111PA");
		driver.findElement(By.xpath("//a[@class='address-search address-search-layout lookup-button']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='multi-select-list address-list with-distinctive-items']/li"));
		for (int i=1; i<=list.size(); i++)
		{
			String a="1 Tash Place, LONDON, N11 1PA";
			if(a.equals("1 Tash Place, LONDON, N11 1PA"))
			{
				driver.findElement(By.xpath("//a[text()='1 Tash Place, LONDON, N11 1PA']")).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//span[contains(text(),'I Own')]")).click();;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'With a mortgage')]")).click();;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//span[contains(text(),'Buildings and contents cover')]")).click();;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='HomeNewCustomerViewModel_FirstName']")).sendKeys("Peters");
		driver.findElement(By.xpath("//input[@id='HomeNewCustomerViewModel_Surname']")).sendKeys("Lanteran");;
		
		driver.findElement(By.xpath("//input[@id='HomeNewCustomerViewModel_EmailAddress']")).sendKeys("xyz1sca423523asca@uk.rsagroup.com");
		driver.findElement(By.xpath("//input[@id='HomeNewCustomerViewModel_DateOfBirth_Day']")).sendKeys("23");
		driver.findElement(By.xpath("//input[@id='HomeNewCustomerViewModel_DateOfBirth_Month']")).sendKeys("03");
		driver.findElement(By.xpath("//input[@id='HomeNewCustomerViewModel_DateOfBirth_Year']")).sendKeys("1983");
		
		driver.findElement(By.xpath("//span[contains(text(),'No')]")).click();;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@id='continue-button']")).click();
		
		Assert.assertTrue(driver.getTitle().contains("home insurance [quote details]"));
		
		}
	
	@Test(priority=2)
    public void Gocopage2() throws InterruptedException

	{
		driver.findElement(By.xpath("//input[@id='PropertyInsuredViewModel_DateOfPurchase_Month']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@id='PropertyInsuredViewModel_DateOfPurchase_Year']")).sendKeys("1992");
		
		WebElement Res = driver.findElement(By.xpath("//select[@id='PropertyInsuredViewModel_PropertyMainResidence']"));
		Select sel = new Select(Res);
		Thread.sleep(100);
		sel.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//span[contains(text(),'House')]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement Prop = driver.findElement(By.xpath("//select[@id='PropertyInsuredViewModel_PropertyTypeDescription']"));
		Select sel1 = new Select(Prop);
		Thread.sleep(100);
		sel1.selectByVisibleText("Detached house");
		
		driver.findElement(By.xpath("//label[@for='PropertyInsuredViewModel_ListedBuilding_No']/span/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyInsuredViewModel_NumberOfKitchens_1']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyInsuredViewModel_NumberOfBathrooms_1']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyInsuredViewModel_NumberOfBedrooms_2']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyInsuredViewModel_NumberOfOtherRooms_1']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyInsuredViewModel_HasCentralHeating_false']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyInsuredViewModel_HasGarageOrOutbuilding_false']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyInsuredViewModel_IsPropertyForSale_false']/span")).click();
		
		driver.findElement(By.xpath("//input[@id='PropertyConstructionViewModel_PropertyBuilt']")).sendKeys("1992");
		
		driver.findElement(By.xpath("//label[@for='PropertyConstructionViewModel_PopularWallConstruction_Brick']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyConstructionViewModel_PopularRoofType_Tile']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyConstructionViewModel_AnyOfTheRoofFlat_false']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyConstructionViewModel_PropertyExtended_false']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyConstructionViewModel_UndergoingBuildingWorkOrRenovation_false']/span")).click();
		driver.findElement(By.xpath("//label[@for='PropertyConstructionViewModel_GoodStateOfRepair_true']/span")).click();
		driver.findElement(By.xpath("//a[@id='continue-button']")).click();
		
		Assert.assertTrue(driver.getTitle().contains("home insurance [property details]"));
		}
	@Test(priority=3)
	public void Gocopage3() throws InterruptedException
		{
		driver.findElement(By.xpath("//span[contains(text(),'Over 400 metres')]")).click();;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='PropertySurroundingsViewModel_FloodedByOutsideSource_false']")).click();
		driver.findElement(By.xpath("//input[@id='PropertySurroundingsViewModel_AffectedBySubsidence_false']")).click();
		driver.findElement(By.xpath("//input[@id='SafetyAndSecurityViewModel_FittedWithSmokeAlarms_false']")).click();
		driver.findElement(By.xpath("//Span[@class='button-image multi-point-locking-system']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@for='SafetyAndSecurityViewModel_HasPatioSlidingFrenchDoors_false']")).click();
		driver.findElement(By.xpath("//label[@for='SafetyAndSecurityViewModel_HasAdditionalExternalDoors_false']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Yes – all have locks')]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@for='SafetyAndSecurityViewModel_DoesPropertyHaveAlarmSystemInstalled_false']")).click();
		driver.findElement(By.xpath("//label[@for='SafetyAndSecurityViewModel_DoesPropertyHaveAlarmSystemInstalled_false']")).click();
		driver.findElement(By.xpath("//label[@for='SafetyAndSecurityViewModel_IsNeighbourhoodWatchSchemeMember_false']")).click();
		WebElement Prop = driver.findElement(By.xpath("//select[@id='LivingInAndUsingThePropertyViewModel_PropertyOccupiedByID']"));
		Select sel1 = new Select(Prop);
		Thread.sleep(100);
		sel1.selectByVisibleText("Policyholder and immediate family");
		driver.findElement(By.xpath("//label[@for='LivingInAndUsingThePropertyViewModel_NumberOfAdults_3']")).click();		
		driver.findElement(By.xpath("//label[@for='LivingInAndUsingThePropertyViewModel_NumberOfChildren_2']")).click();		
		driver.findElement(By.xpath("//label[@for='LivingInAndUsingThePropertyViewModel_DoesAnyOccupantSmoke_false']")).click();		
		WebElement pet = driver.findElement(By.xpath("//select[@id='LivingInAndUsingThePropertyViewModel_AnyCatsAndDogsID']"));
		Select sel2 = new Select(pet);
		Thread.sleep(100);
		sel2.selectByVisibleText("No");
		driver.findElement(By.xpath("//label[@for='LivingInAndUsingThePropertyViewModel_PropertyUnoccupiedStatusID_Occupied_br___day_and_night']")).click();		
		driver.findElement(By.xpath("//label[@for='LivingInAndUsingThePropertyViewModel_PropertyUnoccupiedForMoreThan30Days_false']")).click();
		driver.findElement(By.xpath("//label[@for='LivingInAndUsingThePropertyViewModel_UsedForBusinessPurposes_false']")).click();
		driver.findElement(By.xpath("//a[@id='continue-button']")).click();
		Assert.assertTrue(driver.getTitle().contains("home insurance [policyholder details]"));
		}
	
	@Test(priority=4)
	public void Gocompare4() throws InterruptedException
		{
		WebElement tl = driver.findElement(By.xpath("//select[@id='AboutYouViewModel_ProposerTitle']"));
		Select sel3 = new Select(tl);
		Thread.sleep(100);
		sel3.selectByVisibleText("Mr");		
		WebElement maritial = driver.findElement(By.xpath("//select[@id='AboutYouViewModel_MaritalStatus']"));
		Select sel4 = new Select(maritial);
		Thread.sleep(100);
		sel4.selectByVisibleText("Single");
		driver.findElement(By.xpath("//label[@for='AboutYouViewModel_HowLongInUK_NoDateSet']")).click();
		driver.findElement(By.xpath("//label[@for='AboutYouViewModel_PostalAddressSameAsInsuredAddress_true']")).click();
		driver.findElement(By.xpath("//input[@id='AboutYouViewModel_MainTelephoneNumber']")).sendKeys("07076744676");		
		WebElement advert = driver.findElement(By.xpath("//select[@id='AboutYouViewModel_WhereDidYouHearAboutUsID']"));
		Select sel5 = new Select(advert);
		Thread.sleep(100);
		sel5.selectByVisibleText("Newspaper or magazine");
		driver.findElement(By.xpath("//label[@for='AboutYouViewModel_FullTimeOccupationGroup_PopularFullTimeEmploymentStatusID_Employed']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='AboutYouViewModel_FullTimeOccupationGroup_FullTimeOccupation_Occupation']")).sendKeys("accounts clerk");
		
		driver.findElement(By.xpath("//input[@id='AboutYouViewModel_FullTimeOccupationGroup_FullTimeOccupation_Business']")).sendKeys("agricultural engineer");
		
		driver.findElement(By.xpath("//label[@for='AboutYouViewModel_PartTimeOccupationGroup_AnyPartTimeEmployment_false']")).click();
		driver.findElement(By.xpath("//label[@for='JointApplicantViewModel_IsJointApplicantRequired_false']")).click();
		driver.findElement(By.xpath("//label[@for='ClaimsConvictionsDeclarationsViewModel_HasClaimedInTheLast5Years_false']")).click();
		driver.findElement(By.xpath("//label[@for='ClaimsConvictionsDeclarationsViewModel_HasUnspentCriminalConvictions_false']")).click();
		driver.findElement(By.xpath("//label[@for='ClaimsConvictionsDeclarationsViewModel_HasBeenDeclaredBankrupt_false']")).click();
		driver.findElement(By.xpath("//label[@for='ClaimsConvictionsDeclarationsViewModel_HadInsuranceDeclinedOrSpecialTermsImposed_false']")).click();
		driver.findElement(By.xpath("//a[@id='continue-button']")).click();
		
		}
	@Test(priority=5)
	public void Gocompare5() throws InterruptedException
		{
			
			
			driver.findElement(By.xpath("//a[@class='calendar-day-button today']")).click();
			driver.findElement(By.xpath("//label[@for='CoverDetailsViewModel_CustomerPreferences_SelectedPreferences[0]_GrantedState_False']")).click();;
			driver.findElement(By.xpath("//label[@for='CoverDetailsViewModel_PaymentType_Annually']")).click();
			driver.findElement(By.xpath("//input[@id='BuildingsCoverViewModel_EstimatedMarketValue']")).sendKeys("170000");
			driver.findElement(By.xpath("//input[@name='BuildingsCoverViewModel.PropertyRebuildCost']")).sendKeys("160000");
			driver.findElement(By.xpath("//label[@for='BuildingsCoverViewModel_AccidentalDamageCover_false']")).click();
			WebElement claim = driver.findElement(By.xpath("//select[@id='BuildingsCoverViewModel_NoYearsClaimFree']"));
			Select sel6 = new Select(claim);
			Thread.sleep(100);
			sel6.selectByVisibleText("1 year");
			driver.findElement(By.xpath("//label[@for='BuildingsCoverViewModel_VoluntaryExcess_None']")).click();
			driver.findElement(By.xpath("//input[@id='ContentsCoverViewModel_TotalContentCost']")).sendKeys("30000");
			driver.findElement(By.xpath("//label[@for='ContentsCoverViewModel_CoverAwayFromHomeRequiredForBicycles_false']")).click();
			
			driver.findElement(By.xpath("//label[@for='ContentsCoverViewModel_CoverAwayFromHomeRequiredForLaptops_false']")).click();
			
			driver.findElement(By.xpath("//label[@for='ContentsCoverViewModel_CoverForIndividualItemsRequired_false']")).click();
			
			driver.findElement(By.xpath("//label[@for='ContentsCoverViewModel_PopularTotalPersonalPossessionsCover_Not_required']")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//label[@for='ContentsCoverViewModel_ContentsAccidentalDamageCoverRequired_false']")).click();
			
			WebElement NCB = driver.findElement(By.xpath("//select[@id='ContentsCoverViewModel_NoYearsClaimFree']"));
			Select sel7 = new Select(NCB);
			Thread.sleep(100);
			sel7.selectByVisibleText("1 year");
			
			driver.findElement(By.xpath("//label[@for='ContentsCoverViewModel_VoluntaryExcess_None']")).click();
			driver.findElement(By.xpath("//label[@for='GetTheRightCoverViewModel_HappyToBeContacted_false']")).click();
			driver.findElement(By.xpath("//input[@id='SecurityDetailsViewModel_Password']")).sendKeys("Welcome123!");
			driver.findElement(By.xpath("//input[@id='SecurityDetailsViewModel_PasswordConfirmation']")).sendKeys("Welcome123!");
			
			driver.findElement(By.xpath("//input[@id='SecurityDetailsViewModel_PasswordClue']")).sendKeys("vbaks");
			
			driver.findElement(By.xpath("//input[@id='SecurityDetailsViewModel_MothersMaidenName']")).sendKeys("clerk123");
			/*driver.findElement(By.xpath("//a[@class='continue-button has-loading-placeholder']")).click();*/
			
		}
	
	}
	
	
	
		
	
	
	
	

