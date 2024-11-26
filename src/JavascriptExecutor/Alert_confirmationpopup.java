package JavascriptExecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_confirmationpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//button[.='Prompt Alert Box']"));
		ele.click();
		Alert popup=driver.switchTo().alert();
		//popup.sendKeys("yes");
		//popup.accept();
		//popup.dismiss();
		String msg=popup.getText();
		System.out.println(msg);
	}

}
