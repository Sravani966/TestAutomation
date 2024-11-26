package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/?hl=en");
		WebElement usn=driver.findElement(By.xpath("//input[@name='username']"));
		Thread.sleep(2000);  
		String an=usn.getAttribute("aria-label");
		System.out.println(an);
		Thread.sleep(1000);
		driver.quit();
		/*driver.navigate().to("https://www.facebook.com/");
		WebElement usn=driver.findElement(By.id("email"));
		String an=usn.getAttribute("data-testid");
		System.out.println(an);*/
	}

}
