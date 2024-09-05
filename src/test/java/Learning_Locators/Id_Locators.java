package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locators {

	public static void main(String[] args) 
	
	{
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://demowebshop.tricentis.com/");
		  
//		  By idLoc = By.id("newsletter-email");       // Find Element on Web PAGE 
//		  WebElement SignUp = driver.findElement(idLoc);
//		  SignUp.sendKeys("kausal4129@gmail.com");
//		  
//		  By button = By.id("newsletter-subscribe-button");
//		  WebElement w1       = driver.findElement(button);
//		  w1.click();
		  
		  
		 driver.findElement(By.id("newsletter-email")).sendKeys("abhoshek@123");
		 
		 driver.findElement(By.id("newsletter-subscribe-button")).click();
		  
		               

   }
	
}
