package seleniumhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxActions {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
	        driver.manage().window().maximize();
	      WebElement userEmail = driver.findElement(By.xpath("//*[@id='email_container']/*[contains(@placeholder,'Email address or phone number')]"));
	          if(userEmail.isDisplayed()) {
	        	  if(userEmail.isEnabled()) {
	        		  userEmail.sendKeys("Satishdone2@gmail.com");
	        		     String enteredEmail= userEmail.getAttribute("value");
	        		     System.out.println(enteredEmail);
	        		     Thread.sleep(3000);
	        		      userEmail.clear();
	        		     userEmail.sendKeys("junnu@2208");
	        		     Thread.sleep(3000);
	        		     userEmail.clear();
	        		     
	        	  }else {
	        		  System.out.println("User email is not enabled");
	        	  }
	          }else {
	        	  System.out.println("User email is not displayed");
	          }
	          
	         
                          
	}

}
