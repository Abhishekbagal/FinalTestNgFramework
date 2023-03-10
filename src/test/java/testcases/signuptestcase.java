package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.SignupPageObject;
import Resources.baseclass;
import Resources.constants;

public class signuptestcase extends baseclass{
	
	@Test
	
	public void login() throws IOException, InterruptedException {
		
		
		driver.manage().window().maximize();
		
		SignupPageObject obj=new SignupPageObject(driver);
		obj.number().getText();
		
		obj.account().click();
		obj.regi().click();
		
		Thread.sleep(2000);
		
		obj.fname().sendKeys(constants.finame);
		obj.lname().sendKeys(constants.liname);
		obj.gmail().sendKeys(constants.gmail);
		obj.phone().sendKeys(constants.telephone);
		obj.pass().sendKeys(constants.password);
		obj.confirmpass().sendKeys(constants.confirmpass);
		obj.checkbox().click();
	}
	
	

}
