package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1_LoginFunctionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login"); // First I fatch the URL
		driver.findElement(By.id("username")).sendKeys("Kalyan");// Then i input my username bu using sendKeys method
		driver.findElement(By.id("password")).sendKeys("123456789");// Then i input password
		driver.findElement(By.xpath("//button[@type='submit']")).click();// Then click on sumbit button by using click() method
        Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Fork me on GitHub']")).click();
	}

}
