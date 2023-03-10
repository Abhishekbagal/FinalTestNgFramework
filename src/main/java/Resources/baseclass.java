package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {
  
  public WebDriver driver;
  public Properties prop;
  
  public void driverInitilize() throws IOException {
    
    FileInputStream fs=new FileInputStream("C:\\Users\\Abhishek\\eclipse-workspace\\finalproject\\src\\main\\java\\Resources\\data.properties");
    
    prop=new Properties();
    prop.load(fs);
    
    String browsername=prop.getProperty("browser");
    
    prop.getProperty(browsername);
    
    if(browsername.equalsIgnoreCase("chrome")) {
      
      driver=new ChromeDriver();
      
    }
    else if(browsername.equalsIgnoreCase("firefox")) {
      
      driver=new FirefoxDriver();
    }
    else if(browsername.equalsIgnoreCase("Edge")) {
      
      driver=new EdgeDriver();
    }
    else {
      
      System.out.println("Please make sure you have proper driver to exicute the test cases");
    }
  }
  
  
  
  @BeforeMethod
  public void openurl() throws IOException {
    driverInitilize();
     String urlname=prop.getProperty("url");
     driver.get(urlname);
    
  }
  @AfterMethod
  
  public void close() {
    
    driver.quit();
  }
    
    
  

}