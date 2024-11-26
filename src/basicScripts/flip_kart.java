package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class flip_kart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/nerf-pro-gelfire-refill-15000-rounds-blasters-ages-14-guns-darts/p/itma6ed2d2ac7f10?pid=TWPGXTST7QA4DMSN&lid=LSTTWPGXTST7QA4DMSNXMICM6&marketplace=FLIPKART&store=tng%2Fsv3&srno=b_1_21&otracker=browse&fm=organic&iid=en_ApLB70RkPCxwh5CpMNHlBfkO82GXPBYJILLCvm559KscTgXDTBHsb8YsAKV_l9ooFx65rzEnbA3B0eLzNvtJs2JMZAJirnjvZRqZ0WhE16A%3D&ppt=browse&ppn=browse&ssid=smx3qcco5s0000001724477754093");
		WebElement dd=driver.findElement(By.xpath("//span[.='Women']"));
		Select s=new Select(dd);
		if(s.isMultiple())
		{
			
			s.selectByVisibleText("Clothing");
	}
		else {
			System.out.println("not");
		}
		Thread.sleep(2000);

}
}
