package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task_con {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoapps.qspiders.com/ui/login");
		WebElement email1=driver.findElement(By.cssSelector("input[id='email']"));
		 Thread.sleep(2000);
		email1.sendKeys("sravani123@gmail.com");
		Thread.sleep(2000);
		WebElement pd1=driver.findElement(By.cssSelector("input[id='password']"));
		 Thread.sleep(2000);
		 pd1.sendKeys("sravani@123");
		 Thread.sleep(2000);
		 WebElement bu1=driver.findElement(By.cssSelector("button[type='submit']"));
		 Thread.sleep(2000);
		 bu1.click();

	}

}
