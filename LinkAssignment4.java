package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leafground.com/pages/Link.html");
	     driver.manage().window().maximize();
	     
	     String title = driver.getTitle();
	     System.out.println("The Title is:" +title);
	     driver.findElement(By.linkText("Go to Home Page")).click();
		 System.out.println("The link is :" +driver.getCurrentUrl());
		 System.out.println("Verification:" + driver.findElement(By.linkText("Verify am I broken?")).isEnabled());
			 
	     
	}

}
