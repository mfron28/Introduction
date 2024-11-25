package streamsTutorial;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemoStreams {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column
		// capture all elements in a list
		// capture text of all web elements into new (original)list
		// sort in the list of step 3-> sorted list
		// compare original list with sorted list

		driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr//td[1]"));

		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
	
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr//td[1]"));
			// scan the name column with get text->Rice ->print the price of Beans
			price= rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}


		}while(price.size()<1);
	
	}
	
	
	private static String getPriceVeggie(WebElement s) {

		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
