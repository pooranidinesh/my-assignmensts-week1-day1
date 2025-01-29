package learn1.week1d2;


	//package week2.day2;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		public class createaccount {

		public static void main(String[] args) {
		// Launch browser
		ChromeDriver driver=new ChromeDriver();

		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the browser
		driver.manage().window().maximize();

		//Find the element -findElement
		//Enter the value in a text field-sendKeys
		//Click the button -click

		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		               
		                 //Click the CRMSFA link
		driver.findElement(By.linkText("Accounts")).click();
		                 driver.findElement(By.linkText("Create Account")).click();
		                 driver.findElement(By.id("accountName")).sendKeys("sathisk");
		                 driver.findElement(By.name("description")).sendKeys("selenium web driver");
		                 WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		                Select industrySelect = new Select(industryDropdown);
		                industrySelect.selectByVisibleText("Computer Software");

					

		                 // Select "S-Corporation" as the ownership type
		                 WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
		                 Select ownershipSelect = new Select(ownershipDropdown);
		                 ownershipSelect.selectByVisibleText("S-Corporation");

		                 // Select "Employee" as the source
		                 WebElement sourceDropdown = driver.findElement(By.name("dataSourceId"));
		                 Select sourceSelect = new Select(sourceDropdown);
		                 sourceSelect.selectByValue("LEAD_EMPLOYEE");

		                 // Select "eCommerce Site Internal Campaign" as the marketing campaign
		                 WebElement marketingCampaignDropdown = driver.findElement(By.name("marketingCampaignId"));
		                 Select marketingCampaignSelect = new Select(marketingCampaignDropdown);
		                 marketingCampaignSelect.selectByIndex(6); // Assuming "eCommerce Site Internal Campaign" is at index 3

		                 // Select "Texas" as the state/province
		                 WebElement stateDropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		                 Select stateSelect = new Select(stateDropdown);
		                 stateSelect.selectByValue("TX");

		                 // Click the "Create Account" button
		                 driver.findElement(By.className("smallSubmit")).click();
		                
		               // Thread.sleep(1000);

		                 driver.close();
		            
		}
		}

		              

