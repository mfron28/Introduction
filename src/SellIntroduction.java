import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SellIntroduction {

	public static void main(String[] args) {
		
		// chromedriver.exe
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\mfron\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Firefox launch
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://rahulshettyacademy.com");
		
		
		//Microsoft Edge launch
		WebDriver driver2= new EdgeDriver();
		driver.get("https://google.com");
		
		//close only a tab
		driver.close();
		//close all associated windows that were opened by automation
		//driver.quit();
		
	}

}
