package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/home/OneDrive/Desktop/html/dropdown.html");
		WebElement dd=driver.findElement(By.id("celebrities"));
		Select s=new Select(dd);
		if(s.isMultiple())
		{
			s.selectByIndex(2);
			Thread.sleep(1000);
			s.selectByValue("j");
			Thread.sleep(1000);
			s.selectByVisibleText("Mahendra");
			Thread.sleep(1000);
			//s.deselectAll();
			s.deselectByIndex(2);
			Thread.sleep(1000);
			s.deselectByValue("j");
			Thread.sleep(1000);
			s.deselectByVisibleText("Mahendra");
			
		}
		else {
			System.out.println("the dropdown is single select");
		}
		Thread.sleep(1000);
	}
	}


