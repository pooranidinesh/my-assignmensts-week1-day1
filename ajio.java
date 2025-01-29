package learn1.week3d2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ajio {

	
	public static void main(String[] args) throws InterruptedException {
		
        //Intializing Chrome Driver
		ChromeDriver driver = new ChromeDriver(); 

		//Loading the URL
		driver.get("https://www.ajio.com/");
	    //Maximizing the Browser Window	
		driver.manage().window().maximize();
		
        //Searching a value
		WebElement searchElement = driver.findElement(By.xpath("//input[@name='searchVal']"));
		searchElement.sendKeys("bags");
		searchElement.sendKeys(Keys.ENTER);
		
		//Applying Filters
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(5000);

	//Fetching the count of Brands and Bags and Printing it using the Iteration Loop
	 String itemCount =	driver.findElement(By.xpath("//div[@class='length']")).getText();
	 System.out.println(itemCount);
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='brands']")).click(); 
	 Thread.sleep(3000);
	
	 List <WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
	 int countOfBrands = brands.size();
	 System.out.println("Total number of brands available are: "+countOfBrands);
	 Thread.sleep(3000);
	 for(int i=0; i<countOfBrands ; i++) {
		 
		 System.out.println(brands.get(i).getText());
	 }
	 List <WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
	 int countOfBags = bags.size();
	 System.out.println("Total number of brands available are: "+countOfBags);
	 Thread.sleep(3000);
  for(int i=0; i<countOfBags ; i++) {
		 
		 System.out.println(bags.get(i).getText());
	 }
  //Closing the browser
  driver.close();
	}
}




