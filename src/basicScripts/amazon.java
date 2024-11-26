package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("witch watches men");
		Thread.sleep(2000);
		search.submit();
		Thread.sleep(5000);
		WebElement brands=driver.findElement(By.xpath("//span[.='Top Brands']"));
		brands.click();
		Thread.sleep(5000);
		WebElement fastrack=driver.findElement(By.xpath("//span[.='Fastrack']"));
		fastrack.click();
		Thread.sleep(5000);
		WebElement first=driver.findElement(By.xpath("//img[@data-image-latency='s-product-image']"));
		first.click();
		Thread.sleep(5000);
		driver.close();
	}

}
