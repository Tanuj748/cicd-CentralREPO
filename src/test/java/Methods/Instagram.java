package Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) 
	{
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.instagram.com/accounts/login/?hl=en");  //01 Method
	   
	   driver.getTitle();                                // 02 Method
	   System.out.println(driver.getTitle());
	   
	   driver.getCurrentUrl();                          // 03 Method
	   System.out.println(driver.getCurrentUrl());
	   
	    String s1  = driver.getPageSource();           // 04 Method
	    System.out.println(s1);
	    
	    
	    driver.close();                         // 05 Method
	   
	   
	   
	   

	}

}
