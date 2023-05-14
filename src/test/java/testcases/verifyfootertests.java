package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import PageObjectModel.FooterPageObject;
import Resources.Baseclass;

public class verifyfootertests extends Baseclass {
	
	@Test
	
	public void footer() throws InterruptedException {
		
		
		System.setProperty("webdriver.http.factory","jdk-http-client");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().window().maximize();
		
		List<WebElement>a=driver.findElements(By.xpath("//div[@class='col-sm-3']"));
		
		for(WebElement k:a) {
			
			System.out.println(k.getSize());
			System.out.println(k.getText());
			
			
		}
		
		FooterPageObject fpo=new FooterPageObject(driver);
		
		fpo.aboutus().click();
		
		Thread.sleep(2000);
		fpo.deliveryinformation().click();
		
		Thread.sleep(2000);
		fpo.privacyandpolicy().click();
		
		Thread.sleep(2000);
		fpo.termsandcondition().click();
		
		Thread.sleep(2000);
		fpo.contactus().click();
		
		Thread.sleep(2000);
		fpo.returns().click();
		
		Thread.sleep(2000);
		fpo.sitemap().click();
		
		Thread.sleep(2000);
		fpo.brands().click();
		
		Thread.sleep(2000);
		fpo.giftcertificates().click();
		
		Thread.sleep(2000);
		fpo.affilates().click();
		
		Thread.sleep(2000);
		fpo.specials().click();
		
		Thread.sleep(2000);
		fpo.myaccount().click();
		
		Thread.sleep(2000);
		fpo.orderandhistory().click();
		
		Thread.sleep(2000);
		fpo.wishlist().click();
		
		Thread.sleep(2000);
		fpo.newss().click();
		
		
		driver.close();
	}

}
