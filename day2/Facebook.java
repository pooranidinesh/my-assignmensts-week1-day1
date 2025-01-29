package learn1.week1d2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebDriver.Timeouts;
	import org.openqa.selenium.support.ui.Select;

	public class Facebook {
			public static void main(String[] args)  {
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://en-gb.facebook.com/");
		        driver.manage().window().maximize();
		        driver.findElement(By.linkText("Create new account")).click();
				driver.findElement(By.name("firstname")).sendKeys("sutha");
		        driver.findElement(By.name("lastname")).sendKeys("renga");
		        driver.findElement(By.name("reg_email__")).sendKeys("ren123");
		        driver.findElement(By.name("reg_passwd__")).sendKeys("ren123@");
		        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
		        WebElement dayDropdown = driver.findElement(By.id("day"));  // Replace with actual ID
	            Select daySelect = new Select(dayDropdown);
	            daySelect.selectByValue("15");
	            WebElement monthDropdown = driver.findElement(By.id("month"));  // Replace with actual ID
	            Select monthSelect = new Select(monthDropdown);
	            monthSelect.selectByVisibleText("May");
	            WebElement yearDropdown = driver.findElement(By.id("year"));  // Replace with actual ID
	            Select yearSelect = new Select(yearDropdown);
	            yearSelect.selectByValue("1992");
	            WebElement genderRadioButton = driver.findElement(By.name("sex"));  // Replace with actual ID (for male in this example)
	            genderRadioButton.click();
	          //  WebElement genderRadioButton = driver.findElement(By.id("sex"));  // Replace with actual ID (for male in this example)
	            genderRadioButton.click();
	            driver.close();
		}
		}





