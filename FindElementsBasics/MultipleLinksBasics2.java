package FindElementsBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinksBasics2 {

	public static void main(String[] args) throws InterruptedException {
		//  open Chrome browser
		//				1. 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//2  create obj for ChromeDriver- Class 
		ChromeDriver driver =  new ChromeDriver();// open chrome browser with empty url 

		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");
		Thread.sleep(2000);

		///  get all Links count :
//		List<WebElement>  allLinks = driver.findElements(By.xpath("//a"));
		List<WebElement>  allLinks = driver.findElements(By.tagName("a"));
		//  it goes to html page , find all elememts  using By tagname= 'a'in html page
		//   
		int allLinksCnt= allLinks.size();
//		allLinks.count();// The method count() is undefined for the type List<WebElement>
//		allLinks.length();// The method length() is undefined for the type List<WebElement>
		
		
		System.out.println("allLinksCnt="+allLinksCnt);// allLinksCnt=3


		
			// click 2st link
		// get 1st link and click
//		allLinks.get(0).click();
		
		//  click 2nd link 
//		allLinks.get(1).click();
		
		// HW click 3rd link


		// get fist link text -- o/p:  My Gmail
		//  <a href="https://www.google.com/intl/en-GB/gmail/about/"> My gmail  </a>
		String Link0Text =   allLinks.get(0).getText();
		System.out.println("Link0Text="+Link0Text); // Link0Text=My gmail

		// HW get 2nd link and its text  (Open Face book)

		// HW get 3rd link and its text ( Open Amazon)

		// get 4th link text 
//		String link4Text = allLinks.get(3).getText();
//		System.out.println("link4Text="+link4Text);
		//.IndexOutOfBoundsException: Index 3 out of bounds for length 3
		// bcoz we dont have index no = 3   as list stores values/ elements in index no  0 to 2 .
		//   3 links  0 ,1 ,2  


		// 1st Link  url (href)
		// <a href="https://www.google.com/intl/en-GB/gmail/about/">My gmail</a>
		String link1Text = allLinks.get(0).getAttribute("href");
		System.out.println("link1Text="+link1Text);
		// link1Text=https://www.google.com/intl/en-GB/gmail/about/
		

		//HW  get 2nd link url

		// HW get 3rd link url


		// get all visible link texts from page  using for loop with index no?
		System.out.println("gettig all links using for loop with index no");
		for(int i=0;i<=allLinksCnt-1;i++)
		{
			 WebElement  linkEle=  allLinks.get(i); // String / Webelment/List<Webelemet>
			 
			 String linkText = linkEle.getText();
			 System.out.println("linkText="+linkText);
		}


//linkText=My gmail
//linkText=Open Facebook
//linkText=Open amazon

		//**************************************************
		// HW   // get all visible link texts from page  using 'for each loop'



		// 3 // HW   // get all visible link texts from page  using 'iterator()'



		// 4 .HW   // get all visible link texts from page  using 'listiterator()'



		// HW  get all link urls using for loop with indexno , foreach loop , iterator(), listiterator()
// o/p: https://www.google.com/intl/en-GB/gmail/about/
//	    https://www.facebook.com/
//		https://amazon.com/"
		

	}

}
