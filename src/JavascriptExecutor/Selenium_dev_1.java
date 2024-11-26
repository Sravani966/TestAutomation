package JavascriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_dev_1 {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		WebElement net=driver.findElement(By.xpath("//a[.='4.26.1 (October 30, 2024)']"));
		WebElement ruby=driver.findElement(By.xpath("(//p[@class='card-text m-0 pb-1'])[4]"));
		WebElement python=driver.findElement(By.xpath("(//p[@class='card-text m-0 pb-1'])[10]"));
		WebElement js=driver.findElement(By.xpath("(//p[@class='card-text m-0 pb-1'])[13]"));
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("net");
		arr.add("ruby");
		arr.add("python");
		arr.add("js");
		for(int i=0; i<arr.size(); i++)
		{
		Actions s=new Actions(driver);
		s.contextClick(net).perform();
		Thread.sleep(2000);
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		}
	}


