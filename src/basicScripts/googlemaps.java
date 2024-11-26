package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlemaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/maps/@12.9989812,77.5504667,15z?entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D");
		WebElement usn=driver.findElement(By.cssSelector("span[class='google-symbols NhBTye G47vBd']"));
		usn.click();
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-label='Choose starting point, or click on the map...']"));
		search.sendKeys("rajajinagar,karnataka");
		Thread.sleep(3000);
		WebElement usn2=driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-label='Choose destination, or click on the map...']"));
		usn2.sendKeys("basvangudi");
		//usn2.click();
	}

}
