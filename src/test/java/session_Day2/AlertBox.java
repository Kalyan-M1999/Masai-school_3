package session_Day2;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
//		driver.findElement(By.id("alertBox")).click();
//		driver.findElement(By.xpath("//button[.='Click me']")).click();
//		
//		Alert ab = driver.switchTo().alert();
//		Thread.sleep(2000);
//		ab.accept();
//		
//	   List<WebElement> Clicks = driver.findElements(By.xpath("//button[.='Click me']"));
	   
//	   for(WebElement ck : Clicks) {
//		   ck.click();
//		   
//		   Alert al = driver.switchTo().alert();
//		   Thread.sleep(2000);
//		   al.accept();
	   
	   
//	   for(int i = 0; i < Clicks.size(); i++) {
//		   Thread.sleep(2000);
//		    Clicks.get(i).click();
//		   
//		    Alert al = driver.switchTo().alert();
//		    if(i == 2) {
//		        al.sendKeys("Kalyan");
//		    }
//		    Thread.sleep(2000);
//		    al.accept();
	   
	   driver.findElement(By.id("promptBox")).click();
		Thread.sleep(2000);
			
		Alert a3 = driver.switchTo().alert();
		a3.sendKeys("KALYAN");
		Thread.sleep(2000);
		a3.accept();
		}

	   }
	


	


