package JavascriptExecutor;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_allbrowsersAndClose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		driver.findElement(By.id("browserButton2")).click();
		Set<String> win=driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(win);
		int count=arr.size();
		for(int i=0; i<count; i++)
		{
			String wins=arr.get(i);
			driver.switchTo().window(wins);
			String tit=driver.getTitle();
			System.out.println(tit);
			Thread.sleep(2000);
			driver.close();
		}
	}

}
