package ALterBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();

		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		//clikc 'Open  Login form' button   - it opens new window - browser -2
		driver.findElement(By.id("loginid")).click();

		Thread.sleep(5000);
		// get browsers count
		Set<String>  allBrowserWndAddresses = driver.getWindowHandles();
		int BrowsersCnt= allBrowserWndAddresses.size();
		System.out.println("BrowsersCnt="+ BrowsersCnt);

		//     can be used to get all the browser window addresses and store into Set object i.e allBrowserWndAddresses


		// switch to new browser window  i.e window-2
//		driver.switchTo().window(null)

		// get browser-1 addreess
		Iterator<String> it= allBrowserWndAddresses.iterator(); 
		String browser1Address= it.next();

		// get browser-2 addreess
		 String browser2Address=  it.next();
		 

		// alert();
		// frame("name or id or indexno or webelement ");
		// Window("browser window address")	
		 driver.switchTo().window(browser2Address);

			//enter 'ramu' in un textbox
			 driver.findElement(By.id("userid")).sendKeys("My user");
			 
			//enter 'mercury' in password
			 driver.findElement(By.id("pwdid")).sendKeys("Mercury");
	
			Thread.sleep(5000);

		//  close browser -2 window
			driver.close();// close the browser which is currently focussed
			//  		// it will close currently focussed browser window i.e browser-2


		//   switch to Main page i.e Browser -1
			driver.switchTo().window(browser1Address);
			// enter 'Rao' in last name
			driver.findElement(By.name("lastname")).sendKeys("My Last name");

		

		Thread.sleep(5000);

		//  switch to invalid browser address
//		driver.switchTo().window("Abcddfsfa");

		//  org.openqa.selenium.NoSuchWindowException: no such window
		//			- ele  is no --> 
		//		      alert     -->  
		//		     Frame is not there --> 
		//  Window -->   NoSuchWindowException





	}

}
