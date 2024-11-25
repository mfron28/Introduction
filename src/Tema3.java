import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tema3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		login(driver);

		String[] phones = { "iphone","Samsung"};
		
		addItems(driver,phones);
		
	}

	public static void login(WebDriver driver) {
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.className("customradio")).click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select option = new Select(dropdown);
		option.selectByIndex(2);

		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
	}

	public static void addItems(WebDriver driver, String[] phones) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			String[] nameOfProduct = products.get(i).getText().split(" ");
			String formattedName = nameOfProduct[0].trim();
			
			List itemsneeded = Arrays.asList(phones);

			if (itemsneeded.contains(formattedName)) {
				
				driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
				j++;
				
				if (j == phones.length)
					break;
			}

		}
	}
}
