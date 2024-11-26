package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swagerlabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//Thread.sleep(2000);
		WebElement usn=driver.findElement(By.id("user-name"));
		usn.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement psw=driver.findElement(By.id("password"));
		psw.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement log=driver.findElement(By.id("login-button"));
		log.click();
		Thread.sleep(2000);
		WebElement bag=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		bag.click();
		Thread.sleep(2000);
		WebElement bag1=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String txt=bag1.getText();
		System.out.println(txt);
		Thread.sleep(2000);
		WebElement price=driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		String txt1=price.getText();
		String txt3=txt1.replace("$","");
		System.out.println(txt3);
		Thread.sleep(2000);
		WebElement cart=driver.findElement(By.xpath("//button[.='ADD TO CART']"));
		cart.click();
		Thread.sleep(2000);
		WebElement cli=driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
		cli.click();
		Thread.sleep(2000);
		WebElement title=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String tit=title.getText();
		System.out.println(tit);
		Thread.sleep(2000);
		WebElement pri=driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
		String price1=pri.getText();
		System.out.println(price1);
		Thread.sleep(2000);
		
		
		if(txt.equals(txt1))
		{
			if(txt3.equals(price1))
			{
				System.out.println("txt is matching");
			}
		}
		
		
		WebElement ham=driver.findElement(By.xpath("//button[.='Open Menu']"));
		ham.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.xpath("//a[.='Logout']"));
		logout.click();
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
