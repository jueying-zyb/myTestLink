package com.zyb.test;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {
	
	@Test
	public void test001() {
		System.out.println("test001");
	}
	
	@Test
	public void test002() {
		System.out.println("test002");
	}
	
	@Test
	public void test003() {
		System.out.println("test003");
		Assert.assertEquals("1", "2","1和2不相等.");
	}

}
