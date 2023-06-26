package FindElementsBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		//  open Chrome browser
		//				1. 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//2  create obj for ChromeDriver- Class 
		ChromeDriver driver =  new ChromeDriver();// open chrome browser with empty url 

		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		Thread.sleep(2000);

		driver.findElement(By.id("loginid")).click();
		Thread.sleep(2000);
		
		// click 'webtable all'  button 
		driver.findElement(By.id("allid")).click();
		Thread.sleep(2000);
		
		// clikc 'Simple allObjects '  button
		driver.findElement(By.id("simpleid")).click();
		Thread.sleep(2000);
		
		
		// get all browser titles 
		Set<String> allBrowsers = driver.getWindowHandles();		
		System.out.println("All browser count  ="+allBrowsers.size() );//All browser count  =4
		
		
		Iterator<String> it = allBrowsers.iterator();
		while(it.hasNext())
		{
			// to get val from iterator  
			String browserAddress= it.next();
			driver.switchTo().window(browserAddress);
				// get title of browser
				String title= driver.getTitle();
				System.out.println("title=" +title);			
		}
		
		

	}

}
