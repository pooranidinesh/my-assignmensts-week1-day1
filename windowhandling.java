package learn1.week4d1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

		
		public static void main(String[] args)  {
			
	        //Intializing Chrome Driver
			ChromeDriver driver = new ChromeDriver(); 

			//Loading the URL
			driver.get("http://leaftaps.com/opentaps/\"");
		    //Maximizing the Browser Window	
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

			//Enter the password
			driver.findElement(By.id("password")).sendKeys("crmsfa");

			//Click the login button
			driver.findElement(By.className("decorativeSubmit")).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Merge Contacts")).click();
			driver.findElement(By.xpath("//input[@name='ComboBox_partyIdFrom']")).sendKeys("Demosalesmanager");
			driver.findElement(By.xpath("//input[@name='ComboBox_partyIdTo']")).sendKeys("nnod");
			driver.findElement(By.linkText("Merge")).click();
			Alert promptAlert = driver.switchTo().alert();
			String promptAlertText = promptAlert.getText();
			System.out.println(promptAlertText);
			promptAlert.accept();
			String parentAddress = driver.getWindowHandle();
			System.out.println("Parent address is :"+parentAddress);
			String parentTitle = driver.getTitle();
	        System.out.println("Parent title is : "+parentTitle);
	        driver.quit();
			
		}
}
