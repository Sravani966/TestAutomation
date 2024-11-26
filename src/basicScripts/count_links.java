package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class count_links {

	public static void main(String[] args) throws InterruptedException {
		// Set the path for the GeckoDriver
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Open the Facebook website
		driver.manage().window().maximize(); // Maximize the browser window
		driver.navigate().to("https://www.facebook.com/");

		// Find all anchor tags
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		//System.out.println("Number of links: " + count); // Print the total count of links

		// Iterate through the links and print the URLs
		for (int i = 0; i < count; i++) {
			WebElement link = links.get(i); // Get the link at index i
			String url = link.getAttribute("href"); // Get the href attribute
			System.out.println(url);
		}

		// Wait for 2 seconds before closing the browser
		Thread.sleep(2000);
		driver.close(); // Close the browser
	}
}
