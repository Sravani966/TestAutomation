package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/home/OneDrive/Desktop/html/username.html");
		WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		Thread.sleep(3000);
		driver.switchTo().frame("f2");
		WebElement mob=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		mob.sendKeys("9404981987");
		//WebElement mob=driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		WebElement em=driver.findElement(By.xpath("//input[@type='text']"));
		em.sendKeys("anu@gmail.com");
		
		//driver.quit();

	}

}
