package Demo01_DataDrivenExcel;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo01_DataDrivenExcel {
	WebDriver d;
	
  @Test
  public void f() {
	  d.get("http://demowebshop.tricentis.com/");
	  d.manage().window().maximize();
	  loginPage();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
		d = new ChromeDriver();
  }
  
  public void loginPage() {
	  d.findElement(By.linkText("Log in")).click();
	  
	  d.findElement(By.id("Email")).sendKeys("myemail");
	  d.findElement(By.id("Password")).sendKeys("mypassword");
  }
  
  

}
