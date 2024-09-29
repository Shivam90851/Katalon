package Framework;

import org.testng.asserts.SoftAssert;

public class AssertFunction extends DriverInit {
	
	public SoftAssert softAssert = new SoftAssert ();
	
	public void AssertValue (String ExpectedValue, String ActualValue) {
	softAssert.assertEquals(ExpectedValue,ActualValue );
	
	}
	public void AssertValue (int ExpectedValue,int ActualValue, String message ) {
		softAssert.assertEquals(ExpectedValue ,ActualValue );
	}
	public void AssertValue (float ExpectedValue,float ActualValue ) {
		softAssert.assertEquals(ExpectedValue ,ActualValue );
	}
	public void AssertValue (char ExpectedValue,char ActualValue ) {
		softAssert.assertEquals(ExpectedValue ,ActualValue );
	}
	public void AssertValues(Object ExpectedValue, Object ActualValue) {
		softAssert.assertEquals(ExpectedValue, ActualValue);
	}

	
	public void AssertValues(String ExpectedValue, String ActualValue) {
		softAssert.assertEquals(ExpectedValue, ActualValue);
	
}
}