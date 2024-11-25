import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//enter my name
		driver.findElement(By.id("name")).sendKeys("Madalina");
		//click on a button
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		//display the alert text
		System.out.println(driver.switchTo().alert().getText());
		
		//switch to the pop-up Alert
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		//Confirm button
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();//accept for OK 
		}
	
}