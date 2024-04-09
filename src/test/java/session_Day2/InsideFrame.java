package session_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsideFrame {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();

       // driver.switchTo().frame(1); 
        
        driver.switchTo().frame("singleframe");
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("King Kohli");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("Home")).click();

       // driver.quit();
    }
}

