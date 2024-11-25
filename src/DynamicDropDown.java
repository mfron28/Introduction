import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Bengaluru (BLR)']")).click();
		
		//select dates from callendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		//check if the calendar is enabled or not
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//select Round Trip 
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//Although I selected the checkbox, is selected returns false
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isSelected());
		
		//check if the calendar is enabled or not
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//check if the calendar is enabled or not
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		
		{
			System.out.println("its enabled");
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
