package week4.day1;

import java.time.Duration;
import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@type='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Flights")).click();
		
		Set<String>windowHandles = driver.getWindowHandles();
		List<String>handles = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(handles.get(1));
		String title = driver .getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
