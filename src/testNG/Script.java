package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.*;
public class Script {
	@Test
	public void signup()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String Expectedtitle="Facebook - log in or sign up";
		String Actualtitle=driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(Expectedtitle,Actualtitle);
		System.out.println(Actualtitle);
		driver.close();
		
	}

}
