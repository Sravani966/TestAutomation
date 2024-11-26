package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task_13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://106.51.87.42:9007/");
		Thread.sleep(2000);
		WebElement usn=driver.findElement(By.xpath("//input[@id='email']"));
		usn.sendKeys("Fresher@gmail.com");
		Thread.sleep(2000);
		WebElement psw=driver.findElement(By.xpath("//input[@id='password']"));
		psw.sendKeys("Fresher@2024");
		Thread.sleep(2000);
		WebElement log=driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		Thread.sleep(3000);
		WebElement pa=driver.findElement(By.xpath("//a[@href='http://106.51.87.42:9007/index.php?doctor/patient']"));
		pa.click();
		Thread.sleep(5000);
		WebElement apa=driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
		apa.click();
		Thread.sleep(5000);
		WebElement name=driver.findElement(By.id("field-1"));
		name.sendKeys("anupama");
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("anupama@gmail.com");
		Thread.sleep(5000);
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("anupama@123");
		Thread.sleep(5000);
		WebElement add=driver.findElement(By.xpath("//textarea[@name='address']"));
		add.sendKeys("H.NO:2256-15,BANGALORE,RAJAJINAGAR");
		Thread.sleep(5000);
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("1234567892");
		Thread.sleep(5000);
		WebElement sel=driver.findElement(By.xpath("//select[@name='sex']"));
		sel.click();
		Thread.sleep(5000);
		WebElement fe=driver.findElement(By.xpath("//option[@value='female']"));
		fe.click();
	}

}
