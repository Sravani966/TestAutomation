package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Busonline {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.busonlineticket.com/");
		WebElement org=driver.findElement(By.id("txtOrigin"));
		org.click();
		Thread.sleep(2000);
		WebElement src=driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
		src.click();
		Thread.sleep(2000);
		WebElement dst=driver.findElement(By.id("txtDestination"));
		dst.click();
		Thread.sleep(2000);
		WebElement src1=driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]"));
		src1.click();
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.id("txtDepartDate"));
		date.click();
		WebElement date1=driver.findElement(By.xpath("//a[.='20']"));
		date1.click();
		WebElement search=driver.findElement(By.id("btnBusSearchNew"));
		search.click();
		Thread.sleep(2000);
		WebElement search1=driver.findElement(By.xpath("//button[@class='btn btn-orange mt-2 selectseatbutton']"));
		search1.click();
		Thread.sleep(2000);
		WebElement seat=driver.findElement(By.xpath("(//div[@class='seat'])[2]"));
		seat.click();
		WebElement seat1=driver.findElement(By.xpath("(//div[@class='seat'])[3]"));
		seat1.click();
		WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-orange mt-4 undefined position-relative seatProceed']"));
		submit.click();
		WebElement name=driver.findElement(By.xpath("//input[@class='payment_textName form-control pay-form-control']"));
		name.sendKeys("abcdef");
		/*Thread.sleep(2000);
		WebElement no=driver.findElement(By.xpath("//input[@class='payment_txtPhoneLogin form-control pay-form-control']"));
		no.sendKeys("9494041717");
		Thread.sleep(2000);
		WebElement mail=driver.findElement(By.xpath("//input[@class='payment_txtEmail form-control pay-form-control']"));
		mail.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		WebElement ticket=driver.findElement(By.xpath("//input[@class='//select[@class='payment_ddChild1 form-control pay-form-control']']"));
		ticket.sendKeys("2");*/
		
	}

}
