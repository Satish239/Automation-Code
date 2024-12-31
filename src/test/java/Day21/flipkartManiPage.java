package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flipkartManiPage  extends Applicationlunch{
	WebDriver driver;
	public void validateOnSortFunctionality() {
		   driver.findElement(By.xpath("//*[contains(@placeholder,'Sea')]\"")).sendKeys("Shoes");
		   driver.get("https://www.flipkart.com");

	        // Close the login popup if it appears
	        try {
	            WebElement closeButton = driver.findElement(By.xpath("//button[text()='✕']"));
	            closeButton.click();
	        } catch (NoSuchElementException e) {
	            // Ignore if the close button is not present
	        }

	}
	
	public static void main(String[] args) {
	   Applicationlunch url = new Applicationlunch();
	   flipkartManiPage main = new flipkartManiPage();
	     url.lunchUrl();
	     main.validateOnSortFunctionality();
	     
	}

}
//button[contains(@title,'Sea')]
//*[contains(@placeholder,'Sea')]"