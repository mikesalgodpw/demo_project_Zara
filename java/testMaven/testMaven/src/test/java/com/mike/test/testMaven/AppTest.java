package com.mike.test.testMaven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/*
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
*/



/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    	//assertTrue( false );
        
        //assertEquals(5, Example1.getNumber());
        //assertEquals(5, Example1.getNumber());
    }
    
    /*
    @BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Set Up Before Class - @BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down After Class - @AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Set Up @BeforeEach");
	}
	*/
    
    
/*    @Test            
    public void testNumber() {                         
       assertEquals(5, Example1.getNumber());            
    }
    @Test            
    public void testMeaningfulText () {                         
       assertEquals(“Hello World”, Exampe1.getMeaningfulText ());            
    }    
    */
}
