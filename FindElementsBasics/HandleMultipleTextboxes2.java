package FindElementsBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleTextboxes2 {

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
		List<WebElement> allTextboxElements =driver.findElements(By.xpath("//div"));
		WebElement allTextboxElements2 =driver.findElement(By.xpath("//div"));

		int allTextboxesCnt= allTextboxElements.size();// 0
		System.out.println("allTextboxesCnt="+allTextboxesCnt);// allTextboxesCnt=6

		



	}

}
