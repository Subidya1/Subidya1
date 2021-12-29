package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leafground.com/pages/Button.html");
	     driver.manage().window().maximize();
	     
	     String title = driver.getTitle();
	     
	     driver.findElement(By.id("home")).click();
	     System.out.println(driver.findElement(By.id("position")).getLocation());
		 System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		 System.out.println(driver.findElement(By.id("size")).getSize());
	}

}
