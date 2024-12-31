package Day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase {

	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String str = driver.getTitle();
//		System.out.println(str);
//		 if(str.equals("Your Store")) {
//			 System.out.println("Test passed");
//		 }else {
//			 System.out.println("Test failed");
//		 }	
		
//	     driver.findElement(By.partialLinkText("Desk")).click();
//		driver.findElement(By.linkText("Desktops")).click();
//           List<WebElement> links= driver.findElements(By.tagName("a"));
//             System.out.println("Number of  links "+ links.size());
//		List<WebElement> images= driver.findElements(By.tagName("img"));
//        System.out.println("Number of  images is displayed on the UI : "+ images.size());
		
	}

}
