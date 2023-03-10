package testcases;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.baseclass;

public class verifyheader extends baseclass {
	
	@Test
	
	public void header() throws InterruptedException {
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		LoginPageObject lpo=new LoginPageObject(driver);
		
		System.out.println(lpo.contct().getText());
		
		lpo.addcart().click();
		
		driver.navigate().back();
		
		lpo.chekout().click();
		Thread.sleep(2000);
		lpo.continues().click();
	}
	

}
