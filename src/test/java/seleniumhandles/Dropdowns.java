package seleniumhandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
	       driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	        driver.manage().window().maximize();
	       WebElement course = driver.findElement(By.xpath("//*[@id='course']"));
	       course.click();
	         Select courseItems = new Select(course);
	            List<WebElement> selectedOptions  =  courseItems.getOptions();
	           for( WebElement getAllOptions :selectedOptions) {
	        	    System.out.println( getAllOptions.getText());
	           }
	           courseItems.selectByIndex(2);
	           Thread.sleep(3000);
	           courseItems.selectByVisibleText("Java");
	           Thread.sleep(3000);
	           courseItems.selectByValue("python");
	           Thread.sleep(3000);
	    System.out.println( "Get selected Item in Dropdown  : " + courseItems.getFirstSelectedOption().getText());       
	        

	}

}
