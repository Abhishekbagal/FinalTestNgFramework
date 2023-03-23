package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.MenubarPageObject;
import Resources.Baseclass;
import Resources.constants;

public class menubartestcase extends Baseclass{
	
	@Test
	
	public void menubar() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://naveenautomationlabs.com/opencart");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		MenubarPageObject mpo=new MenubarPageObject(driver);
		
		//Action clsss of desktop
		Actions a=new Actions(driver);
		WebElement s=driver.findElement(By.xpath(constants.dekstop));
		
		a.moveToElement(s).perform();
		
		mpo.showalldesktop().click();
		mpo.desktopwishlist().click();
		
		//Action class of laptop
		Actions b=new Actions(driver);
		WebElement c=driver.findElement(By.xpath(constants.laptop));
		
		b.moveToElement(c).perform();
		
		mpo.showalllaptop().click();
		mpo.laptopwishlist().click();
		
		//Action class of components
		
		Actions d=new Actions(driver);
		WebElement e=driver.findElement(By.xpath(constants.component));
		d.moveToElement(e).perform();
		
		mpo.showcompo().click();
		
		mpo.tablet().click();
		mpo.tabletwishlist().click();
		
		mpo.software().click();
		
		mpo.phoneandpads().click();
		mpo.phonewishlist().click();
		
		mpo.cameras().click();
		mpo.camerawishlist().click();
		
		//Action class of mp3 player
		
		Actions f=new Actions(driver);
		WebElement g=driver.findElement(By.xpath(constants.mp3));
		f.moveToElement(g).perform();
		
		mpo.showallmp3().click();
		mpo.mp3wishlist().click();
		
		
		driver.close();
	}

}
