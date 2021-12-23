package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertandFrame {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Subidya");
		Thread.sleep(2000);
		alert.accept();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(text.contains("Subidya")==true) {
			System.out.println("The text is Subidya");
		}
			
		}
		
		
	}


