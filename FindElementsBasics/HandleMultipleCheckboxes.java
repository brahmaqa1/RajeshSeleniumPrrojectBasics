package FindElementsBasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// open chrome 
		//  open Chrome browser
		//				1. 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//2  create obj for ChromeDriver- Class 
		ChromeDriver driver =  new ChromeDriver();// open chrome browser with empty url 

		driver.get("file:///C:/brahma/Practise/SelniumPractiseNew/SampleWebpage.html");
		Thread.sleep(2000);

		// get all checkoxes cnt 
		List<WebElement> allCheckboxes=  driver.findElements(By.xpath("//input[@type='checkbox']"));
		int allCheckboxesCnt= allCheckboxes.size();
		System.out.println("allCheckboxesCnt ="+allCheckboxesCnt);// allCheckboxesCnt =5
		

		//  Click first check box  from all checkboxes
//		allCheckboxes.get(0).click();

		//  clikc 2nd checkbox		
//		allCheckboxes.get(1).click();
		
		// HW Click 3rd check box  from all checkboxes

		// click 4 th check box	 -- checkbox is disabled - if we click -
		allCheckboxes.get(3).click(); // No error : does not throw ElementnotInteractbaleException

		//   5   checkboxes 0 -4 

		// click 5 th check box		
//		allCheckboxes.get(5).click();// error  :  dont have index no 5
		//java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 4


		// HW 1.Click all checkboxes using for loop with index no 		

		//  HW 2.Click all checkboxes using for each looop			

		// HW 3.Click all checkboxes using iterator ()	
		Iterator<WebElement> it =allCheckboxes.iterator();
		while(it.hasNext())
		{
			// gte checkbox
			WebElement eachCheckbox = it.next();
			eachCheckbox.click();
			
		}

		// HW 4.Click all checkboxes using listIterator()		

		//  HW unselect all check boxes 
		// hint :   if checkbox is selected --  click 
//		----------------------------------------------------


		Thread.sleep(5000);
		driver.close();

	}

}
