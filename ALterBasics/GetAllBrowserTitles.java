package ALterBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllBrowserTitles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();

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


		// get all browsers Count
		Set<String>  allBrowserWindowAddresses = driver.getWindowHandles();
		int browsersCnt= allBrowserWindowAddresses.size();
		System.out.println("browsersCnt="+browsersCnt);
		//All browser count  =4

		// get all browser titles using iterator()

//		Iterator<String> it = allBrowserWindowAddresses.iterator();
//		while(it.hasNext())
//		{
//			String browserAddress= it.next();
////			System.out.println("browserAddress="+browserAddress);
//			// swicth to each browser
//			driver.switchTo().window(browserAddress);
//			String title =driver.getTitle();
//			System.out.println("title="+title);
//			
//		}

		//				title=All webobjects MyTitle Sumanth
		//				title=Simple all objects Title
		//				title=WebtableAll Title
		//				title=Login page

		//  get all browser titles using for each loop
		for(String  eachAddress: allBrowserWindowAddresses)
		{
			
			driver.switchTo().window(eachAddress);
			String title =driver.getTitle();
			System.out.println("title="+title);
			
		}
//		title=All webobjects MyTitle Sumanth
//				title=Simple all objects Title
//				title=WebtableAll Title
//				title=Login page


	}

}
