package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/search");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("chicken biryani");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search1=driver.findElement(By.xpath("(//button[@class='xN32R'])[10]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", search1);
		Thread.sleep(2000);
		search1.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		WebElement add=driver.findElement(By.xpath("(//button[@class='sc-cgjDci sc-djTQaJ DhGSh iAjqrz add-button-center-container'])[12]"));
		add.click();
		Thread.sleep(2000);
		WebElement ch=driver.findElement(By.xpath("//span[@class='custom-checkbox']"));
		ch.click();
		Thread.sleep(2000);
	//	WebElement ch1=driver.findElement(By.xpath("(//div[.='Masala Papad'])[1]"));
		//ch1.click();
		//Thread.sleep(2000);
		//WebElement ch2=driver.findElement(By.xpath("(//div[.='Gulab Jamoon 2pc'])[1]"));
		//ch2.click();
		//Thread.sleep(2000);
		WebElement cart=driver.findElement(By.xpath("//button[@type='button']"));
		cart.click();
	}

}
