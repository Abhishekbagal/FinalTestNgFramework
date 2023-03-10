package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObject;
import Resources.baseclass;
import Resources.commonmethods;
import Resources.constants;

public class logintestcase extends baseclass {
	@Test(dataProvider="testdata")
	public void login(String username,String password) throws IOException, InterruptedException {
		
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions s=new Actions(driver);
		WebElement k=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a"));
		s.moveToElement(k).perform();
		
	
		
		Thread.sleep(2000);
		
		SignupPageObject spo=new SignupPageObject(driver);
		
		spo.account().click();
		
		LoginPageObject lpo=new LoginPageObject(driver);
		
		lpo.log().click();
		
		Thread.sleep(2000);
		lpo.username().sendKeys(username);
		Thread.sleep(2000);
		lpo.password().sendKeys(password);
		lpo.button().click();
		Thread.sleep(2000);
		
		lpo.tryfree().click();
		Thread.sleep(2000);
		lpo.backbtn().click();
		
		commonmethods.handleassertion(lpo.errmsg().getText(), constants.expt,constants.message);
		
		
		
	}
	@DataProvider
	public Object[][]testdata(){
		
		Object[][]data=new Object[2][2];
		data[0][0]=constants.username1;
		data[0][1]=constants.password1;
		data[1][0]=constants.username2;
		data[1][1]=constants.password2;
		return data;
				
	}
	
	

}
