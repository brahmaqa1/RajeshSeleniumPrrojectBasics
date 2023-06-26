package ALterBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingById {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();

		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/iframes.html");

		// Enter 'Raju' in Test txt box
		driver.findElement(By.name("myname")).sendKeys("Raju");


		// Go to frame -1 and   and enter  'Swathi' in first name textbox
		//  we have to switch  ctrl  to frame  by  id 
		driver.switchTo().frame("iframe1id");

		// Enter 'Swathi'  in first name text box
		driver.findElement(By.name("firstname")).sendKeys("Swathi");

		// Enter 'Ranganathan'  in last name text box
		driver.findElement(By.name("lastname")).sendKeys("Ranganathan");		

		// come back to main page
		driver.switchTo().defaultContent();

		// swicth to frame by invalid id 
		//				driver.switchTo().frame("iframe1id1313");
		//  org.openqa.selenium.NoSuchFrameException: No frame element found by name or id iframe1id1313

		//  if we switch to frame  with given id = 'iframe1id1313' which is not availabe in page,
		//it throws .NoSuchFrameException  


		// HW :Go To Frame -2 by 'id' and enter 'sita' in username, enter 'mercury ' in pwd  and Go back to main page




		//HW  Go to Frame -3  by id   and click button 2  times


		// Enter 'Usha'in 'Test'  text box  



	}

}
