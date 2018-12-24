package seleniumPractice;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.beust.jcommander.IStringConverter;

public class DatePicker {
	//WebDriver driver= new ChromeDriver();
	ChromeDriver cd=new ChromeDriver();
	@SuppressWarnings("deprecation")
	@Test
	public void handlingDatePicker() throws InterruptedException{
		//System.setProperty("webDriver.chrome.driver", "C:\\Users\\muniyal\\Ecpliseworkspace\\PracticeTest\\chromedriver.exe");	
		cd.get("https://www.seleniumeasy.com/test/");
		
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Clcik on the date picker option in the left tree menu
		
		driver.findElement(By.xpath("//li[@class='tree-branch']//a[@href='#'][contains(text(),'Date pickers')]")).click();
		
	//click on bootstrap date picker
		driver.findElement(By.xpath("//ul[@id='treemenu']//a[contains(text(),'Bootstrap Date Picker')]")).click();
		
		//Click on the date option..  
	
		driver.findElement(By.xpath("//div[@class='input-group date']//span[@class='input-group-addon']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='datepicker-days']//td"));
		Date d=new Date();
		int todayDate=d.getDate();
		System.out.println("....."+ String.valueOf(todayDate));
		
		for(	WebElement date:dates){
		//	if(date.getText().equalsIgnoreCase( String.valueOf(todayDate))){
			if(date.getText().equalsIgnoreCase("14")){
				date.click();
			}
		}
		Thread.sleep(3000);*/
		

	
		
		
	}
	
}
