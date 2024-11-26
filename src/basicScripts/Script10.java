package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/home/OneDrive/Desktop/html/disabled.html");
		WebElement usn=driver.findElement(By.xpath("//input[@type='text'][1]"));
		if(usn.isDisplayed())
		{
			if(usn.isEnabled())
			{
			usn.sendKeys("admin");
			System.out.println("admin is pass");
			}
		
		else
		{
			System.out.println("usn is displayed");
		}
	}
	  else
	{
		System.out.println("usn is not displayed");
	}
	
		
		WebElement cb=driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(cb.isDisplayed())
		{
			if(cb.isEnabled())
			{
				if(cb.isSelected())
				{
					System.out.println("It is selected");
					Thread.sleep(1000);
					cb.click();
				}
				else {
					System.out.println("It is not selected");
				}
			}
			else {
				System.out.println("It is disabled");
			}
			
			}
		else {
			System.out.println("It is not displayed");
		}
		
		WebElement psw=driver.findElement(By.xpath("//input[@type='text'][2]"));
		if(psw.isDisplayed())
		{
			if(psw.isEnabled())
			{
				psw.sendKeys("admin@123");
			}
			else {
				System.out.println("psw is disabled");
			}
		}
		else {
			System.out.println("psw is not displayed");
		}
	}
	
}
