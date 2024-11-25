package deepDiveIntoFunctional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//no of frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(0); can switch using frame index
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		driver.findElement(By.id("draggable")).click();
		
		WebElement source =	driver.findElement(By.id("draggable"));
		WebElement target =	driver.findElement(By.id("droppable"));
		
		Actions a =new Actions(driver);
		a.dragAndDrop(source,target).build().perform();
		
		//go out from the frame if you want to do other actions
		driver.switchTo().defaultContent();
		
	}

}
