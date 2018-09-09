package Demo01_SeleniumGrid;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class Demo01_SeleniumGrid {
	RemoteWebDriver d;
	
	
  @Test
  public void f() {
	  
	  d.get("http://demowebshop.tricentis.com/");
	  d.manage().window().maximize();
	  //f method
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
	  d = new ChromeDriver();
	  
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setBrowserName("chrome");
	  dc.setPlatform(Platform.WINDOWS);
	  d = new RemoteWebDriver(new URL("http://10.206.241.232:4347/wd/hub"),dc);
	  
  }

}
