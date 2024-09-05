package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Hidden_WebElement {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 WebElement textbox = driver.findElement(By.id("displayed-text"));
		 WebElement hide = driver.findElement(By.id("hide-textbox"));
		 WebElement show = driver.findElement(By.id("show-textbox"));
		 
		 hide.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver ;
		 js.executeScript("arguments[0].value = 'aman'" , textbox);
		 show.click();
		 
		 
		 

	}

}
