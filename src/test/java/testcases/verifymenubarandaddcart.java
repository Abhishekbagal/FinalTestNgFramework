package testcases;

import java.time.Duration;
import java.util.Arrays;

import org.testng.annotations.Test;

import PageObjectModel.AddCartObject;
import PageObjectModel.LoginPageObject;
import Resources.baseclass;

public class verifymenubarandaddcart extends baseclass {
	@Test
	
	public void menu() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.manage().window().maximize();
		 
		 AddCartObject obj=new AddCartObject(driver);
		 
		 obj.searchbar().sendKeys("Iphone");
		 
		 obj.serch().click();
		 
		 
		 
		 obj.Iphonetext().getText();
		 
		 String Iphone=obj.Iphonetext().getText();
		 
		 System.out.println(Iphone);//$123.20  Ex Tax: $101.00
		
		 
		 String[]price=Iphone.split("\\s+");
		 
		 
		 System.out.println(Arrays.toString(price));//[$123.20, Ex, Tax:, $101.00]
		 
		 String array=price[0];
		 
		 System.out.println(array);//$123.20
		
		 
		 String replace=array.replaceAll("[$,]","");
		 
		 
		 System.out.println(replace);
		 
		 
		 
		 double d1=Double.parseDouble(replace);
		
		 System.out.println(d1);//123.2
		 
		
		 obj.ihponecart().click();
		 
		 obj.searchbar().clear();
		 
		 
		 
		 obj.searchbar().sendKeys("samsung");
		 
		 obj.serch().click();
		 
		
		 
		 String samsung=obj.samtext().getText();
		 
		 System.out.println(samsung);//$241.99  Ex Tax: $199.99
		 
		 String []sprice=samsung.split("\\s+");
		
		 
		 System.out.println(Arrays.toString(sprice));//[$241.99, Ex, Tax:, $199.99]
		 
		 
		 
		 String change=sprice[0];
		 Thread.sleep(2000);
		 System.out.println(change);
		 Thread.sleep(2000);
		 
		 String remove=change.replaceAll("[$,]","");
		 
		
		 System.out.println(remove);
		
		 
		 double d2=Double.parseDouble(remove);
		
		 System.out.println(d2);
		 
		 Thread.sleep(4000);
		 obj.samsungcart().click();
		 Thread.sleep(4000);
		 
		 obj.clickoncart().click();
		 double d=d1+d2;
		 
		
		 
		 String fprice=obj.endvalue().getText();
		 
		 System.out.println(fprice);
		 
		 String deletedollar=fprice.replaceAll("[$,]","");
		 
		 System.out.println(deletedollar);
		
		 double d3=Double.parseDouble(deletedollar);
		
		 System.out.println(d3);
		 
		 
		 if(d==d3) {
			 
			 System.out.println("Total is matching");
		 }
		 
		 
		
		 
		
		 
		 
		 
		 
		
		
	}

}
