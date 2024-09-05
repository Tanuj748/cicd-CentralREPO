package Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Rapido {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.rapidotravels.co.in/login_page.html");
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		String s1 = driver.getPageSource();
		System.out.println(s1);
		
		driver.close();
		
     
	}

}
