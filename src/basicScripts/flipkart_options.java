package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class flipkart_options {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/?next=%2FPHP%2F");
		WebElement dd=driver.findElement(By.id("month"));
		Select s=new Select(dd);
		List<WebElement> opt=s.getOptions();
		int count=opt.size();
		System.out.println(count);
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0; i<count; i++)
		{
			WebElement a=opt.get(i);
			String txt=a.getText();
			//System.out.println(txt);
			arr.add(txt);
		}
		Collections.sort(arr,Collections.reverseOrder());
		for(String ar:arr)
		{
			System.out.println(ar);
		}
	}

}
