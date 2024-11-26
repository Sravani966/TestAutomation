package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoqspiders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");	
		Thread.sleep(2000);
		WebElement ema=driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(ema);
		Thread.sleep(2000);
		WebElement email1=driver.findElement(By.id("email"));
		email1.sendKeys("sravs@gmail.com");
		Thread.sleep(2000);
		WebElement psw=driver.findElement(By.id("password"));
		psw.sendKeys("sravs@123");
		Thread.sleep(3000);
		WebElement cpsw=driver.findElement(By.id("confirm-password"));
		cpsw.sendKeys("sravs@123");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		WebElement login=driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(login);
		WebElement usn=driver.findElement(By.id("username"));
		usn.sendKeys("sravs123@gmail.com");
		Thread.sleep(2000);
		WebElement psw1=driver.findElement(By.id("password"));
		psw1.sendKeys("sravs@123");
		Thread.sleep(2000);
		driver.quit();
	}

}
