package junitTesting;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testMath2 extends Base{
	
	MathProvider provider;
	
	public testMath2(){
		provider = new MathProvider();
	}	
	
	@Test
	public void testAdd(){
		System.out.println("Start Test");
		int a = 10;
		int b = 20;
		assertEquals(provider.Add(a, b), a+b+1);
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
