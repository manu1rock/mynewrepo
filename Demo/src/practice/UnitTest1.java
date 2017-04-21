package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest1 {
	
	@Test
	public void TestMethod1(){
		Assert.assertEquals("Hello World", HelloWorld.CreateMessage());
	}

}
