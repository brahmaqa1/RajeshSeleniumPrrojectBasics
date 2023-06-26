package ALterBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();

		// get("url ") - to open the url in chrome browser
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		// switch to frame-1 by id 
		driver.switchTo().frame("frame1");

		//Enter "Topic- OuterFrame " in Topic text box
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Topic- OuterFrame");



		// Swicth to inner frame,		// click 'Inner Frame Check box :'
		driver.switchTo().frame("frame3");
			driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();//  back to main page

//			driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Inner frame");
		///  Error:NoSuchEle  this ele is in frame -1

		// Switch to frame-3   and Select 'Avatar' dropdown
		driver.switchTo().frame("frame2");
		
		WebElement  animalsDropdownEle=  driver.findElement(By.id("animals"));
			Select sel =  new Select(animalsDropdownEle);
			sel.selectByVisibleText("Avatar");
		driver.switchTo().defaultContent();	


	}



}
