package Demo01_JavaScript;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo01_JavaScript {
	WebDriver d;
  @Test
  public void f() {
	  d.get("http://demowebshop.tricentis.com/");
	  d.manage().window().maximize();
	  
	  JavascriptExecutor j =(JavascriptExecutor)d;
	  j.executeScript("window.scroll(0,800)");
	  j.executeScript("Alert('Hello World')");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
		d = new ChromeDriver();
  }

}
