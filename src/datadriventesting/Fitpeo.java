package datadriventesting;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Fitpeo {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fitpeo.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='satoshi MuiBox-root css-5ty6tm'])[5]"));
		ele.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='MuiSlider-root MuiSlider-colorPrimary MuiSlider-sizeMedium css-16i48op']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)");
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.xpath("//input[@type='number']"));
		js.executeScript("arguments[0].value='820'",ele3);
		Thread.sleep(2000);
		WebElement slider = driver.findElement(By.xpath("//input[@type='number']"));
		js.executeScript("arguments[0].value='560'",slider);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//span[.='57']"));
		ele2.click();
		Thread.sleep(2000);
		WebElement ele4 = driver.findElement(By.xpath("//span[.='19.19']"));
		ele4.click();
		Thread.sleep(2000);
		WebElement ele5 = driver.findElement(By.xpath("//span[.='63']"));
		ele5.click();
		Thread.sleep(2000);
		WebElement ele6 = driver.findElement(By.xpath("//span[.='15']"));
		ele6.click();
		Thread.sleep(1000);
		WebElement ele9 = driver.findElement(By.xpath("//input[@type='number']"));
		js.executeScript("arguments[0].value='560'",ele9);
		
	}

	
	}


