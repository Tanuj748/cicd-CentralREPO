package Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Quit_Method {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.quit();

	}

}
