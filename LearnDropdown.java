package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement eleDropDown = driver.findElement(By.id("dropdown1"));
		Select select = new Select(eleDropDown);
		select.selectByVisibleText("Appium");
		select.selectByValue("3");
		select.selectByIndex(2);
	
		
		int size = select.getOptions().size();
		select.selectByIndex(size-1);
		
		
		
	}

}
