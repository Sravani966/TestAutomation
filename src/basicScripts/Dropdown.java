package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

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
			System.out.println("the dropdown is multiselect");
		}
		else {
			System.out.println("the dropdown is single select");
		}
		Thread.sleep(1000);
	}

}
