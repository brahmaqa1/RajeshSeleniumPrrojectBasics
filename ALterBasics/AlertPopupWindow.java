package ALterBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopupWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();

		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");



		//   Click 'Display alert box in 3 seconds'  to get alert popup window
		System.out.println("Click 'Display alert box in 3 seconds'  to get alert popup window");
		driver.findElement(By.id("alertid1")).click();


		//  it is taking some time to display alert -- we have to define explicit wait 
		//   condition :  wait for till  alert window is present
		try
		{
			WebDriverWait   wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			wait.until(ExpectedConditions.alertIsPresent());

			//  popup - displayed with inn 3 sec  +  wont wait remaiing 47 sec
			//                             20 sec +  wont wait remaiing 30 sec
			 // if popup is not displayed after waiting max time 50 sec- it throws   Timeout Exception


			//  switch control  from main page to alert popup window
			Alert al = driver.switchTo().alert();		
			//			 org.openqa.selenium.NoAlertPresentException: no such alert
			///  if there is not alert popup window, and we try to swicth to alert popup window, we will get 'NoAlertPresentException:


			// alert is predefined Interface in Selenium
			//  which has some methods to handle alert window
			//	1.gettext() : to get text from alert window
			//				Accept() :  click ok /yes btn
			//	2. dismiss() :  to dismisss alert //  click cancel/ No button
			//	4.sendkeys();


			//  to get text from alert window
			String popupMsg  =	al.getText();
			System.out.println("popupMsg="+popupMsg);

			// alertPopupMsg=Please enter Employee name


			// Send data 'Ramu' to alert
			 al.sendKeys("Ramu"); // not working  ??? 
			Thread.sleep(3000);

			// accept alert -- i.e click ok/yes btn
			System.out.println("Click ing yes button in alert window");
//			al.accept();


			//  to dismiss alert //  click cancel/No button
			System.out.println("Clicking No/Cancel  button in alert window");
			al.dismiss();


//			driver.switchTo().alert();//  no alertPresent Exception
			// org.openqa.selenium.NoAlertPresentException: no such alert
			// IF no alert popup window is present, if we try to switch to alert popup window, it throws 'NoAlertPresentException'

		}
		
		catch (Exception e) {
			System.out.println("Exception :  Alert popup window is not present with in given time ");
		}
		
		
		// note :  control is coming to main page by default
		/// enter some value in first name text box
		driver.findElement(By.name("firstname")).sendKeys("Rama");
		System.out.println("ends");

	}

}
