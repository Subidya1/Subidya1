package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		alert.sendKeys("Selenium");
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	
		
	}

}
