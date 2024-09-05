package Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Passport_Seva {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://passportindia.gov.in/AppOnlineProject/user/userLogin");
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		String s1 = driver.getPageSource();
		System.out.println(s1);
		
		driver.close();
		

	}

}
