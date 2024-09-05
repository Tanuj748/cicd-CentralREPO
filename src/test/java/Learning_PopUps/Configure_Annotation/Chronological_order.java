package Learning_PopUps.Configure_Annotation;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chronological_order 
{


  @BeforeSuite
  public void beforesuite()
  {
	  Reporter.log("Execution Before Suite ......" , true);
  }
  
  @AfterSuite
  public void aftersuite()
  {
	  Reporter.log("Execution After Suite ......" , true);
  }

  
  @BeforeTest
  public void beforetest()
  {
	  Reporter.log("Execution Before Test ......" , true);
  }
  
  @AfterTest
  public void aftertest()
  {
	  Reporter.log("Execution After Test......" , true);
  }


  @BeforeClass
  public void beforeclass()
  {
	  Reporter.log("Execution Before Class ......" , true);
  }
  
  @AfterClass
  public void afterclass()
  {
	  Reporter.log("Execution After Class......" , true);
  }

  @BeforeMethod
  public void beforemethod()
  {
	  Reporter.log("Execution Before Method ......" , true);
  }
  
  @AfterMethod()
  public void aftermethod()
  {
	  Reporter.log("Execution After Method......" , true);
  }
  
  @Test(priority = 2)
  public void testlogin()
  {
	 Reporter.log("Testing Login Feature......" , true);  
  }
 
  @Test(priority = 1)
  public void testregister()
  {
	  Reporter.log("Testing Register Feature......" , true);
  }
}
