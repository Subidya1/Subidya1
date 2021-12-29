package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Tecnology");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subidya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pradhan");
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(sourceDropdown);
		
		select.selectByVisibleText("Employee");
		
		WebElement MarketCampaignDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select sel = new Select(MarketCampaignDropDown);
		
		sel.selectByVisibleText("Automobile");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Subidya");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Pradhan");
		driver.findElement(By.id("createLeadForm_salutation")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/11/84");
		driver.findElement(By.id("createLeadForm_Title")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing Team");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
		
	    WebElement PreferedCurrencyDropdown = driver.findElement(By.id("createLeadForm_currencyUomId"));
	    
		Select s1 = new Select(PreferedCurrencyDropdown);
	
		s1.selectByVisibleText("GBP - British Pound");
		
		WebElement IndustryDropdown  = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		Select s2 = new Select(IndustryDropdown);
	
		s2.selectByVisibleText("Computer Software");
	
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("700");
		
		WebElement OwnershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select s3 = new Select(OwnershipDropdown);
		
		s3.selectByVisibleText("Public Corporation");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
        driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("AB"); 
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("I am Subidya");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Learning Selenium");
		
//Contact info
	    
	    driver.findElement(By.id("createLeadForm_CountryCode")).sendKeys("1");
	    driver.findElement(By.id("createLeadForm_AreaCode")).sendKeys("E");
	    driver.findElement(By.id("createLeadForm_PhoneNumber")).sendKeys("74501450");
	    driver.findElement(By.id("createLeadForm_Extension")).sendKeys("44");
	    driver.findElement(By.id("createLeadForm_PersontoAskFor")).sendKeys("Husband");
        driver.findElement(By.id("createLeadForm_EmailAdress")).sendKeys("subidya.s.pradhan@gmail.com");
	    driver.findElement(By.id("createLeadForm_WebUrl")).sendKeys("http://github.com/Subidya1/week2.day1");
		
//Primary Address	
	    
		driver.findElement(By.id("createLeadForm_ToName")).sendKeys("Subidya Pradhan");
		driver.findElement(By.id("createLeadForm_AttentionName")).sendKeys("Subidya");
		driver.findElement(By.id("createLeadForm_Address1")).sendKeys("TownCenter");
		driver.findElement(By.id("createLeadForm_Address2")).sendKeys("Stevenage");
		driver.findElement(By.id("createLeadForm_City")).sendKeys("Stevenage");
		
		WebElement StateProvinceDropdown = driver.findElement(By.id("createLeadForm_StateProvinceGeoId"));
		
		Select s4 = new Select( StateProvinceDropdown);
		
		s4.selectByVisibleText("Illinois");
		
		driver.findElement(By.id("createLeadForm_PostalCode")).sendKeys("SG13BH");
		
		WebElement CountryDropdown = driver.findElement(By.id("createLeadForm_CountryGeoId"));
		
		Select s5  = new Select(CountryDropdown);
		
		s5.selectByVisibleText("UnitedKingdom");
		
		driver.findElement(By.id("createLeadForm_PostalCodeExtention")).sendKeys("SG13BH");
		driver.findElement(By.className("smallSubmit")).click();
		
		 String text = driver.findElement(By.id("viewLead_firstName")).getText();
	        
	        System.out.println(text);
			
    	driver.close();
		
	}

}
