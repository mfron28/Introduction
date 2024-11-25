package deepDiveIntoFunctional;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tema5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");

		driver.findElement(By.cssSelector("a[href=\"/nested_frames\"]")).click();

	/**	List<WebElement> ele = driver.findElements(By.tagName("frame"));
		System.out.println("Number of frames in a page :" + ele.size());
		for (WebElement el : ele) {
			// Returns the Id of a frame.
			System.out.println("Frame Id :" + el.getAttribute("id"));
			// Returns the Name of a frame.
			System.out.println("Frame name :" + el.getAttribute("name"));
		}
**/
		WebElement frameTop = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(frameTop);
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
