package demoApp;

import demoApp.StatisticsEngine;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestStatisticEngine  extends TestCase{
    /**
     * Create the test case
     *
     * @param EngineTests name of the test case
     */
    public TestStatisticEngine( String testName )
    {
        super( testName );
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestStatisticEngine.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testChangeOfDemoFailing(){
    	StatisticsEngine testEngine = new StatisticsEngine();
    	
    	assertEquals(500,testEngine.changeOfDemoFailing(10));
    }
    
}
