package realTimeExercises;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class BrokenLink {
	//@BeforeTest
	
	
	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();

		for (WebElement link : links) {

			String url = link.getAttribute("href");

			@SuppressWarnings("deprecation")
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);

			a.assertTrue(respCode < 400, "The link with Text" + link.getText() + "is broken with code" + respCode);
			/*
			 * if (respCode > 400) {
			 * System.out.println("The link with Text"+link.getText()+"is broken with code"
			 * +respCode); Assert.assertTrue(false);//this stops the process if find it true
			 * }
			 */
		}

		a.assertAll();
	}
}
