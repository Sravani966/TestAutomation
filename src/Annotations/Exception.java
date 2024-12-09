package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.id("email"));
		usn.sendKeys("admin");
		WebElement psw = driver.findElement(By.id("pass"));
		psw.sendKeys("admin@123");//StaleElementReferenceException
		driver.navigate().refresh();
		 usn = driver.findElement(By.id("email"));
		usn.sendKeys("admin");
		 psw = driver.findElement(By.id("pass"));
		psw.sendKeys("admin@123");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
