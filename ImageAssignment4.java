package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leafground.com/pages/Image.html");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.linkText("Click on this image to go home page")).click(); 
	     driver.findElement(By.xpath("//img[@src='../images/home.png")).click();

	     
	     
	     driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
	}

}
