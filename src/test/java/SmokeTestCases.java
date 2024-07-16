import org.testng.annotations.Test;

public class SmokeTestCases {
	@Test(enabled = true, groups = { "acceptance-smoke" })
	public void test1() {
		System.out.println("testcase1-smoke");
	}

	@Test(enabled = true, groups = { "acceptance-smoke" })
	public void test2() {
		System.out.println("testcase2-smoke");
	}

	@Test(enabled = true, groups = { "acceptance-smoke" })
	public void test3() {
		System.out.println("testcase3-smoke");
	}

	@Test(enabled = true, groups = { "acceptance-smoke" })
	public void test4() {
		System.out.println("testcase4-smoke");
	}

	@Test(enabled = true, groups = { "acceptance-smoke" })
	public void test5() {
		System.out.println("testcase5-smoke");
		System.out.println("testcase5-smoke");
	}
}
