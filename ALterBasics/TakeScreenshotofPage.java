package ALterBasics;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotofPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		WebDriver  driver =  new ChromeDriver();

		// get("url ") - to open the url in chrome browser
		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");


		//		TakesScreenshot  - predefined Interface in Selenium
		//   getScreenshotAs() - used to take screenshot of web page
		// OutputType --  interface

		File srcfname= ((TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);		
		System.out.println("fname="+srcfname);
		//  take scrren shot of webpage in the form of file as .png format in temporary folder
		//		fname=C:\Users\Lenovo\AppData\Local\Temp\screenshot8381304091231275615.png


		// 		Fileutils  in   commons-io .jar file
		// Download jar file from maven repository  and add to current project
		// add commons -io .jar file to project
		////		fileuti
	
		//  copy file from temp folder to our project folder location
		File destFile =  new File("C:\\brahma\\Practise\\SelniumPractiseNew\\Apr32023WorkSpace\\SeleniumPrrojectBasics\\src\\ALterBasics\\MyScreenShot2.png");

		FileUtils.copyFile(srcfname, destFile);



	}

}
