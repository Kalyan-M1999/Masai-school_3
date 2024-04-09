package session_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_andDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		
		WebElement ball = driver.findElement(By.id("draggable"));
		WebElement pass1 = driver.findElement(By.id("droppable"));
		WebElement pass2 = driver.findElement(By.id("dropzone2"));
		
		Actions as =  new Actions(driver);
		as.dragAndDrop(ball, pass2).build().perform();
//		Thread.sleep(2000);
//		as.dragAndDrop(ball, pass1).build().perform();
//
//		as.dragAndDrop(pass2, pass1).build().perform();
//	    Thread.sleep(2000);
		as.dragAndDrop(pass2, ball).build().perform();
		
		
		
		

	}

}
