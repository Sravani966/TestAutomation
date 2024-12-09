package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleScript {
	@Test
	public void Testcase1()
	{
		Reporter.log("Goodafternoon",true);
	}
	@Test
	public void Testcase2()
	{
		Reporter.log("Goodmorning",true);
	}
}
