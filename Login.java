package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Login {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
System.out.println("WebDriver.chrome.driver");
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);

driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("DecorativeSubmit")).click();

driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();

driver.findElement(By.id("Create LeadForm_CompanyName")).sendKeys("TestLeaf");
driver.findElement(By.id("Create LeadForm_FirstName")).sendKeys("Subidya");
driver.findElement(By.id("Create LeadForm_LastName")).sendKeys("Pradhan"); 

WebElement ele = driver.findElement(By.id("CreateLeadForm_datasourceId"));
Select dd = new Select(ele);
dd.selectByVisibleText("Employee");

driver.findElement(By.name("SubmitButton")).click();

String title1 = driver.getTitle();
System.out.println(title1);


	}



	private static String linkText(String string) {
		// TODO Auto-generated method stub
		

		return null;
	}
	

}
