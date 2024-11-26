package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count=links.size();
		for(int i=0; i<count; i++)
		{
			if(i%2==1)
			{
			WebElement link=links.get(i);
			String text=link.getText();
			System.out.println(i+" "+text);
		}
		
	}

	}

}
