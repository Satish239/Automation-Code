package Day21;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Applicationlunch {
	
	      // WebDriver driver;
	   public void lunchUrl() {
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.flipkart.com");
	         driver.manage().window().maximize();        
	   }
}
