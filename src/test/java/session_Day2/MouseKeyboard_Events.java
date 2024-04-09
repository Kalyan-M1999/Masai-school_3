package session_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseKeyboard_Events {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().fullscreen();
		
		WebElement MK = driver.findElement(By.linkText("Health & Beauty"));
		
		Actions a = new Actions(driver);
		
	//Actions.moveToElement(MK).build().perform();
		
	     a.moveToElement(MK).build().perform();
		

		

	}

}
