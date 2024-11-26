package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_layout {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Date d=new Date();
		String d1=d.toString().replace(":", "-");
		System.out.println(d1);
		WebElement usn=driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
		File temp=usn.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Screenshots/Defect2.png");
		FileHandler.copy(temp,perm);
		Thread.sleep(2000);
		driver.close();
	}

}
