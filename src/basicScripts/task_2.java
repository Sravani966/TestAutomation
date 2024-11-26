package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/home/OneDrive/Desktop/html/task-2.html");
		WebElement ele=driver.findElement(By.id("t1"));
		Thread.sleep(2000);
		ele.sendKeys("ghdjsjh");
		WebElement ele1=driver.findElement(By.name("n1"));
		ele1.sendKeys("ghdjsjh");
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.className("c1"));
		ele2.sendKeys("ghdjsjh");
		Thread.sleep(2000);
		WebElement ele3=driver.findElement(By.partialLinkText("Instagram"));
		Thread.sleep(2000);
		ele.clear();
		ele3.click();
		
	}

}
