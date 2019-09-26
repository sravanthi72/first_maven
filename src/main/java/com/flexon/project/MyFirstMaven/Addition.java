package com.flexon.project.MyFirstMaven;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
//import org.junit.

public class Addition {
	
	
	@Test
	public void testSum(){
		System.out.println("sum");
		Integer x = 15;
		Integer y = 15;
		Integer expResult = 30;
		Integer result = Calculator.sum(x, y);
		assertEquals(expResult, result);
		assertEquals(null, Calculator.sum(15, null));
		assertEquals(null, Calculator.sum(null, 15));
		assertEquals(null, Calculator.sum(null, null));
		}
	@Test
	public void testSubstract(){// hello
		System.out.println("substract");
		System.out.println("hello");
		Integer x = 10;
		Integer y = 5;
		Integer expResult = 5;
		Integer result = Calculator.sub(x, y);
		assertEquals(expResult, result);
		assertEquals(null, Calculator.sub(15, null));//.sub(15, null));
		assertEquals(null, Calculator.sub(null, 15));
		assertEquals(null, Calculator.sub(null, null));
		}
}
