
import org.testng.annotations.Test;

public class RegressionTestCases {

	@Test(enabled = true, groups = { "acceptance-regression1" })
	public void test1() {
		System.out.println("testcase1-regression1");
	}

	@Test(enabled = true, groups = { "acceptance-regression1" })
	public void test2() {
		System.out.println("testcase2-regression1");
	}

	@Test(enabled = true, groups = { "acceptance-regression1" })
	public void test3() {
		System.out.println("testcase3-regression1");
	}

	@Test(enabled = true, groups = { "acceptance-regression1" })
	public void test4() {
		System.out.println("testcase4-regression1");
	}

	@Test(enabled = true, groups = { "acceptance-regression1" })
	public void test5() {
		System.out.println("testcase5-regression1");
	}

}
