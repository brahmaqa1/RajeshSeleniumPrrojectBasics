package ALterBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsBasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// . Represents current project folder name

		//		//open chrome browser
		ChromeDriver  driver =  new ChromeDriver();

		driver.get("https://www.google.com/");

		// Enter rama in search box 
		driver.findElement(By.name("q")).sendKeys("Rama");
		Thread.sleep(5000);

		// get all suggestions -(//ul[@role='listbox'])[1]/li
		//		List<WebElement>	allSuggestions=	driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		//		List<WebElement>	allSuggestions=	driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li//div[1]/div[2]//div[@role='presentation']/span"));
		List<WebElement>	allSuggestions=	driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li/div[1]/div[2]/div[@role='option']/div[@role='presentation'][1]/span"));



		// count 
		int suggestionsCnt= 		allSuggestions.size();
		System.out.println("suggestionsCnt="+suggestionsCnt);

		for(int i=0;i<=suggestionsCnt-1;i++)
		{
			String suggestionText= allSuggestions.get(i).getText();

			if(suggestionText.equals(""))
			{

			}
			else
			{
				System.out.println("SuggestionText="+suggestionText);
			}
		}
		//		SuggestionText=ramadan 2023
		//				SuggestionText=Ramalinga Reddy
		//				SuggestionText=Minister of Transport of Karnataka
		//				SuggestionText=Ramaiah Institute of Technology
		//				SuggestionText=Institute of technology in Bengaluru, India
		//				SuggestionText=Ramamurthy Nagar
		//				SuggestionText=Ramayana
		//				SuggestionText=Book by Valmiki
		//				SuggestionText=ramadan 2023 date
		//				SuggestionText=ramadan 2023 date bangalore
		//				SuggestionText=ramadan 2023 date karnataka
		//				SuggestionText=ramadan
		//				SuggestionText=Ramanagara
		//				SuggestionText=City in India

		// HW 2. for each loop

		// Hw 3 iterator()

		//  Hw4 use listIterator()

		//(//ul[@role='listbox'])[1]/li//div[1]/div[2]//div[@role='option']//div[@role='presentation'][1]

	}

}
