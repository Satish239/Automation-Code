package seleniumhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesandRadiobuttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	       driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//*[@id='femalerb']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id='englishchbx']")).click();
	        Thread.sleep(3000);
	   WebElement isClick = driver.findElement(By.xpath("//*[@id='hindichbx'][@class='bcCheckBox'] "));
	       Thread.sleep(3000);
           isClick.click();
            Thread.sleep(3000);
	         if(isClick.isSelected())
	        	 isClick.click();
	         driver.findElement(By.xpath("//*[@id= 'registerbtn']")).click();
	          System.out.println(driver.findElement(By.id("msg")).getText()); 
	         
	          driver.findElement(By.xpath("//*[text()='Click here to navigate to the home page']")).click();
	          
	          
	 
	        

	}

}
