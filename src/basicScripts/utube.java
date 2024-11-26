package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/home/OneDrive/Desktop/html/youtube.html");
		WebElement usn=driver.findElement(By.cssSelector("input[type='text']"));
		Thread.sleep(2000);
		usn.sendKeys("admin");
		WebElement cb=driver.findElement(By.cssSelector("input[type='checkbox']"));
		Thread.sleep(2000);
		cb.click();
		WebElement rb=driver.findElement(By.cssSelector("input[type='radio']"));
		Thread.sleep(2000);
		rb.click();
		WebElement link=driver.findElement(By.cssSelector("a[href='https:www.youtube.com']"));
		Thread.sleep(2000);
		link.click();
	}

}
