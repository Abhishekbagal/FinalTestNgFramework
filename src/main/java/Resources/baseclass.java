package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import extentManager.ExtentManager;


public class Baseclass {
  
  public static WebDriver driver;
  public Properties prop;
  
  public ExtentSparkReporter htmlReporter;   // repsosnible for look
  public ExtentReports extent; //  Resposnisble for entries
     public  ExtentTest test; // Respossible for test status pass/fail
  
  
  public void driverInitilize() throws IOException {
    
    FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
    
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
  
  @AfterMethod
  public void close() {
	  
	  //driver.quit();
  }
  
  @BeforeSuite
  public void Beforesuite() {
	  
	  ExtentManager.setup();
  }
  
  
  
  
  
 
  @AfterSuite
  public void Aftersuite() {
	  
	  ExtentManager.endReport();
	 
  }
  
  
  public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {

	  String dateFormat = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

	  TakesScreenshot ts = (TakesScreenshot) driver;

	  File source = ts.getScreenshotAs(OutputType.FILE);

	  String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateFormat + ".png";

	  File finalDestaination = new File(destination);
	  FileUtils.copyFile(source, finalDestaination);
	  
	  return destination;
  }
  
/* @BeforeMethod
  public void openUrl() throws IOException {
	   driverInitilize();
	   
	   String urlname=prop.getProperty("url");
	   driver.get(urlname);
	 
  }*/
  /*@AfterMethod
  
  public void close() {
    
   driver.quit();
  }*/
    
    
  

}