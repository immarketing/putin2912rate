package ru.algo.putin2012.client;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(Putin2012Test.class);
		//$JUnit-END$
		return suite;
	}

}
