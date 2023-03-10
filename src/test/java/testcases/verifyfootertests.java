package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.baseclass;

public class verifyfootertests extends baseclass {
	
	@Test
	
	public void footer() {
		
		driver.manage().window().maximize();
		
		List<WebElement>a=driver.findElements(By.xpath("//div[@class='col-sm-3']"));
		
		for(WebElement k:a) {
			
			System.out.println(k.getSize());
			System.out.println(k.getText());
			
		
		}
	}

}
