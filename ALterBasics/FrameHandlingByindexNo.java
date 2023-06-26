package ALterBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingByindexNo {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();

		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/iframes.html");


		// Switch to frame -1  by using index no
		driver.switchTo().frame(0); 

		// Enter 'Swathi'  in first name text box
		driver.findElement(By.name("firstname")).sendKeys("Swathi");

		// Enter 'Ranganathan'  in last name text box
		driver.findElement(By.name("lastname")).sendKeys("Ranganathan");		


		// should come back to main page
		driver.switchTo().defaultContent();


		// Go To Frame -2 by indexno and enter 'sita' in username by switching to frame by using index	
		// swicth to frame -1  by uisng indexno 


		//enter 'mercury' in password


		// switch to main page 


		//HW Go to Frame -3 by 'index no'   and click button 2  times by switching to frame by using index	


		// HW Go to Frame -2  using 'index no' , Enter 'ur name' in un text box and pwd = "ur name", Click 'Reset New 'button


	}

}
