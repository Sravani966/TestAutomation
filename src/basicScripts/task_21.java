package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/home/OneDrive/Desktop/html/task_3.html");
		List<WebElement> links=driver.findElements(By.xpath("//input"));
		int count=links.size();
		for(int i=1; i<=count-1; i=i+2) {
			//if(i%2==1) {
			WebElement link=links.get(i);
			link.clear();
			
			}
		}
	}


