package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FruitN {
@Test
	
	public void apple()
	{
		Reporter.log("apple", true);
	}

	@Test
	public void Banana()
	{
		Reporter.log("Banana", true);
	}
	
	@Test
	public void kiwi()
	{
		Reporter.log("kiwi", true);
	}
	@Test
	public void Grapes()
	{
		Reporter.log("Grapes", true);
	}

}
