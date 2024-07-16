import org.testng.annotations.Test;

public class TestngTestCases {

	@Test(enabled = true, groups = { "UPEG" })
	public void test1() {
		System.out.println("testcase1-upeg");
	}

	@Test(enabled = true, groups = { "UPEG" })
	public void test2() {
		System.out.println("testcase2-upeg");
	}

	@Test(enabled = true, groups = { "UPEG" })
	public void test3() {
		System.out.println("testcases3-upeg");
	}

	@Test(enabled = true, groups = { "UPEG" })
	public void test4() {
		System.out.println("testcase4-upeg");
	}

	@Test(enabled = true, groups = { "UPEG" })
	public void test5() {
		System.out.println("testcase5-upeg");
	}
}
