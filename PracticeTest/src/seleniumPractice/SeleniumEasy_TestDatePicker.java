package seleniumPractice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumEasy_TestDatePicker extends BaseClass {
	
	@Test(enabled=false)
	
	public void test01_testBootStrapDatePicker() throws InterruptedException, IOException{
		

		//Click on Date picker option..
	
		WebElement datePicker=driver.findElement(By.xpath("//div[@id='navbar-brand-centered']//..//a[contains(text(),'Date picker')]"));
		datePicker.click();
		waitForElement("//div[@id='navbar-brand-centered']//..//a[contains(text(),'Date picker')]");
		
		//Click on Bootstrap Date picker
		WebElement bootstrapDatePicker=driver.findElement(By.xpath("//div[@id='navbar-brand-centered']//..//a[contains(text(),'Date picker')]//../ul//a[contains(text(),'Bootstrap Date Picker')]"));
	     bootstrapDatePicker.click();
	     Thread.sleep(3000);
	     
	     //Click on the Select Date 
	     WebElement selectDate=driver.findElement(By.xpath("//div[@id='sandbox-container1']//h4[contains(text(),'Select Date')]//..//input[@placeholder='dd/mm/yyyy']"));
	     selectDate.click();
	     
	     //click on Today..
	     WebElement todaysDate=driver.findElement(By.xpath(" //div[@class='datepicker-days']//th[@class='today'][contains(text(),'Today')]"));
	     todaysDate.click();
	     takeScreenShots();
	     
	   
	}

	@Test
	public void test02_jQueryDatePicker() throws InterruptedException, IOException{
		//JQuery Date Picker
		//Click on Date picker option..
		
			WebElement datePicker=driver.findElement(By.xpath("//div[@id='navbar-brand-centered']//..//a[contains(text(),'Date picker')]"));
			datePicker.click();
			waitForElement("//div[@id='navbar-brand-centered']//..//a[contains(text(),'Date picker')]");
			
			//Click on Bootstrap Date picker
			WebElement jQueryDatePicker=driver.findElement(By.xpath("//div[@id='navbar-brand-centered']//..//a[contains(text(),'Date picker')]//../ul//a[contains(text(),'JQuery Date Picker')]"));
			jQueryDatePicker.click();
		     Thread.sleep(3000);
		     
		     //Click on FromDate
		     WebElement fromDate=driver.findElement(By.xpath("//div[contains(text(),'Date Range Picker')]//..//input[@id='from']"));
		     fromDate.click();
		     
		     //Select Date from the JQuery Date picker..
		     List<WebElement> list=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//..//tbody/tr/td/a"));
		     for(WebElement dates:list){
		    	 System.out.println(dates.getText());
		    	String d=dates.getText();
		    	
		    	 if(Integer.parseInt(d)==30){
		    		
		    		 dates.click();
		    		 break;
		    		 
		    		
		    	 }
		     }
		     Thread.sleep(3000);
		     takeScreenShots();
	}
	
	
}
