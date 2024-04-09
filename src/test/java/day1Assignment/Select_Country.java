package day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		 WebElement CountryList = driver.findElement(By.id("country"));
		 
		 Select s = new Select(CountryList);
		 s.selectByIndex(9);
		 
		 WebElement ColorList = driver.findElement(By.id("colors"));
		 
		 Select s1 = new Select(ColorList);
		 s1.selectByIndex(0);
		 
		 

	}

}
