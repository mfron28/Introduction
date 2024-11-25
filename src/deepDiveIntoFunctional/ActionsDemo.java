package deepDiveIntoFunctional;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		// move to a specific element
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[title='My eBay']"));

		a.moveToElement(driver.findElement(By.xpath("//input[@id='gh-ac']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();

	}

}
