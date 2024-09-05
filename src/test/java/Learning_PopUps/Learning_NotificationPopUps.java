    package Learning_PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Learning_NotificationPopUps {

	public static void main(String[] args)
	{
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disbale-notifications");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		

	}

}
