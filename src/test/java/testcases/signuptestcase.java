package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import PageObjectModel.SignupPageObject;
import Resources.Baseclass;
import Resources.constants;

public class signuptestcase extends Baseclass{
	
	@Test
	
	public void signup() throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
	
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://naveenautomationlabs.com/opencart/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
		
		driver.close();
	}
	
	

}
