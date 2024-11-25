package realTimeExercises;

import java.lang.reflect.Proxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHttpsCertifications {

	public static void main(String[] args) {
		
		ChromeOptions options =new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
	//	Proxy proxy= new Proxy();
	//proxy.setHttpProxy("ipaddress:4444");
		
		WebDriver driver = new ChromeDriver(options);//pass the options
		driver.get("https://expired.badssl.com");
		
		System.out.println(driver.getTitle());
	}

}
