package main.java.week3.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class deletelead {

public static void main(String[] args) {
// Launch browser
ChromeDriver driver=new ChromeDriver();

//Load the url
driver.get("http://leaftaps.com/opentaps/control/main");

//Maximize the browser
driver.manage().window().maximize();
//Enter the username
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

	//Enter the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");

	//Click the login button
	driver.findElement(By.className("decorativeSubmit")).click();

	//Click the CRMSFA link
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	 WebElement phoneTab = driver.findElement(By.xpath("//a[text()='Phone']"));  // Replace with the actual XPath
     phoneTab.click();
	driver.findElement(By.name("phoneNumber")).sendKeys("12445678");               
	driver.findElement(By.className("Find Leads")).click();
}
}
