package learn1.week4d1;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.Alert;
	//import org.openqa.selenium.Dismiss;

	public class frames{

		

		public static void main(String[] args){
			 //Launch browser
			ChromeDriver driver=new ChromeDriver();
			
			//Load the url
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Maximize the browser
			driver.manage().window().maximize();
			
			//switch to the frame
			driver.switchTo().frame(1);
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			Alert promptAlert = driver.switchTo().alert();
			String promptAlertText = promptAlert.getText();
			System.out.println(promptAlertText);
			promptAlert.accept();
			
				}
			
			}	
		

		
