package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	
	public WebDriver driver;
	
	private By contact=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[2]");
	
	//private By wishlist=By.xpath("//a[@id='wishlist-total']");
	
	private By myacc=By.xpath("(//a[@class='dropdown-toggle'])[1]");
	
	private By register=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	

	
	private By firstname=By.xpath("//input[@id='input-firstname']");
	
	private By lastname=By.xpath("//input[@id='input-lastname']");
	
	private By email=By.xpath("//input[@id='input-email']");
	
	private By telephone=By.xpath("//input[@id='input-telephone']");
	
	private By password=By.xpath("//input[@id='input-password']");
	
	private By cpass=By.xpath("//input[@id='input-confirm']");
	
	private By chbox=By.xpath("//input[@type='checkbox']");
	
	public SignupPageObject(WebDriver driver2) {
		
		this.driver=driver2;
	}
	
	public WebElement number() {
		
		return driver.findElement(contact);
	}
	
	public WebElement account() {
		
		return driver.findElement(myacc);
	}
	
	public WebElement regi() {
		
		return driver.findElement(register);
	}
	public WebElement fname() {
		
		return driver.findElement(firstname);
	}
	public WebElement lname() {
		
		return driver.findElement(lastname);
	}
	public WebElement gmail() {
		
		return driver.findElement(email);
	}
	public WebElement phone() {
		
		return driver.findElement(telephone);
	}
	public WebElement pass() {
		
		return driver.findElement(password);
	}
	public WebElement confirmpass() {
		
		return driver.findElement(cpass);
	}
	public WebElement checkbox() {
		
		return driver.findElement(chbox);
	}
	
	

}
