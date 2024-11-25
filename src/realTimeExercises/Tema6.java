package realTimeExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tema6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// select option 2 from checkbox
		WebElement option2 = driver.findElement(By.cssSelector("label[for='benz']"));
		driver.findElement(By.id("checkBoxOption2")).click();
		String textOptionChBx = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(textOptionChBx);

		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		dropDown.click();
		dropDown.sendKeys(textOptionChBx);

		// enter the name in the field and click on alert
		driver.findElement(By.id("name")).sendKeys(textOptionChBx);
		driver.findElement(By.id("alertbtn")).click();

		// switch to alert
		driver.switchTo().alert();
		String alertText = driver.switchTo().alert().getText();
		

		if (alertText.contains("Option2")) {
			System.out.println("match found");
		} else {
			System.out.println("match not found");
		}
	}

}
