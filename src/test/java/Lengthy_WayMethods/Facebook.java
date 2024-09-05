package Lengthy_WayMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		Options option = driver.manage();   // Maximize the Window
		Window win = option.window();
		win.maximize(); 
		  
	    Options option1 = driver.manage();  //Minimize the Window
		Window win1= option1.window();
		Thread.sleep(4000);
		win1.minimize();
		
		Options op = driver.manage();  // fullScreen the window  
		Window winn = op.window();
		Thread.sleep(2000);
		winn.fullscreen();
		
	   Options op1	= driver.manage();    // Fetch Positions
	   Window r1 = op1.window();
	   Point position =  r1.getPosition();
	   int x = position.getX();
	   int y = position.getY();
	   System.out.println(x);
	   System.out.println(y);
	   System.out.println(position);
	  
		
		
		
		
		
		driver.quit();
		
		
		
		
		  
	}

}
