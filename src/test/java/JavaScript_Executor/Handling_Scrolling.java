package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Scrolling {

	public static void main(String[] args) throws InterruptedException   
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
	    JavascriptExecutor js = (JavascriptExecutor) driver ;
	    js.executeScript("arguments[0].scrollIntoView(false)" , driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]" )));  
	
	    }

}
