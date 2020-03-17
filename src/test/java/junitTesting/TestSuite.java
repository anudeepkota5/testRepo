package junitTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	testMath.class,
	testMath2.class
})
public class TestSuite {

}
