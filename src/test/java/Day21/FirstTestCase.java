package Day21;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		   driver.manage().window().maximize();
		   
      //  getTitle : 
//		   String title = driver.getTitle();
//		   System.out.println(title);
		   
   //	 getCurrentUrl
//           String url = driver.getCurrentUrl();
//              System.out.println(url);
   //    getclass
		 //  driver.getClass();
		   
		   
//     driver.navigate().to("https://www.youtube.com/");
//        driver.navigate().refresh();
//        driver.navigate().back();
//        driver.navigate().forward();
//		   driver.findElement(By.xpath("//div//a[@class='btn btn-lg btn-primary']")).click();
//		   driver.findElement(By.xpath("//div//a[@class='btn btn-link navbar-btn']")).click();
		  driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]//a[@title=\"Login\"]")).click();
		  driver.findElement(By.xpath("//*[@class='I-qZ4M vLRlQb']//*[@*='text']")).sendKeys("6303426686");
		  Thread.sleep(5000);
		 // driver.findElement(By.xpath("//*[@class='I-qZ4M vLRlQb']//*[@*='text']")).clear();
		  
//		 Point location= driver.findElement(By.xpath("//*[@class='I-qZ4M vLRlQb']//*[@*='text']")).getLocation();
		  
		   
	}

}
