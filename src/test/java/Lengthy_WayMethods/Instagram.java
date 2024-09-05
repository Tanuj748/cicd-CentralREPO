package Lengthy_WayMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
		Options o1 = driver.manage();
		Window w1  =  o1.window();
		Thread.sleep(2000);
		w1.maximize();
		
		Options op2 = driver.manage();
		Window w2   =  op2.window();
		Thread.sleep(2000);
		w2.minimize();
		
		
		/*Options op3 = driver.manage();
		Window w3   =  op3.window();
		Thread.sleep(2000);
		w3.fullscreen();*/
		
	   Options op4  =  driver.manage();
	   Window w4 = op4.window();
	   Point p1  =   w4.getPosition();
	   int x        = p1.getX();
	   int y = p1.getY();
	   System.out.println(x);
	   System.out.println(y);

	   driver.quit();
	
	
	}

}
