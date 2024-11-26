package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_details {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?next=%2FPHP%2F");
		WebElement f=driver.findElement(By.name("firstname"));
		f.sendKeys("abcdef");
		Thread.sleep(2000);
		WebElement l=driver.findElement(By.name("lastname"));
		l.sendKeys("xyzse");
		Thread.sleep(2000);
		WebElement d=driver.findElement(By.id("day"));
		Select s=new Select(d);
			s.selectByValue("18");
			Thread.sleep(2000);
			WebElement m=driver.findElement(By.id("month"));
			Select s1=new Select(m);
			s1.selectByValue("3");
			Thread.sleep(2000);
			WebElement y=driver.findElement(By.id("year"));
			Select s2=new Select(y);
			s2.selectByValue("2002");
			Thread.sleep(2000);
			WebElement g=driver.findElement(By.xpath("//input[@value='1']"));
			g.click();
			Thread.sleep(2000);
			WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
			email.sendKeys("9494049800");
			Thread.sleep(2000);
			WebElement p=driver.findElement(By.id("password_step_input"));
			p.sendKeys("abcd@123");
			Thread.sleep(2000);
			WebElement c=driver.findElement(By.xpath("//button[@type='submit']"));
			c.click();
	}

}
