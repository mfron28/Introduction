package realTimeExercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// count the links from the page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// count the links only from the footer
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // limiting webDriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		WebElement coulmnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coulmnDriver.findElements(By.tagName("a")).size());

		// click on each link on the column and check if the links are opened

		for (int i = 1; i < coulmnDriver.findElements(By.tagName("a")).size(); i++) {

			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			coulmnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
