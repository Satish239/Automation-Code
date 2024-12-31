package Day21;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectors {
	
    WebDriver driver;
	     
	@BeforeClass
	    public void setup() {
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.flipkart.com");	      
	}
	@Test
	 public void validateSortFunctionality() throws InterruptedException {
        // Data setup (These values should be retrieved from a data source in a real scenario)
        String searchParam = "shoes";  // This should come from data source
        String sortParam = "Price Low to High";  // This should come from data source
        int pageLimit = 2;  // This should come from data source

        // Step 1: Open Flipkart
        driver.get("https://www.flipkart.com");

        // Close the login popup if it appears
        try {
            WebElement closeButton = driver.findElement(By.xpath("//button[text()='✕']"));
            closeButton.click();
        } catch (NoSuchElementException e) {
            // Ignore if the close button is not present
        }

        // Step 2: Search for "shoes"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchParam);
    //    searchBox.sendKeys(Keys.RETURN);

        // Step 3: Click on the Sort option: Price - Low to High
       
      //  WebElement sortDropdown = new WebDriverWait(driver, 10)
       // 		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Sort by']")));
      //  WebElement sortDropdown = driver.findElement(By.xpath("//div[text()='Sort by']"));
 	   
                
      //  sortDropdown.click();

    //  WebElement priceLowToHighOption = new WebDriverWait(driver, 10)
       //         .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Price -- Low to High']")));
          Thread.sleep(10000);
        WebElement priceLowToHighOption = driver.findElement(By.xpath("//*[text()='Price -- Low to High']"));
        priceLowToHighOption.click();

        // Step 4: Validate prices on page 1 and page 2
        for (int page = 1; page <= pageLimit; page++) {
            System.out.println("Validating prices on page " + page + "...");
            validatePricesOnPage();

            if (page < pageLimit) {
                // Navigate to next page
                WebElement nextPageButton = driver.findElement(By.xpath("//a[@class='_1LKTO3']"));
                nextPageButton.click();
                try {
                    Thread.sleep(3000);  // Wait for the next page to load
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Helper function to validate if product prices are sorted in ascending order
    /**
     * @throws InterruptedException 
     * 
     */
	     public void validatePricesOnPage() throws InterruptedException {
	    	// Data setup (These values should be retrieved from a data source in a real scenario)
		        String searchParam = "shoes";  // This should come from data source
		        String sortParam = "Price Low to High";  // This should come from data source
		        int pageLimit = 2;  // This should come from data source

		        // Step 1: Open Flipkart
		        driver.get("https://www.flipkart.com");

		        // Close the login popup if it appears
		        try {
		            WebElement closeButton = driver.findElement(By.xpath("//button[text()='✕']"));
		            closeButton.click();
		        } catch (NoSuchElementException e) {
		            // Ignore if the close button is not present
		        }

		        // Step 2: Search for "shoes"
		        WebElement searchBox = driver.findElement(By.name("q"));
		        searchBox.sendKeys(searchParam);
		    //    searchBox.sendKeys(Keys.RETURN);

		        // Step 3: Click on the Sort option: Price - Low to High
		       
		      //  WebElement sortDropdown = new WebDriverWait(driver, 10)
		       // 		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Sort by']")));
		      //  WebElement sortDropdown = driver.findElement(By.xpath("//div[text()='Sort by']"));
		 	   
		                
		      //  sortDropdown.click();

	        //  WebElement priceLowToHighOption = new WebDriverWait(driver, 10)
		       //         .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Price -- Low to High']")));
		          Thread.sleep(10000);
		        WebElement priceLowToHighOption = driver.findElement(By.xpath("//*[text()='Price -- Low to High']"));
		        priceLowToHighOption.click();

		        // Step 4: Validate prices on page 1 and page 2
		        for (int page = 1; page <= pageLimit; page++) {
		            System.out.println("Validating prices on page " + page + "...");
		            validatePricesOnPage1();

		            if (page < pageLimit) {
		                // Navigate to next page
		                WebElement nextPageButton = driver.findElement(By.xpath("//a[@class='_1LKTO3']"));
		                nextPageButton.click();
		                try {
		                    Thread.sleep(3000);  // Wait for the next page to load
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		            }
		        }
		    }

		    // Helper function to validate if product prices are sorted in ascending order
		    /**
		     * 
		     */
		    public void validatePricesOnPage1() {
		        // Get all product prices on the current page
		        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='Nx9bqj']"));
		        
		        // Extract the prices into a list of doubles
		        double[] productPrices = new double[prices.size()];
		        for (int i = 0; i < prices.size(); i++) {
		            String priceText = prices.get(i).getText().replace("₹", "").replace(",", "").trim();
		            if (!priceText.isEmpty()) {
		                productPrices[i] = Double.parseDouble(priceText);
		            }
		        }

		        // Validate if the product prices are in ascending order
		        for (int i = 0; i < productPrices.length - 1; i++) {
		            if (productPrices[i] > productPrices[i + 1]) {
		                System.out.println("Prices are NOT in ascending order on this page.");
		                return;
		            }
		        }
		        System.out.println("Prices are in ascending order on this page.");
		    }
		    
		    

	     
@AfterClass
public void tearDown() {
    // Close the driver after test
    if (driver != null) {
        driver.quit();
    }
}
}




