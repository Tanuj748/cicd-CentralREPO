package x_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_FromVisible_Text 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//span[text() = 'Shopping]")).click();
		
	String text = driver.findElement(By.xpath("//h1[text() = 'Shopping cart']")).getText();
		
    System.out.println(text);
    
    if(text.equals("Shopping cart"))
    {
    	System.out.println("Shopping cart page is visible");
    
    } else
    	
    {
    	System.out.println("Shopping cart page is not displayed");
    }
    
    
   
	
	}
		
		

	}


