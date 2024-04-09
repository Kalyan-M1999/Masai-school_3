package Session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.id("checkBoxOption1")).click(); // ckick on sinle check box optin
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']")); //its used for multiple elements
//		for(int i =0; i<checkboxes.size();i++) {
//			Thread.sleep(2000);
//			checkboxes.get(i).click();
//		}
		//We can also write for loop in for each loop also below code
		for(WebElement check : checkboxes) {
			check.click();
		}
		
	}

}
