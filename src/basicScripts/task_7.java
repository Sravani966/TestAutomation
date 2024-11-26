package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		 WebElement ele=driver.findElement(By.xpath("//th[contains(text(),'Levis Shirt')]/../following-sibling::tr[1]/td[1]/../following-sibling::tr[1]/td[2]/../following-sibling::tr[1]/td[3]"));
		 Thread.sleep(2000);
		 ele.click();
	}

}
