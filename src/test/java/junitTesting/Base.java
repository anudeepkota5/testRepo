package junitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Base {
	
	@BeforeClass
	public static void beforeTest(){
		System.out.println("Before Class");
	}
	
	@Before
	public void before2(){
		System.out.println("Before Test");
	}
	
	@After
	public void After(){
		System.out.println("After Test");
	}
	
	@AfterClass
	public static void afterclass(){
		System.out.println("After Class");
	}

}
