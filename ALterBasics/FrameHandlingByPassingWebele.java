package ALterBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingByPassingWebele {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		ChromeDriver  driver =  new ChromeDriver();

		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/iframes.html");

	
		// Enter 'Raju' in Test txt box
				driver.findElement(By.name("myname")).sendKeys("Raju");

		//    switch ctrl to frame 1 by using webelement
		// identify frame element 
		WebElement iframe1Ele =	driver.findElement(By.xpath("//iframe[@name='iframe1name']"));
		driver.switchTo().frame(iframe1Ele);
				// Clear value in first anme text box
				driver.findElement(By.name("firstname")).clear();
				
				// Enter 'Swathi'  in first name text box
				driver.findElement(By.name("firstname")).sendKeys("Swathi");
		
				// Enter 'Ranganathan'  in last name text box
				driver.findElement(By.name("lastname")).sendKeys("Ranganathan");	

		//   must switch ctrl to main page
			driver.switchTo().defaultContent();


		//HW  Go To Frame -2 and enter 'sita' in username by switching to frame by using webelement	


		//HW  Go to Frame -3   and click button 2  times by switching to frame by using webelement	


		// click 'Click me!'  2 times

		Thread.sleep(2000);


		//    switch to default main page



	}

}
