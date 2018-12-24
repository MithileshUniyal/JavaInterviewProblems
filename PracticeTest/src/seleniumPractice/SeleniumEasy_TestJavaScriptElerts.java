package seleniumPractice;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumEasy_TestJavaScriptElerts extends BaseClass {

	
	@Test(enabled=true)
	public void test01_testAcceptAletBox() throws IOException, InterruptedException{
		     
		//Click on Alerts and Models option..
			WebElement myalert=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Alerts & Modals')]"));
			myalert.click();
			waitForElement("//a[@class='dropdown-toggle' and contains(text(),'Alerts & Modals')]");
			
			//click on Java script Alerts:
			WebElement JsAlert =driver.findElement(By.xpath("//li[@class='dropdown open']//ul[@class='dropdown-menu']//a[contains(text(),'Javascript Alerts')]"));
			JsAlert.click();
			Thread.sleep(5000);
			
			//click on button to get a JS popup
			WebElement clickButton=driver.findElement(By.xpath("//div[contains(text(),'Java Script Alert Box')]//..//button[contains(text(),'Click me!')]"));
			clickButton.click();
			Thread.sleep(5000);
			//Handling alert using Alert InterFace
			driver.switchTo().alert().accept();
			takeScreenShots();
			
			Thread.sleep(3000);
	}
	
	@Test(enabled=true)
	public void test02_testCancelAletBox() throws IOException, InterruptedException{
		//Click on Alerts and Models option..
		WebElement myalert=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Alerts & Modals')]"));
		myalert.click();
		waitForElement("//a[@class='dropdown-toggle' and contains(text(),'Alerts & Modals')]");
		
		//click on Java script Alerts:
		WebElement JsAlert =driver.findElement(By.xpath("//li[@class='dropdown open']//ul[@class='dropdown-menu']//a[contains(text(),'Javascript Alerts')]"));
		JsAlert.click();
		Thread.sleep(5000);
		//click on button to get a JS popup
		WebElement clickButton=driver.findElement(By.xpath("//div[contains(text(),'Java Script Confirm Box')]//..//button[contains(text(),'Click me!')]"));
		clickButton.click();
		WebDriverWait wdWait=new WebDriverWait(driver, 60);
		wdWait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(5000);
		//Handling alert using Alert InterFace
		driver.switchTo().alert().dismiss();
		takeScreenShots();
		Thread.sleep(3000);
		
	}

	@Test(enabled=false)
	public void test03_testSendMsgTolAletBox() throws IOException, InterruptedException{
	     
			//Click on Alerts and Models option..
				WebElement myalert=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Alerts & Modals')]"));
				myalert.click();
				waitForElement("//a[@class='dropdown-toggle' and contains(text(),'Alerts & Modals')]");
				
				//click on Java script Alerts:
				WebElement JsAlert =driver.findElement(By.xpath("//li[@class='dropdown open']//ul[@class='dropdown-menu']//a[contains(text(),'Javascript Alerts')]"));
				JsAlert.click();
				Thread.sleep(5000);
				//click on button to get a JS popup
				
				WebElement clickButton=driver.findElement(By.xpath("//div[contains(text(),'Java Script Alert Box')]//..//button[contains(text(),'Click for Prompt Box')]"));
				
				//Scrolling to the element using javscript
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true);", clickButton);
				
				//click on button to get a JS popup
				clickButton.click();
				Thread.sleep(5000);
				
				//Handling alert using Alert InterFace
				driver.switchTo().alert().sendKeys("This is Javascript Alert");
				takeScreenShots();
				driver.switchTo().alert().accept();
				Thread.sleep(3000);
		
	}
}
