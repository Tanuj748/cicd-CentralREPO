package Implicit_Wait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Implicitly_wait_Method {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	  FileHandler.copy(Src, dest);
		 TakesScreenshot sc = (TakesScreenshot) driver;
		 
		    File Src    = sc.getScreenshotAs(OutputType.FILE);
		    File dest = new File("./screenshots/orangeHRM_SS.png");
		    
		   
		    driver.quit();
	}

}
