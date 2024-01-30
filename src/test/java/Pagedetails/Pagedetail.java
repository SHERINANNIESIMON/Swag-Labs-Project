package Pagedetails;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pagedetail {
WebDriver driver;


By username=By.xpath("/html/body/div[2]/div[1]/div/div/form/input[1]");
By password=By.xpath("/html/body/div[2]/div[1]/div/div/form/input[2]");
By login=By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]");
By atoz=By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div[3]/select");
By lowtohigh=By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div[3]/select/option[3]");
By addtocart=By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button");
By addtocart2=By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button");
By addtocart3=By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/button");
By cart=By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span");
By remove=By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/button");
By continueshopping=By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[1]");
By sh=By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[5]/div[3]/button");
By cartagain=By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span");
By checkout=By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]");
By checkoutcancel=By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/a");
By continueshopping3=By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[1]");
By shirtimage=By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[6]/div[1]/a/img");
By back1=By.xpath("/html/body/div/div[2]/div[2]/div/button");
By shirtimage2=By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[4]/div[1]/a/img");
By addtocart4=By.xpath("/html/body/div/div[2]/div[2]/div/div/div/button");
By back2=By.xpath("/html/body/div/div[2]/div[2]/div/button");

By cartsymb=By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span");
By checkout2=By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]");



By firstname=By.xpath("/html/body/div/div[2]/div[3]/div/form/div[1]/input[1]");
By lastname=By.xpath("/html/body/div/div[2]/div[3]/div/form/div[1]/input[2]");
By Zip=By.xpath("/html/body/div/div[2]/div[3]/div/form/div[1]/input[3]");
By contnue=By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input");
By finish=By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]");
By hbrgr=By.xpath("/html/body/div/div[1]/div/div[3]/div/button");
By allitem=By.xpath("/html/body/div/div[1]/div/div[2]/div[1]/nav/a[1]");
By addtocart5=By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button");
By hbrgr2=By.xpath("/html/body/div/div[1]/div/div[3]/div/button");
By resetapp=By.xpath("/html/body/div/div[1]/div/div[2]/div[1]/nav/a[4]");
By closebutton=By.xpath("/html/body/div/div[1]/div/div[2]/div[2]/div/button");
By hbrgr3=By.xpath("/html/body/div/div[1]/div/div[3]/div/button");
By logout=By.xpath("/html/body/div/div[1]/div/div[2]/div[1]/nav/a[3]");
public Pagedetail(WebDriver driver) {
	this.driver=driver;
	driver.manage().window().maximize();
	
}
public void setvalues(String standard_user,String secret_sauce)
{
	driver.findElement(username).sendKeys("standard_user");
	driver.findElement(password).sendKeys("secret_sauce");
	
}

public void login()
{
	driver.findElement(login).click();
}
public void drop()
{
	driver.findElement(atoz).click();
	driver.findElement(lowtohigh).click();
	
}
public void addtocart()
{
	driver.findElement(addtocart).click();
	driver.findElement(addtocart2).click();
	driver.findElement(addtocart3).click();
}
public void cart()
{
	driver.findElement(cart).click();
	driver.findElement(remove).click();
	
	
}
public void continueshopping()
{
	driver.findElement(continueshopping).click();
}
	public void sh1()
	{	
	driver.findElement(sh).click();
}
	public void cartagain()
	{
		driver.findElement(cartagain).click();
	}
	public void checkout()
	{
		driver.findElement(checkout).click();
	}
		public void Checkoutcancel()
		{	
	driver.findElement(checkoutcancel).click();
		}
		public void continueshopping3()
		{
	driver.findElement(continueshopping3).click();
		}
		public void shirtimg()
		{
			
	driver.findElement(shirtimage).click();
		}
		public void back1()
		{
			
	driver.findElement(back1).click();
		}
		public void shirtimage2()
		{
	driver.findElement(shirtimage2).click();
		}
		public void addtocart4()
		{
	driver.findElement(addtocart4).click();
		
		
	driver.findElement(back2).click();
	driver.findElement(cartsymb).click();
	
	
	driver.findElement(checkout2).click();
	driver.findElement(firstname).sendKeys("Sherin");
	driver.findElement(lastname).sendKeys("Simon");
	driver.findElement(Zip).sendKeys("5678");
	}
	public void continue1()
	{
	driver.findElement(contnue).click();
	}
	public void finish1()
	{
		
	
	driver.findElement(finish).click();

}
	public void hbr()
	{
		driver.findElement(hbrgr).click();
	}
	public void allitm()
	{
		driver.findElement(allitem).click();
	}
	public void addcart5()
	{
		driver.findElement(addtocart5).click();
	}
	public void hbr2()
	{
		driver.findElement(hbrgr2).click();
	}

	
	
	public void restap()
	{
		driver.findElement(resetapp).click();
		driver.findElement(closebutton).click();
	}
	
	public void hbr3()
	{
		driver.findElement(hbrgr3).click();
	}
	
	//public void abt()
	//{
		//driver.findElement(about).click();
	
	//driver.navigate.back();
	public void logout()
	{
		driver.findElement(logout).click();
	}
}	
	


