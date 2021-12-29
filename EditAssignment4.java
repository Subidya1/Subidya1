package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leafground.com/pages/Edit.html");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.id("email")).sendKeys("subidya.s.pradhan@gmail.com");
	     driver.findElement(By.xpath("//input[@value='Append ']")).clear();
	     driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Subidya", Keys.TAB);
         
	     System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
	     
	     driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	     
         WebElement disable = driver.findElement(By.xpath("//input[@disabled='true']"));
         boolean enabled = disable.isEnabled();
         System.out.println(enabled);
	     
	      
		
	}

}
