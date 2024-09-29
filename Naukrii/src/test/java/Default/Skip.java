package Default;

import org.testng.annotations.Test;

public class Skip {

	@Test(priority =5, enabled = false)
	public void Test1() {
		System.out.println("Test1");
	}

	@Test(priority =4,  alwaysRun = true)
	public void ATest2() {
		System.out.println("Test2");
	}

	@Test(priority =4, groups = "A1")
	public void Test3() {
		System.out.println("Test3");
	}

	@Test(priority =3,  groups = "A1")
	public void Test4() {
		System.out.println("Test4");
	}

	@Test(priority =2, dependsOnMethods = "Test4")
	public void Test5() {
		System.out.println("Test5");
	}

	@Test(priority =1)
	public void Test6() {
		System.out.println("Test6");
	}

}
