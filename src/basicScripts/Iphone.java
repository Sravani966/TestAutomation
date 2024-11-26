package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iphone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement usn=driver.findElement(By.className("Pke_EE"));
		usn.sendKeys("iphone11");
		usn.submit();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//div[.='Apple iPhone 11 (White, 64 GB)']"));
		search.click();
		Thread.sleep(2000);
		WebElement f1=driver.findElement(By.xpath("//div[@class='DOjaWF YJG4Cf']"));
		driver.switchTo().window("f1");
		WebElement search1=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
		search1.submit();
		
	}

}
