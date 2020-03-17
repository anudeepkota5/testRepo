package junitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(testMath.class);
		System.out.println("Total number of Test cases"+result.getRunCount());
		System.out.println("Total number of Test Falure" + result.getFailureCount());
		
		for(Failure failure: result.getFailures()){
			System.out.println(failure.getMessage());
		}
	}

}
