package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/button?sublist=0");
		WebElement reg=driver.findElement(By.xpath("//button[@id='btn']"));
		Thread.sleep(3000);
		reg.click();
		Thread.sleep(3000);
		WebElement con=driver.findElement(By.xpath("//button[@id='btn3']"));
		con.click();
		Thread.sleep(3000);
		WebElement rate=driver.findElement(By.xpath("//button[@id='btn6']"));
		rate.click();
		Thread.sleep(3000);
		Dimension d=new Dimension(500,300);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(5000);
		Point p=new Point(300,600);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		driver.close();
	}

}
