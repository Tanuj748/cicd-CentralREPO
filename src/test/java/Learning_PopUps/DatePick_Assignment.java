package Learning_PopUps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePick_Assignment {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("datepicker")).click();
        
//        String proposedMonth = "August";
//        String proposedYear = "1947";
//        
//         while (true) 
//        {
//            String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
//            String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
//            if (currentMonth.equals(proposedMonth) && currentYear.equals(proposedYear)) 
//              break; 
//            driver.findElement(By.className("ui-datepicker-prev")).click();
//        }
//
//        driver.findElement(By.xpath("//a[text()='15']")).click();
    }
}