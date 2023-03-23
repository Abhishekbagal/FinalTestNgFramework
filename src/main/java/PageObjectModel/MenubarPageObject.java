package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenubarPageObject {
	
	public WebDriver driver;
	
	
	
	private By showdekstop=By.xpath("(//div[@class='dropdown-menu']/a)[1]");
	
	private By deskwishlist=By.xpath("(//div[@class='button-group']/button)[2]");
	
	
	
	private By showlaptop=By.xpath("(//div[@class='dropdown-menu']/a)[2]");
	
	private By lapwishh=By.xpath("(//button[@type='button']/i)[7]");
	
	
	
	private By showcomp=By.xpath("(//div[@class='dropdown-menu']/a)[3]");
	
	private By tab=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a");
	
	private By soft=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[5]/a");
	
	private By phoneandpad=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a");
	
	private By  tabwish=By.xpath("(//button[@type='button']/i)[7]");
	
	private By phonewish=By.xpath("(//button[@type='button']/i)[7]");
	
	private By camera=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a");
	
	private By camwish=By.xpath("(//div[@class='button-group']/button)[2]");
	
	
	
	private By showmp3=By.xpath("(//div[@class='dropdown-menu']/a)[4]");
	
	private By mp3wish=By.xpath("(//button[@type='button']/i)[7]");
	
	public MenubarPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	
	
	
	public WebElement showalldesktop() {
		
		return driver.findElement(showdekstop);
	}
	
	public WebElement desktopwishlist() {
		
		return driver.findElement(deskwishlist);
	}
	
	
	public WebElement showalllaptop() {
		return driver.findElement(showlaptop);
	}
	public WebElement laptopwishlist() {
		return driver.findElement(lapwishh);
	}
	
	public WebElement showcompo() {
		return driver.findElement(showcomp);
	}
	public WebElement tablet() {
		return driver.findElement(tab);
		
	}
	public WebElement tabletwishlist() {
		return driver.findElement(tabwish);
	}
	public WebElement software() {
		return driver.findElement(soft);
	}
	public WebElement phoneandpads() {
		return driver.findElement(phoneandpad);
	}
	public WebElement phonewishlist() {
		return driver.findElement(phonewish);
	}
	public WebElement cameras() {
		return driver.findElement(camera);
	}
	public WebElement camerawishlist() {
		return driver.findElement(camwish);
	}
	
	public WebElement showallmp3() {
		return driver.findElement(showmp3);
	}
	public WebElement mp3wishlist() {
		return driver.findElement(mp3wish);
	}
	
	

}
