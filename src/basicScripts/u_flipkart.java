package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class u_flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement usn=driver.findElement(By.name("search_query"));
		usn.sendKeys("kalki trailer");
		Thread.sleep(2000);
		usn.sendKeys(Keys.CONTROL+"a");
		//Thread.sleep(2000);
		//usn.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("search-icon-legacy"));
		search.click();
		Thread.sleep(2000);
		WebElement search1=driver.findElement(By.xpath("//yt-formatted-string[text()='Kalki 2898 AD Trailer - Hindi | Prabhas | Amitabh Bachchan | Kamal Haasan | Deepika | Nag Ashwin']"));
		search1.click();
		//search1.submit();
		/*driver.get("https://www.flipkart.com/");
		WebElement usn=driver.findElement(By.className("Pke_EE"));
		usn.sendKeys("watch");
		WebElement search=driver.findElement(By.className("_2iLD__"));
		search.click();
		WebElement search1=driver.findElement(By.className("_53J4C-"));
		search1.click();
		WebElement search2=driver.findElement(By.cssSelector("button[class='QqFHMw vslbG+ In9uk2']"));
		search2.submit();*/
		
	}

}
