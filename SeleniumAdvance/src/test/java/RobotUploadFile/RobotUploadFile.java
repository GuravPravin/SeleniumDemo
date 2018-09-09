package RobotUploadFile;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class RobotUploadFile {
	
	WebDriver d;
	
  @Test
  public void f() throws Exception {
	  d.get("https://www.timesjobs.com/");
	  d.manage().window().maximize();
	  d.findElement(By.id("resumeFile_basic")).click();
	  
	  Robot r = new Robot();
	  setClipboardata("C:\\Users\\pdc2b-training.pdc2b\\Desktop\\Resume\\Resume1.txt");
	  Thread.sleep(1000);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  r.keyPress(KeyEvent.VK_V);
	  
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_V);
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
		d = new ChromeDriver();
  }
  public void setClipboardata(String s) {
	  StringSelection s1 = new StringSelection(s);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
  }

}
