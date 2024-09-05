package x_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_VisibleText_contains {

	public static void main(String[] args) throws 	InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-cn9hf5l/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains (text() , 'License')]")).click();
		Thread.sleep(2000);
		
    //		driver.close();      
	//      driver.quit(); 
			
		
	}

}
