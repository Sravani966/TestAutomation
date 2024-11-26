package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 WebElement usn=driver.findElement(By.cssSelector("input[id='email']"));
		 usn.sendKeys("sravani");
		 WebElement pd=driver.findElement(By.cssSelector("input[name='pass']"));
		 pd.sendKeys("sravani@123");
		 WebElement login=driver.findElement(By.cssSelector("button[name='login']"));
		 login.click();
	}

}
