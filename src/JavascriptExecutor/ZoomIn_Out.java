package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZoomIn_Out {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//h3[.='6. Use of Public Areas and Content Standards']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.body.style.zoom='+200%'");
		js.executeScript("document.body.style.zoom='50%'");
	}

}
