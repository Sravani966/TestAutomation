package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class zomato {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		WebElement usn=driver.findElement(By.className("sc-koErNt hlcHts"));
		usn.sendKeys("biryani");
		Thread.sleep(2000);
		usn.click();
		WebElement img=driver.findElement(By.cssSelector("img[class='sc-s1isp7-5 fyZwWD']"));
		img.click();
	}

}
