package basicScripts;

import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demoapp_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement f=driver.findElement(By.id("select-multiple-native"));
		Select s=new Select(f);
		s.selectByValue("Running Shoes");
		Thread.sleep(2000);
		WebElement f1=driver.findElement(By.xpath("//button[.='Add']"));
		f1.click();
		Thread.sleep(2000);
		s.selectByValue("Winter Coat");
		Thread.sleep(2000);
		f1.click();
		Thread.sleep(2000);
		s.selectByValue("Casual Pants");
		f1.click();
		Thread.sleep(2000);
		s.selectByValue("Formal Shoes");
		f1.click();
		Thread.sleep(2000);
		s.selectByValue("Leather Jacket");
		f1.click();
		Thread.sleep(2000);
		s.selectByValue("Jeans");
		f1.click();
		Thread.sleep(2000);
		s.selectByValue("Sneakers");
		f1.click();
		Thread.sleep(2000);
		s.selectByValue("Raincoat");
		f1.click();
		Thread.sleep(2000);
		s.selectByValue("Chinos");
		f1.click();
		Thread.sleep(2000);
		s.selectByValue("Hiking Boots");
		f1.click();
		WebElement f2=driver.findElement(By.xpath("//option[.='Running Shoes']"));
		Actions a =new Actions(driver);
		a.doubleClick(f2).perform();
		WebElement b=driver.findElement(By.xpath("//button[.='Remove']"));
		b.click();
		Thread.sleep(2000);
		WebElement f3=driver.findElement(By.xpath("//option[.='Winter Coat']"));
		a.doubleClick(f3).perform();
		b.click();
		Thread.sleep(2000);
		WebElement f4=driver.findElement(By.xpath("//option[.='Casual Pants']"));
		a.doubleClick(f4).perform();
		b.click();
		Thread.sleep(2000);
		WebElement f5=driver.findElement(By.xpath("//option[.='Formal Shoes']"));
		a.doubleClick(f5).perform();
		b.click();
		Thread.sleep(2000);
		WebElement f6=driver.findElement(By.xpath("//option[.='Leather Jacket']"));
		a.doubleClick(f6).perform();
		b.click();
		Thread.sleep(2000);
		WebElement f7=driver.findElement(By.xpath("//option[.='Jeans']"));
		a.doubleClick(f7).perform();
		b.click();
		Thread.sleep(2000);
		WebElement f8=driver.findElement(By.xpath("//option[.='Sneakers']"));
		a.doubleClick(f8).perform();
		b.click();
		Thread.sleep(2000);
		WebElement f9=driver.findElement(By.xpath("//option[.='Raincoat']"));
		a.doubleClick(f9).perform();
		b.click();
		Thread.sleep(2000);
		WebElement f10=driver.findElement(By.xpath("//option[.='Chinos']"));
		a.doubleClick(f10).perform();
		b.click();
		Thread.sleep(2000);
		WebElement f11=driver.findElement(By.xpath("//option[.='Hiking Boots']"));
		a.doubleClick(f11).perform();
		b.click();
	}

}
