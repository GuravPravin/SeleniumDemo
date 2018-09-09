import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Demo01_Action {
	WebDriver d;
	
  @Test(enabled=false)
  public void f() {
	  d.get("http://demowebshop.tricentis.com/");
	  d.manage().window().maximize();
	  Actions a = new Actions(d);
	  //a.contextClick().build().perform();
	  d.findElement(By.linkText("Log in")).click();
	  WebElement email = d.findElement(By.id("Email"));
	  a.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("myname").build().perform();
  }
  
  @Test
  public void demoRobot() throws Exception {
	  Robot r = new Robot();
	  //for Pressing key
	  r.keyPress(KeyEvent.VK_WINDOWS);
	  //for releasing key
	  r.keyRelease(KeyEvent.VK_WINDOWS);
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
	//  d = new ChromeDriver();
	 // d.get("https://www.google.com/");
	 
	  
  }

}
