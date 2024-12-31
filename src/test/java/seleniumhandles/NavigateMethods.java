package seleniumhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	       driver.get("https://www.google.co.in/");
	        driver.manage().window().maximize();
	      driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("HYR tutorials");
	      driver.findElement(By.xpath("//*[@title='Search']")).submit();
	      Thread.sleep(4000);
	      driver.navigate().to("https://www.flipkart.com/");
	      driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Shoes");
	      Thread.sleep(4000);
	      driver.navigate().refresh();
	        Thread.sleep(4000);
	        driver.navigate().back();
	         driver.navigate().forward();
	         driver.quit();
	        

	}

}
