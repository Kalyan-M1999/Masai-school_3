package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Functionality {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement dropdowns = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropdowns);
		s.selectByIndex(2);
		//Thread.sleep(2000);
		//s.deselectByIndex(2);
		s.selectByVisibleText("Option3");
		//Thread.sleep(2000);
		//s.deselectByVisibleText("Option3");
		s.selectByValue("option1");
		

	}

}
