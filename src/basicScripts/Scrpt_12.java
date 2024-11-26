package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrpt_12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement usn=driver.findElement(By.id("email"));
		String an=usn.getTagName();
		System.out.println(an);
		Thread.sleep(2000);
		String tn=usn.getCssValue("background-color");
		System.out.println(tn);
		WebElement ele=driver.findElement(By.name("login"));
		String tex=ele.getText();
		System.out.println(tex);
	}

}
