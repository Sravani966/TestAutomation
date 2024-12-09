package Annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase3 extends GenericScript{
	@Test
	public void title()
	{
		System.out.println(driver.getTitle());
	}
}
