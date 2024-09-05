package Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");  // 01 Method 
		//Thread.sleep(2000);
		
		driver.getTitle();                        // 02 Method
		System.out.println(driver.getTitle());

        driver.getCurrentUrl();                    // 03 Method 
		System.out.println(driver.getCurrentUrl());
	
		String source  = driver.getPageSource();   // 04 Method
		System.out.println(source);
		
		driver.close();    // 05 Method
		  
		  
	
	
	}

}
