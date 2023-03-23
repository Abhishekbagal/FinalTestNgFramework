package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.Baseclass;

public class verifyheader extends Baseclass {
	
	@Test
	
	public void header() throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		LoginPageObject lpo=new LoginPageObject(driver);
		
		System.out.println(lpo.contct().getText());
		
		lpo.addcart().click();
		
		driver.navigate().back();
		
		lpo.chekout().click();
		Thread.sleep(2000);
		lpo.continues().click();
		
		driver.close();
	}
	

}
