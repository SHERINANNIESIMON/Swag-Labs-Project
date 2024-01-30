package Testdetails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Pagedetails.Pagedetail;

public class Test1 {
	WebDriver driver;
	String baseurl1="https://www.saucedemo.com/v1/";

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void url()
{
	driver.get(baseurl1);
}
@SuppressWarnings("deprecation")
@Test
public void testactivity() throws InterruptedException
{
	
	Pagedetail ob=new Pagedetail(driver);
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS) ;
	ob.setvalues("standard_user", "secret_sauce");
	Thread.sleep(4000);
	ob.login();
	Thread.sleep(4000);
	ob.drop();
	Thread.sleep(4000);
	ob.addtocart();
	
	ob.cart();
	Thread.sleep(4000);
	ob.continueshopping();
	Thread.sleep(4000);
	ob.sh1();
	Thread.sleep(4000);
	ob.cartagain();
	Thread.sleep(4000);
	ob.checkout();
	Thread.sleep(4000);
	ob.Checkoutcancel();
	Thread.sleep(4000);
	ob.continueshopping3();
	
	Thread.sleep(4000);
	ob.shirtimg();
	Thread.sleep(4000);
	ob.back1();
	Thread.sleep(2000);
	ob.shirtimage2();
	Thread.sleep(2000);
	ob.addtocart4();
	Thread.sleep(2000);
	ob.continue1();
	Thread.sleep(2000);
	ob.finish1();
	Thread.sleep(2000);
	ob.hbr();
	Thread.sleep(2000);
	ob.allitm();
	Thread.sleep(2000);
	ob.addcart5();
	Thread.sleep(2000);
	ob.hbr2();
	Thread.sleep(2000);
	
	ob.restap();
	Thread.sleep(2000);
	ob.hbr3();
	Thread.sleep(2000);
	
	//ob.abt();
	//Thread.sleep(2000);
	ob.logout();
}
}
	
	

	
