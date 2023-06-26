package ALterBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserBasedOnTitle {

	public static WebDriver  driver ;

	public static void closeBrowserBasedOngivenTitle(String title)
	{                                            //    Login page
		//		driver.get  -- not able to access driver ref var inside closeBrowserBasedOngivenTitle()
		// so we declare driver ref var as instance var inside class
		Set<String>  allBrowsersAddresses  = driver.getWindowHandles();
		// get all browser window addresess using for each loop

		for(String eachAddress : allBrowsersAddresses)
		{
			driver.switchTo().window(eachAddress);
			String actualTitle= driver.getTitle();
			System.out.println("actualTitle="+ actualTitle);

			if(title.equalsIgnoreCase(actualTitle))
			{ // Login page                WebtableAll --  false
				// Login page              Login page - true 
				System.out.println("closing browser with title="+title);
				driver.close();// close the currently focussed  browser window
			}			
		}	
	}

	public static void switchtoWindow(String expTitle)
	{
		Set<String>  allBrowsersAddresses  = driver.getWindowHandles();
		// get all browser window addresess using for each loop

		for(String eachAddress : allBrowsersAddresses)
		{
			driver.switchTo().window(eachAddress);
			String actualTitle= driver.getTitle();
			System.out.println("actualTitle="+ actualTitle);

			if(expTitle.equalsIgnoreCase(actualTitle))
			{
				System.out.println("Swicthed to window with title="+ expTitle);
				break;
			}
		}	


	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		//		WebDriver  driver =  new ChromeDriver();
		driver =  new ChromeDriver();

		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		//click 'Open  Login form' button   - it opens new window - browser -2
		driver.findElement(By.id("loginid")).click();
		Thread.sleep(2000);

		// click 'webtable all'  button  - it opens new window - browser -3
		driver.findElement(By.id("allid")).click();
		Thread.sleep(2000);

		// click 'Simple allObjects'  button simpleid - it opens new window - browser -4
		driver.findElement(By.id("simpleid")).click();
		Thread.sleep(2000);

		//		closeBrowserBasedOngivenTitle("Login page");
		//		closeBrowserBasedOngivenTitle("WebtableAll Title");
		//		 HW close broser with title= 'Simple all objects Title'

		// HW  HW close broser with title= 'All webobjects MyTitle Sumanth'


		switchtoWindow("Login page");

		// Enter user . pwd
		driver.findElement(By.id("userid")).sendKeys("Ramu");
		driver.findElement(By.id("pwdid")).sendKeys("mercury");

		// close browser
		driver.close();

		//HW  Switch to Window with title- All webobjects MyTitle Sumanth
		// HW Enter first name, last name 
		//	HW	close browser


		//HW  Go  to browser with title =  All webobjects MyTitle Sumanth
		// HW Select 'suzuki in bikes dropdown




	}

}
