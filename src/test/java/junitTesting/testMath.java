package junitTesting;

import static org.testng.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testMath extends Base{
	
	MathProvider provider;
	
	public testMath(){
		provider = new MathProvider();
	}
	
	@Before
	public void before(){
		System.out.println("Before2");
	}
	
	@Test
	public void testAdd(){
		System.out.println("Start Test");
		int a = 10;
		int b = 20;
		assertEquals(a+b+1, provider.Add(a, b));
		System.out.println("END TEST");
	}
	
	@Test
	public void testsub(){
		System.out.println("Start Test");
		int a = 10;
		int b = 20;
		assertEquals(provider.Subtract(a, b), a-b);
		System.out.println("END TEST");
	}
	
	@Test
	public void testmul(){
		System.out.println("Start Test");
		int a = 10;
		int b = 20;
		assertEquals(provider.Mul(a, b), a*b);
		System.out.println("END TEST");
	}

}
