package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HelloWorld;

public class UnitTest1 {
	
	@Test
	public void TestMethod1(){
		Assert.assertEquals("Hello World", HelloWorld.CreateMessage());
	}

}
