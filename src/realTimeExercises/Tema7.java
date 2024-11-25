package realTimeExercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tema7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> columns = driver.findElements(By.cssSelector("tbody tr th"));

		int sum = 0;

		for (int i = 0; i < columns.size(); i++) {
			// System.out.println(columns.get(i).getText());
			sum = sum + 1;

		}
		System.out.println(sum);
		
		
		List<WebElement> lines =driver.findElements(By.cssSelector(".table-display tr"));
		int sum2 = 0;

		for (int j = 0; j < lines.size(); j++) {
			// System.out.println(columns.get(i).getText());
			sum2 = sum2 + 1;

		}
		System.out.println(sum2);
		
		String line2 = driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText();
		System.out.println(line2);
	}

}
