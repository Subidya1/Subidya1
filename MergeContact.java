package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
        
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>handles = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(handles.get(1));
	   
		driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("Subidya");
	    driver.findElement(By.xpath("//label[text()='Last name:']/following::input")).sendKeys("Pradhan");
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.linkText("Subidya")).click();
	   driver.switchTo().window(handles.get(0));
	   
	   Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	   
	   Set<String>nextwindowHandles = driver.getWindowHandles();
	   List<String>nexthandles = new ArrayList<String>(nextwindowHandles);
		
       driver.switchTo().window(nexthandles.get(1));
	   driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("Subidya");
	   driver.findElement(By.xpath("//label[text()='Last name:']/following::input")).sendKeys("Pradhan");
	   driver.findElement(By.xpath("//button[@type='button']")).click();
	   
       Thread.sleep(5000);
	   
	   driver.findElement(By.linkText("Pradhan")).click();
	   driver.switchTo().window(nexthandles.get(0));
	   
	   Thread.sleep(5000);
	   
	   driver.findElement(By.className("buttonDangerous")).click();
	   
	   Alert alert = driver.switchTo().alert();
	   alert.accept();
	   String title = driver.getTitle();
	   
	   System.out.println(title);
	   
	}


	}


