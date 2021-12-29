package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LoginAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriverManager.chromedriver().setup();
		System.out.println("WebDriver.chrome.driver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("DecorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contacts")).click();
		
	    driver.findElement(By.id("Create LeadForm_FirstName")).sendKeys("Subidya");
		driver.findElement(By.id("Create LeadForm_LastName")).sendKeys("Pradhan"); 

		driver.findElement(By.name("SubmitButton")).click(); 
		
		System.out.println("firstname");
		 
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
