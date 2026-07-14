package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void createAcc()
	{
		Reporter.log("Created succesfully", true);
	}
	
	@Test(dependsOnMethods ="createAcc")
	public void editAcc()
	{
		Reporter.log("edited succesfully", true);
	}
	
	@Test(dependsOnMethods ={"createAcc","editAcc"})
	public void deleteAcc()
	{
		Reporter.log("deleted succesfully", true);
	}
	
}
