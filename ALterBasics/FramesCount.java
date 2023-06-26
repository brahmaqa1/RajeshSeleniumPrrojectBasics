package ALterBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();

		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/iframes.html");

		// get frames count -- Iframe
		List<WebElement>  allIframes=  driver.findElements(By.xpath("//iframe"));

		// import package - ctrl + shift + o
		int FrameCnt= allIframes.size();
		System.out.println("FrameCnt="+FrameCnt);

		// FrameCnt=4

		// HW get Frames count By.tagname()?


	}

}
