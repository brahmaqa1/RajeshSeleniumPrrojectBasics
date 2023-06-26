package ALterBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHanlding1 {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();

		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/iframes.html");

		// Enter 'Raju' in 'Test' txt box
		driver.findElement(By.name("myname")).sendKeys("Raju");

		// Enter 'Swathi'  in first name text box
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ramu");

		//		Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"*[name='firstname']"}

		// even if the first name ele is present on the page,   it throws NoSuchElementException
		//  First We have to check the first name text box ele is in Frame or not 


		// Go to frame -1  and enter  'Swathi' in first name textbox	
		//  we have to swicth  ctrl  to frame  by name or id 
		
		driver.switchTo().frame("iframe1name");
		
		// Enter 'Swathi'  in first name text box
		driver.findElement(By.name("firstname")).sendKeys("Swathi");

		// Enter 'Ranganathan'  in last name text box
		driver.findElement(By.name("lastname")).sendKeys("Ranganathan");

		// come back to main page
		driver.switchTo().defaultContent();


		// swicth to frame by invalid name 
		driver.switchTo().frame("sadsad");

		//  org.openqa.selenium.NoSuchFrameException: No frame element found by name or id iframe1nameNEW

		//  if we switch to frame  with invalid frame name = 'iframe1nameNEW' which is not availabe in page,
		//it throws NoSuchFrameException  


		// HW :Go To Frame -2 and enter 'sita' in username, enter 'mercury ' in pwd  and Go back to main page




		//HW  Go to Frame -3   and click button 2  times


		// Enter 'Usha'in 'Test'  text box  




	}

}
