package Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException 
	{
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(2000);
	  /* driver.manage().window().maximize();
	   Thread.sleep(2000);
	   driver.manage().window().fullscreen();
	   Thread.sleep(2000);
	   driver.manage().window().minimize();*/
       
	   Point position = driver.manage().window().getPosition();
	   System.out.println(position);
	   System.out.println(position.getX());
	   System.out.println(position.getY());
	
	  Dimension Size = driver.manage().window().getSize();
	  System.out.println(Size);
	  System.out.println(Size.getHeight());
	  System.out.println(Size.getWidth());
     
	
	}

}
