package FindElementsBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleTextboxes {

	public static void main(String[] args) throws InterruptedException {
		// open chrome 
		//  open Chrome browser
		//				1. 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//2  create obj for ChromeDriver- Class 
		ChromeDriver driver =  new ChromeDriver();// open chrome browser with empty url 

		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");
		Thread.sleep(2000);

		//  get count of all textboxes in page 	
		//  findElements() - 
		List<WebElement> allTextboxElements =driver.findElements(By.xpath("//input[@type='text']"));

		int allTextboxesCnt= allTextboxElements.size();
		System.out.println("allTextboxesCnt="+allTextboxesCnt);// allTextboxesCnt=6

		// get first text box - from allTextboxes and enter 'first ' in first textbox
		allTextboxElements.get(0).sendKeys("first");

		// enter 'second ' value in 2nd element from all textboxes
		allTextboxElements.get(1).sendKeys("second");


		//  HW  enter '3rd ' value in 3rd textbox from all textboxes

		//HW  enter ' 4 th ' value in 4th textbox from all textboxes


		//  enter 'Swathi' in all text boxes
		// 1. using for loop with index  no	
//		for(int i=0;i<=allTextboxesCnt-1;i++)
//		{
//			//			allTextboxElements.get(0).
//			//			allTextboxElements.get(1).
//			WebElement eachTextbox=  allTextboxElements.get(i);
//			if(eachTextbox.isEnabled())
//			{
//				eachTextbox.sendKeys("Swathi");
//			}			
//		}
		//		 org.openqa.selenium.ElementNotInteractableException: element not interactable
		////	if ele (txt box) is disabled - if we try to clear data, enter data in text box- 
		//we will get ElementNotInteractableException


		//					******************************************************
		//  2 nd use for each loop
		//					 use for each loop for array list
       for(WebElement eachEle : allTextboxElements)
       {    	   
    	   if(eachEle.isEnabled())
    	   {
    		   eachEle.sendKeys("Raju");
    	   }
       }
		

		//***************************************
		// 3. way use iterartor ()	  it.next()  while loop			 

		// HW 4  way use listiterator()			



	}

}
