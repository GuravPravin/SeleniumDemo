package Demo01_Cookies;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demo01_Cookies {
	
	WebDriver d;
  @Test
  public void f() {
	  d.get("http://demowebshop.tricentis.com/");
	  d.manage().window().maximize();
	  d.manage().deleteAllCookies();
	  
	  Cookie c = new Cookie("User","Tricentis");
	  d.manage().addCookie(c);
	  Set<Cookie> cookieDetails = d.manage().getCookies();
	  for(Cookie s:cookieDetails) {
		  System.out.println(s.getExpiry());
		  System.out.println(s.getName());
		  System.out.println(s.getDomain());
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\Desktop\\drivers\\chromedriver.exe");
		d = new ChromeDriver();
  }

}
