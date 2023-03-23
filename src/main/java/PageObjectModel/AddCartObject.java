package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCartObject {
	
	public WebDriver driver;
	
	
    //Store the X-path of Add-Cart_object model
	private By search=By.xpath("//input[@class='form-control input-lg']");
	
	private By searchbtn=By.xpath("//button[@class='btn btn-default btn-lg']");
	
	private By Icart=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[7]");
	
	private By samcart=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[8]");
	
	private By clickcart=By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
	
	private By Itext=By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/p[2]");
	
	private By stext=By.xpath("(//p[@class='price'])[2]");
	
	private By totalvalue=By.xpath("(//td[@class='text-right'])[12]");
	
	public AddCartObject(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement searchbar() {
		return driver.findElement(search);
	}
	
	public WebElement serch() {
		return driver.findElement(searchbtn);
	}
	
	public WebElement ihponecart() {
		
		return driver.findElement(Icart);
	}
	public WebElement samsungcart() {
		return driver.findElement(samcart);
	}
	public WebElement clickoncart() {
		return driver.findElement(clickcart);
	}
	public WebElement Iphonetext() {
		return driver.findElement(Itext);
	}
	public WebElement samtext() {
		
	   return driver.findElement(stext);
	}
	public WebElement endvalue() {
		
		return driver.findElement(totalvalue);
	}
	
	
	

}
