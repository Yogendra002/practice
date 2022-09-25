package stest;

import org.testng.annotations.Test;

public class FirstAppiumProject extends BaseClass{
	
	@Test
	public void test() {
		driver.get("https://google.com");
	}

}
