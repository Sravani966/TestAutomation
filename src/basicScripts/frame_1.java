package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/home/OneDrive/Desktop/html/main.html");
		WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		//Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement ps=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		ps.sendKeys("admin@123");
		//WebElement mob=driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(0);
		WebElement mob1=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		mob1.sendKeys("987677787676");
		driver.switchTo().frame(0);
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		email.sendKeys("admin@gmail.com");
		//driver.switchTo().frame(0);
		Thread.sleep(2000);
		//driver.quit();
		email.clear();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		mob1.clear();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		usn.clear();
	}

}
