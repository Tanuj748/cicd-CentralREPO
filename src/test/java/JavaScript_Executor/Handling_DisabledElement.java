package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_DisabledElement {

	private static final Duration D = null;
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demoapp.skillrary.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 'Vaishali' ", driver.findElement(By.xpath("//input[@class='form-control']")));
		
		
		
		
		
		
		
		
		
		
		

	}

}
