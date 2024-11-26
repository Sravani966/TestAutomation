package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window();
		driver.navigate().to("https://www.facebook.com/");
		WebElement usn=driver.findElement(By.id("email"));
		/*Point p=usn.getLocation();
		System.out.println(p);
		int x =p.getX();
		int y = p.getY();
		System.out.println(x);
		System.out.println(y);*/
		int h=usn.getSize().getHeight();
		int w=usn.getSize().getWidth();
		System.out.println(h);
		System.out.println(w);
	}

}
