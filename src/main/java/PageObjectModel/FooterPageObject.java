package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterPageObject {
	public WebDriver driver;
	
	//Stored x-path of Information in footer page
	private By about=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=information/information&information_id=4']");
	
	private By deliveryinfo=By.xpath("(//div[@class='col-sm-3']//a)[2]");
	
	private By privacy=By.xpath("(//div[@class='col-sm-3']//a)[3]");
	
	private By terms=By.xpath("(//div[@class='col-sm-3']//a)[4]");
	
	//stored x-path of customer service
	
	private By contact=By.xpath("(//div[@class='col-sm-3']//a)[5]");
	
	private By retu=By.xpath("(//div[@class='col-sm-3']//a)[6]");
	
	private By sitem=By.xpath("(//div[@class='col-sm-3']//a)[7]");
	
	//stored x-path os Extras
	
	private By brnd=By.xpath("(//div[@class='col-sm-3']//a)[8]");
	
	private By giftcert=By.xpath("(//div[@class='col-sm-3']//a)[9]");
	
	private By affi=By.xpath("(//div[@class='col-sm-3']//a)[10]");
	
	private By spe=By.xpath("(//div[@class='col-sm-3']//a)[11]");
	
    //stored x-path of my account
	
	private By myacc=By.xpath("(//div[@class='col-sm-3']//a)[12]");
	
	private By orderhis=By.xpath("(//div[@class='col-sm-3']//a)[13]");
	
	private By wishli=By.xpath("(//div[@class='col-sm-3']//a)[14]");
	
	private By news=By.xpath("(//div[@class='col-sm-3']//a)[15]");
	
			
			
	public FooterPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement aboutus() {
		return driver.findElement(about);
	}
	public WebElement deliveryinformation() {
		
		return driver.findElement(deliveryinfo);
	}
	public WebElement privacyandpolicy() {
		return driver.findElement(privacy);
	}
	public WebElement termsandcondition() {
		
		return driver.findElement(terms);
	}
	public WebElement contactus() {
		
		return driver.findElement(contact);
	}
	public WebElement returns() {
		return driver.findElement(retu);
	}
	public WebElement sitemap() {
		
		return driver.findElement(sitem);
	}
	public WebElement brands() {
		return driver.findElement(brnd);
	}
	public WebElement giftcertificates() {
		return driver.findElement(giftcert);
	}
	public WebElement affilates() {
		return driver.findElement(affi);
	}
	public WebElement specials() {
		return driver.findElement(spe);
	}
	public WebElement myaccount() {
		return driver.findElement(myacc);
	}
	public WebElement orderandhistory() {
		return driver.findElement(orderhis);
	}
	public WebElement wishlist() {
		return driver.findElement(wishli);
	}
	public WebElement newss() {
		return driver.findElement(news);
	}

}
