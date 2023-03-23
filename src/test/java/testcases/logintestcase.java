package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObject;
import Resources.Baseclass;
import Resources.commonmethods;
import Resources.constants;

public class logintestcase extends Baseclass {
	@Test(dataProvider="testdata")
	public void login(String username,String password) throws IOException, InterruptedException {
		
		
		
	
		//Thread.sleep(2000);
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
		
		commonmethods.handleassertion(lpo.errmsg().getText(),constants.expt,constants.message);
		
		driver.close();
		
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

//This test case was failed done by the tester there is no any exception
