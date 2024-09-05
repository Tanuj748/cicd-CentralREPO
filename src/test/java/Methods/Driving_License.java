package Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driving_License {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parivahan.gov.in/parivahan//en/user/login");
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		String s1 = driver.getPageSource();
		System.out.println(s1);
		
		driver.close();

	}

}
