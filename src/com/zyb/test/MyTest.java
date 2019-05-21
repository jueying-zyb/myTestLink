package com.zyb.test;

import org.junit.Assert;
import org.junit.Ignore;
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
		Assert.assertEquals("1", "2","1 should equal 2");
		System.out.println("test003");
	}
	
	@Test
	public void test004() {
		System.out.println("test004");
	}
	
	@Test
	public void test005() {
		System.out.println("test005");
	}

}
