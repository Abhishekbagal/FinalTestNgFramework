package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	
	private By enterusername=By.xpath("//*[@id=\"input-email\"]");
	
	private By enterpassword=By.xpath("//*[@id=\"input-password\"]");
	
	private By lbutton=By.xpath("//input[@class='btn btn-primary']");
	
	private By tryfree=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a");
	
	private By back=By.xpath("//a[@class='btn btn-default']");
	
	private By errormsg=By.xpath("//*[@id=\"account-login\"]/div[1]");
	
	private By contact=By.xpath("//*[@id=\"top-links\"]/ul/li[1]/span");
	
	private By cart=By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span");
	
	private By checkout=By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a");
	
	private By cont=By.xpath("//*[@id=\"content\"]/div/div/a");
	
	
	
	
	
	public LoginPageObject(WebDriver driver2) {
		
		this.driver=driver2;
	}
	
	public WebElement username() {
		return driver.findElement(enterpassword);
	}
	
	public WebElement password() {
		
		return driver.findElement(enterpassword);
	}
	public WebElement log() {
		
		return driver.findElement(login);
	}
	public WebElement button() {
		
		return driver.findElement(lbutton);
	}
	public WebElement tryfree() {
		
		return driver.findElement(tryfree);
	}
	public WebElement backbtn() {
		
		return driver.findElement(back);
	}
	public WebElement errmsg() {
		
		return driver.findElement(errormsg);
	}
	public WebElement contct() {
		
		return driver.findElement(contact);
	}
	public WebElement addcart() {
		return driver.findElement(cart);
	}
	public WebElement chekout() {
		
		return driver.findElement(checkout);
	}
	public WebElement continues() {
		
		return driver.findElement(cont);
	}
	
	

}
