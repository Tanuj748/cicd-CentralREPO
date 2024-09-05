package Switch_Window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_SwitchWindow_Assignment 
{

	public static void main(String[] args) 
	{
	  
      
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://www.flipkart.com/");
      
      driver.findElement(By.name("q")).sendKeys("Electric Kettle" , Keys.ENTER);
      
      driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]")).click();
      driver.findElement(By.xpath("(//a[@class='wjcEIp'])[2]")).click();
      driver.findElement(By.xpath("(//a[@class='wjcEIp'])[3]")).click();
      driver.findElement(By.xpath("(//a[@class='wjcEIp'])[4]")).click();
      
      String Parent = driver.getWindowHandle();
      Set<String> child = driver.getWindowHandles();
      
      child.remove(Parent);
      System.out.println(Parent);
      System.out.println(child);
      
      for(String ID : child)
      {
    	  driver.switchTo().window(ID);
    	  
    	  if(driver.getTitle()==ID)
    	  {
    		 
    	  }
      }
      
      
        
      
     
     
      
      
      
      
      
      
	}

}
