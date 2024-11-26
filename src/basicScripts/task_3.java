package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 WebElement usn=driver.findElement(By.id("email"));
		 usn.sendKeys("sravani");
		 Thread.sleep(2000);
		 WebElement psw=driver.findElement(By.name("pass"));
		 psw.sendKeys("sravani@123");
		 WebElement login=driver.findElement(By.name("login"));
		 login.click();
	}
}
		 