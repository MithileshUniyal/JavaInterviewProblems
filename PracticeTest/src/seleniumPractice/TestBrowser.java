package seleniumPractice;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestBrowser {
	
	WebDriver driver= new ChromeDriver();
	
	@Test(enabled=false)
	public void testBrowser() throws InterruptedException, IOException{
	{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\muniyal\\Ecpliseworkspace\\PracticeTest\\chromedriver.exe");	
		driver.get("Http://Newtours.Demoaut.Com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    /*WebElement userName=driver.findElement(By.xpath("//input[@name='userName']"));
	    userName.sendKeys("admin");
	    WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	    password.sendKeys("admin123");
	   driver.findElement(By.xpath("//input[@name='login']")).click();
	    assertEquals("Sign-on: Mercury Tours", driver.getTitle());*/
	    //takeScreenshots...
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("C:\\Users\\muniyal\\Ecpliseworkspace\\PracticeTest\\testScreenshots\\test.png"));
	    Thread.sleep(3000);
	    
	 
	    driver.findElement(By.xpath("//a[contains(text(),'Cruises')]")).click();
List<WebElement> list=driver.findElements(By.xpath(" //table/tbody/..//span[contains(text(),'Cruise Itinerary')]/../../../tr"));	    
System.out.println(list.size());
		driver.close();
	}

}
	@Test(enabled=true)
	public void alertHandling() throws InterruptedException{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\muniyal\\Ecpliseworkspace\\PracticeTest\\chromedriver.exe");	
		driver.get("https://www.seleniumeasy.com/test/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),' Start Practising ')]")).click();
		
		//using Explicit wait
		WebDriverWait wdWait=new WebDriverWait(driver, 60);
		wdWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Javascript Alerts')]"))));
		
		driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Javascript Alerts')]")).click();
		Thread.sleep(2000);
		
		//Click on OK button of alert..
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		wdWait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		//click on dismiss button o ALert
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		//use javascript to scroll to the element 
		WebElement bttn=driver.findElement(By.xpath("//div[@class='panel-body']//button[contains(text(),'Click for Prompt Box')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", bttn);
		
		//Send keys to the alert popup..
		Thread.sleep(2000);
		bttn.click();	
		driver.switchTo().alert().sendKeys("Hello Alert!");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
		
	}
	
	@Test(enabled=false)
	public void dropdownHandling() throws InterruptedException{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\muniyal\\Ecpliseworkspace\\PracticeTest\\chromedriver.exe");	
		driver.get("https://www.seleniumeasy.com/test/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),' Start Practising ')]")).click();
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.xpath("//a[@class='list-group-item' and contains(text(),'Select Dropdown List')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='list-group-item' and contains(text(),'Select Dropdown List')]")).click();
		Thread.sleep(1000);
		
		Select drpdwn=new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
		drpdwn.selectByValue("Tuesday");
		Thread.sleep(1000);
		drpdwn.selectByIndex(4);
		
		List<WebElement> l1=driver.findElements(By.xpath("//select[@name='States']/option"));
		for(WebElement el:l1){
			System.out.println(el.getText());
		}
		
		
	}
	}

