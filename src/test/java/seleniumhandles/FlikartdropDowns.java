package seleniumhandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlikartdropDowns {

	public static void main(String[] args) {
		// 
		 WebDriver driver = new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	        driver.manage().window().maximize();
	      WebElement readOptions= driver.findElement (By.xpath("(//*[@class='_27h2j1'])[5]"));
	          readOptions.click();
	           Select categories = new Select(readOptions);
	          List<WebElement> readCategories = categories.getOptions();
	          for( WebElement allCategories : readCategories) {
	        	  System.out.println(allCategories .getText());
	          }
	}

}
