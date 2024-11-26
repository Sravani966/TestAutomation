package basicScripts;

import java.io.File;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_element {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		//Date d=new Date();
		Date d=new Date(0);
		String d1=d.toString().replace(":", "-");
		System.out.println(d1);
		WebElement usn=driver.findElement(By.id("pass"));
		File temp=usn.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Screenshots/Element.png");
		FileHandler.copy(temp,perm);
	}

}
