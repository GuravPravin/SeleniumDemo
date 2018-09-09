package Screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Screenshot {
	WebDriver d;
	
  @Test
  public void f() throws Exception {
	  d.get("http://demowebshop.tricentis.com/");
	  d.manage().window().maximize();
	  
	  TakesScreenshot t =(TakesScreenshot)d;
	  File f = t.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("C:\\Users\\pdc2b-training.pdc2b\\eclipse-workspace\\SeleniumAdvance\\Screenshots\\scr1.png"));
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
		d = new ChromeDriver();
  }

}
