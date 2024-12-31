package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class WindowHandlesOperations {

	public static void main(String[] args) {
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		   driver.manage().window().maximize();
		     
		        

	}

}
