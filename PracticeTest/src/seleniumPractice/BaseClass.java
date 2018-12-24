package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		Reporter.log("========Browser Session Starting=========",true);
		driver=new ChromeDriver(dc);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/");
		Thread.sleep(5000);
		Reporter.log("========Application Started==========",true);
	}

	public void waitForElement(String xPath){
		WebDriverWait wait=new WebDriverWait(driver, 30);
		//WebElement element=driver.findElement(By.xpath("+xPath+"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
	}
	
	public void takeScreenShots() throws IOException{
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("C:\\Users\\muniyal\\Ecpliseworkspace\\PracticeTest\\testScreenshots\\test1.png"));
		
	}
	
	@AfterClass
	public void closeApp(){
		driver.quit();
		Reporter.log("========Application Closed Successfully|| Browser Session Ended==========",true);
	}
	
}
