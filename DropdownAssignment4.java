package week2.day2.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAssignment4 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leafground.com/pages/Dropdown.html");
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 String title = driver.getTitle();
		 System.out.println("Title:" + title);
			
         WebElement s1 = driver.findElement(By.id("dropdown1"));
         Select sec = new Select(s1);
         sec.selectByIndex(1);

		 WebElement s2 = driver.findElement(By.name("dropdown2"));
         Select sec1 = new Select(s2);
         sec1.selectByVisibleText("Selenium");

	     WebElement s3 = driver.findElement(By.id("dropdown3"));
         Select sec2 = new Select(s3);
         sec2.selectByValue("1");

		 WebElement findElement = driver.findElement(By.xpath("//select[@class='dropdown']"));

         Select options = new Select(findElement);
			  
	     List<WebElement> options2 = options.getOptions();
			  
	     int size = options2.size();
	     System.out.println(size);
			  
         Thread.sleep(5000);
		
	     driver.findElement(By.xpath("(//div[@class='example'])[3]/select")).sendKeys("Selenium");
	     driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option")).click();

	}

}
