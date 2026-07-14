package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoN {
	
	@Test
	public void mul()
	{
		Reporter.log("mul", true);
	}
	
	@Test(enabled=false)
	public void add()
	{
		Reporter.log("add", true);
	}
	@Test
	public void sub()
	{
		Reporter.log("sub", true);
	}

}
