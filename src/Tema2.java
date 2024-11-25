import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tema2 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Madalina");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("madalina@outlook.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Madalina9");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		WebElement staticDropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("08/28/1992");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
	}

}
